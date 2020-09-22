package java16_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread {
	private Socket sock; //��ż���
	
	// �����Է� -> BufferedReader
	private BufferedReader reader;
	
	// �������� -> PrintWriter
	private PrintWriter writer;
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		// �����Է��� �޾Ƽ� ���������� �Ѵ�
		
		// ����� ��� ��Ʈ�� ��ü ����
		writer = new PrintWriter(System.out, true);
		try {
			// ���� �Է� ��Ʈ�� ��ü ����
			reader = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream()));
			
			//--- ���� ��� ---
			while(true) {
				String msg = reader.readLine();
				
				if( msg == null ) {
					System.out.println("���� ������ ����");
					break;
				}
				
				writer.println("���� �޽��� : " + msg);
			}
			//---------------
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("+ + + ��� ���� + + +");
		} finally {
			if(writer!=null)	writer.close();
			try {
				if(reader!=null)	reader.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}















