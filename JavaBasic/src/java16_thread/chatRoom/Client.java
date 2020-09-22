package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Client c = new Client();
		c.initClient(); //Ŭ���̾�Ʈ �ʱ�ȭ
	}

	private final String HOST = "localhost";
	private final int PORT = 9988;

	private String clientID; // Ŭ���̾�Ʈ�� ���̵�
	
	// Ŭ���̾�Ʈ �ʱ�ȭ �޼ҵ�
	public void initClient() {
		try {
			// ���ϻ���, ������ �����ϱ�
			Socket sock = new Socket(HOST, PORT);
			
			// Sender, Receiver Ȱ��ȭ
			chat(sock);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Sender Receiver ������ Ȱ��ȭ
	public void chat(Socket sock) {
		Receiver receiver = new Receiver(sock);
		receiver.start();
		
		Sender sender = new Sender(sock);
		sender.start();
	}

	// Receiver ������ Ŭ����
	class Receiver extends Thread {
		private Socket sock;
		private BufferedReader reader;
		
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			
			// ���� �Է� -> ����� ���
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg;
				while( (msg = reader.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	// Sender ������ Ŭ����
	class Sender extends Thread {
		private Socket sock;
		private PrintWriter writer;
		private BufferedReader reader;
		
		public Sender(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				// Ű���� �Է� -> ���� ��� 
				writer = new PrintWriter(sock.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(System.in));
				
				// Ŭ���̾�Ʈ�� ���̵� �Է��ϱ�
				//	ex) alice �Է��ϸ�
				//		���̵�� alice�� �Էµǰ�
				//		�������� CLIENT_ID_IS_alice �� ����
				//		( CLIENT_ID_IS_ �� ���Ƿ� ������
				//		�α��� �޽����� ��Ÿ���� Ű���� )
				System.out.print("����� ID�� �Է��ϼ��� : ");
				clientID = reader.readLine();
				writer.println("CLIENT_ID_IS_" + clientID);
				
				// exit�� �Է��ϱ� ������
				// �Էµ� �޽����� ������ ����
				while(true) {
					String msg;
					msg = reader.readLine();

					if("exit".equals(msg)) {	break; }
					
					writer.println(msg);
				}
				
				writer.close();
				reader.close();
				sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
