package java14_io.quiz;

import java.util.Scanner;

public class TestMyNote {
	
	public static final int SAVE = 1;
	public static final int OPEN = 2;
	public static final int EDIT = 3;
	public static final int EXIT = 4;
	
	public static void main(String[] args) {
		
		menu();
		
	} // main() ��
	
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);

		MyNote note = new MyNote();
		
		int sel = 0; // �޴� ����
		do {
			System.out.println();
			System.out.println("******   MyNote  *******");
			System.out.println("  1. ��Ʈ ���� �����");
			System.out.println("  2. ��Ʈ ����");
			System.out.println("  3. ��Ʈ ��� �����ϱ�");
			System.out.println("  4. ������");
			System.out.println();
			System.out.print("\t>> ");
			
			sel = sc.nextInt();
			
			System.out.println();
			System.out.println();
			switch (sel) {
			case SAVE:
				note.fileSave();
				break;
				
			case OPEN:
				note.fileOpen();
				break;
				
			case EDIT:
				note.fileEdit();
				break;
				
			case EXIT:
				System.out.println("�����մϴ�.");
				break;
			}
			
		} while( sel != EXIT );
	} // menu() ��
	
}
