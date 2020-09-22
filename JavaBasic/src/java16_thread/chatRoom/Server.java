package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static void main(String[] args) {
		Server s = new Server();
		
		// �������� ������ ���ִ� �޼ҵ�
		s.initChatRoom();
	}

	private final int PORT = 9988; // ���� ��Ʈ
	
	// Ŭ���̾�Ʈ ��� (��)
	// key - ClientID
	// value - Client PrintWriter
	private Map<String, PrintWriter> writerToClients;
	
	// ä�ù� ���� �ʱ�ȭ
	public void initChatRoom() {
		// �� ����
		writerToClients = new HashMap<String, PrintWriter>();
		
		try {
			// ���� ���� ����
			ServerSocket serv = new ServerSocket(PORT);
			
			// ���������� Ŭ���̾�Ʈ �޾Ƶ��̱�
			while(true) {
				// Ŭ���̾�Ʈ ����
				Socket sock = serv.accept();
				
				// Ŭ���̾�Ʈ �Ŵ��� ���� �� ������ Ȱ��ȭ
				ClientManager manager = new ClientManager(sock);
				manager.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ClientManager extends Thread {
		private Socket sock; // ��� ����
		private String clientID; // Ŭ���̾�Ʈ ���̵�
		
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				// ���� �Է� ��Ʈ��
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				
				String msg; // �Է¹��� �޽���
				while(true) { // �޽��� �ݺ� ó��
					
					// �޽��� �Է¹ް� ȭ�鿡 ���(ä�� ��� ����� : �α�)
					msg = reader.readLine();
					System.out.println(clientID+">"+msg);
					
					// �α׾ƿ� ó��
					if(msg == null) {
						// ���� ��� �����
						System.out.println(clientID + " �α׾ƿ�");

						// �ʿ��� ���̵� ���Ͽ�
						// �޽����� ���� ����� ���̵� �ƴ� ���
						// �α׾ƿ� �޽��� ����
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "���� ä�ù��� �����̽��ϴ�.");
						}

						// ó�� ����
						break;
					}
					
					// key���� �Ǵ� ID �� ���� �ߺ� ó�� �ʿ�
					// �α��� ó��
					String[] res = msg.split("_ID_IS_");
					if(res.length == 2) { // && "CLIENT".equals(res[0])) {
						clientID = res[1]; // Ŭ���̾�Ʈ�� ���̵� �����ϱ�
						System.out.println(clientID + " �α���"); // ���ӱ�� �����
						
						// �ʿ� ������ �߰��ϱ�
						writerToClients.put(
								clientID,	// Key
								new PrintWriter(sock.getOutputStream(), true) // Value
						);
						
						// �ڽ��̿��� Ŭ���̾�Ʈ���� ���� �޽��� ������
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "���� ä�ù��� �����ϼ̽��ϴ�.");
						}
						
						// ���� �޽��� ó���� �ѱ��
						continue;
					}
					
					// �⺻ �޼��� ó��
					// �ڽ� �̿��� Ŭ���̾�Ʈ���� �������ֱ�
					for(String id : writerToClients.keySet()) {
						if(id.equals(clientID)) continue;
						
						writerToClients.get(id).println(clientID + "> " + msg);
					}
				}
				
				// �α׾ƿ� �� ���� ����
				writerToClients.remove(clientID);
				sock.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}




