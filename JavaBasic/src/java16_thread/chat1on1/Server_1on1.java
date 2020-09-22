package java16_thread.chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {
	//PORT
	private final int PORT = 10005;
	
	public Server_1on1() {
		ServerSocket serv = null; // ��������
		
		try {
			System.out.println("+ + ���� ���� + +");
			serv = new ServerSocket(PORT);
			
			System.out.println("--- Ŭ���̾�Ʈ ����� ---");
			Socket sock = serv.accept();
			
			InetAddress ip = sock.getInetAddress();
			System.out.println(
				"Ŭ���̾�Ʈ("+ip.getHostAddress()+") ����");
			
			//--- ������ ��� ---
			// ����->Ŭ���̾�Ʈ ���
			// Ŭ���̾�Ʈ->���� ���
			chat(sock);
			//---------------
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void chat(Socket sock) {
		// Sender Thread
		new Sender_1on1(sock).start();
		// keyboard input -> sock output
		
		// Receiver Thread
		new Receiver_1on1(sock).start();
		// sock input -> monitor output
	}
	
	public static void main(String[] args) {
		new Server_1on1();
	}
	
}
















