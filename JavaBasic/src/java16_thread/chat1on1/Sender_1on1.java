package java16_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {
	private Socket sock; //��� ����
	
	// Ű�����Է� -> BufferedReader
	private BufferedReader reader;
	
	// ������� -> PrintWriter
	private PrintWriter writer;
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		// Ű�����Է� �޾Ƽ� ����������� ������

		// Ű���� �Է� ��ü ����
		reader = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			// ���� ��� ��ü ����
			writer = new PrintWriter(
					sock.getOutputStream(), true);
			
			//--- ���� ��� ---
			while(true) {
				String msg = reader.readLine();//Ű�����Է�
				if( "/EXIT".equals(msg) )	break;//����ߴ�
				writer.println(msg);
			}
			//---------------
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer!=null)	writer.close();
			try {
				if(reader!=null)	reader.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}















