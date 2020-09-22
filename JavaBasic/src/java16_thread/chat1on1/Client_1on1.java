package java16_thread.chat1on1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	
	private final String HOST = "localhost"; //����ȣ��Ʈ,ip
	private final int PORT = 10005; //������Ʈ
	
	public Client_1on1() {
		Socket sock = null;
		
		try {
			System.out.println("+ + Ŭ���̾�Ʈ ���� + +");
			sock = new Socket(HOST, PORT);
			
			//--- ������ ��� ---
			// ����->Ŭ���̾�Ʈ ���
			// Ŭ���̾�Ʈ->���� ���
			chat(sock);
			//---------------
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
		new Client_1on1();
	}
	
	
}












