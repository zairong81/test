package java14_io.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyNote {
	
	private Scanner sc = new Scanner(System.in);
	
	//��Ʈ ���� ���
	private static final String path = "./src/java14_io/quiz/note";
	
	public MyNote() { }
	
	public void fileSave() {
		System.out.println(" + + ���ο� ��Ʈ + +");
		System.out.println();
		
		
		// ----- ��Ʈ �Է� �ޱ� -----
		System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�");

		StringBuilder sb = new StringBuilder(); //��Ʈ
		String str = null; //��Ʈ �ӽ� ����

		while( true ) {
			str = sc.nextLine(); //�Է��� ���ڿ� �� ��
			
			if("exit".equals(str))	break; // "exit"�� �Է��� ������ �ݺ�
			
			sb.append(str); //��Ʈ ������ ����
			sb.append('\n'); //���� �߰�
		}
		// -------------------------
		

		// ----- ��Ʈ ���� �ǻ� ���� -----
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		
		char input = sc.nextLine().charAt(0); // y/n ���� ����
		
		if( input != 'y' && input != 'Y' ) { // 'y'/'Y' �� �ƴϸ� �ߴ�
			return;
		}
		// ------------------------------
		
		
		// ----- ��Ʈ ���ϸ� �Է¹ޱ� -----
		System.out.print("������ ���ϸ�(.txt �ڵ�����) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //��Ʈ ������ ����
		// ------------------------------

		
		// ----- ��� ��Ʈ�� -----
		PrintWriter out = null;
		// -------------------------

		
		try {
			// ----- ��Ʈ ���� �����ϱ� -----
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)), true); //autoFlush
			
			out.append(sb, 0, sb.length()); //��Ʈ ����
			
			//��Ʈ ���� ����
			System.out.println();
			System.out.println("\t>> " + filename + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
			// ------------------------------
			
		} catch (IOException e) {
//			e.printStackTrace();

			//��Ʈ ���� ��Ʈ�� ���� ����
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt ������ �������� ������ �ƴմϴ�.");

		} finally {
			if(out!=null)	out.close(); //��Ʈ�� �ݱ�
		}
	} // fileSave() ��
	
	
	
	public void fileOpen() {
		System.out.println(" + + ��Ʈ �ҷ����� + +");
		System.out.println();

		
		// ----- ��Ʈ ���ϸ� �Է¹ޱ� -----
		System.out.print("������ ���ϸ�(.txt ����) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //��Ʈ ������ ����
		if( !file.exists() || !file.isFile() ) { //������ �ƴϰų� ������ �ߴ�
			System.out.println();
			System.out.println("\t>> [SYSTEM] ���ϸ��� �߸��Ǿ����ϴ�");
			return;
		}
		// ------------------------------

		
		// ----- �Է� ��Ʈ�� -----
		BufferedReader in = null;
		// -------------------------

		
		try {
			// ----- ��Ʈ �ҷ����� -----
			in = new BufferedReader(new FileReader(file));

			String str = null;
			while( (str=in.readLine()) != null ) {
				System.out.println(str);
			}
			// -------------------------

			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			
			//��Ʈ ���� �ҷ����� ����
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt ������ �ҷ����� �� �����Ͽ����ϴ�.");

		} catch (IOException e) {
//			e.printStackTrace();
			
			//��Ʈ ���� �б� ����
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt ������ �о���� �� �����ϴ�.");

		} finally {
			try {
				if(in!=null)	in.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
//				e.printStackTrace();
				
				System.out.println();
				System.out.println("\t>> [SYSTEM] �����б⸦ ���������� ������ �� �����ϴ�.");
			}
		}
	} // fileOpen() ��
	
	
	
	public void fileEdit() {
		System.out.println(" + + ��Ʈ �����ϱ� + +");
		System.out.println();
		
		
		// ----- ��Ʈ ���ϸ� �Է¹ޱ� -----
		System.out.print("������ ���ϸ�(.txt ����) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //��Ʈ ������ ����
		if( !file.exists() || !file.isFile() ) { //������ �ƴϰų� ������ �ߴ�
			System.out.println();
			System.out.println("\t>> [SYSTEM] ���ϸ��� �߸��Ǿ����ϴ�");
			return;
		}
		// ------------------------------

		
		// ----- ����� ��Ʈ�� ���� -----
		BufferedReader in = null;
		PrintWriter out = null;
		// -------------------------
		
		
		try {
			// ----- ���� ���� ���� �о���� -----
			in = new BufferedReader(new FileReader(file));
			
			int len = -1;
			char[] cbuf = new char[1024];
			StringBuilder sb = new StringBuilder();
			while( (len = in.read(cbuf)) != -1 ) {
				sb.append(cbuf, 0, len);
			}
			// -----------------------------------

			
			// ----- ��Ʈ ������� �Է� �ޱ� -----
			String str = null; //��Ʈ �ӽ� ����
			while( true ) {
				str = sc.nextLine(); //�Է��� ���ڿ� �� ��
				
				if("exit".equals(str))	break; // "exit"�� �Է��� ������ �ݺ�

				sb.append(str); //��Ʈ ������ ����
				sb.append('\n'); //���� �߰�
			}
			// -----------------------------------
			
			
			// ----- ��Ʈ ���� �ǻ� ���� -----
			System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n) : ");
			char input = sc.nextLine().charAt(0); // y/n ���� ����
			if( input != 'y' && input != 'Y' ) { // 'y'/'Y' �� �ƴϸ� �ߴ�
				return;
			}
			// ------------------------------
			
			
			// ----- ���� ���� �ݿ��ϱ� -----
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)), true);//autoFlush
			
			out.append(sb); //���泻�� ����
			
			//��Ʈ ���� ����
			System.out.println();
			System.out.println("\t>> " + filename + ".txt ������ ������ ����Ǿ����ϴ�.");
			// ------------------------------
			
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			
			//��Ʈ ���� �ҷ����� ����
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt ������ �ҷ����� �� �����Ͽ����ϴ�.");
			
		} catch (IOException e) {
//			e.printStackTrace();
			
			//��Ʈ ���� ��Ʈ�� ���� ����
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt ������ �������� ������ �ƴմϴ�.");

		} finally {
			try {
				if(in!=null)	in.close(); //�Է� ��Ʈ�� �ݱ�
			} catch (IOException e) {
//				e.printStackTrace();
				
				System.out.println();
				System.out.println("\t>> [SYSTEM] �����б⸦ ���������� ������ �� �����ϴ�.");
			}
			
			if(out!=null)	out.close(); //��� ��Ʈ�� �ݱ�
		}
	} // fileEdit() ��
	
}





