package java04_control.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu_answer {
//	- �޴� �����
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World ���
//		2. �̸� ���
//		3. ���� ���
//		4. ����
//	===============================
//
//	  >> _
//
//	 -> �� �޴��� �Է��ϸ� �޴��� �˸°� �����ϵ��� �ۼ�
	
	public static void main(String[] args) {
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		Scanner sc = new Scanner(System.in); //�Է°�ü
		
		int select; //�޴� ���� ����
		
		System.out.println("===============================");
		System.out.println("\tM  e  n  u");
		System.out.println("===============================");
		System.out.println("\t1. Hello World ���");
		System.out.println("\t2. �̸� ���");
		System.out.println("\t3. ���� ���");
		System.out.println("\t4. ����");
		System.out.println("===============================");
		
		System.out.println();
		System.out.print("\t>> ");
		
		select = sc.nextInt();
		
		System.out.print("\n\t>>");
		switch(select) {
		case HELLO_MENU: //Hello World ���
			System.out.println("Hello World");
			break;
		
		case GENDER_MENU: //���� ���
			System.out.println("Female");
			break;
			
		case NAME_MENU: //�̸� ���
			System.out.println("Alice");
			break;
			
		case EXIT_MENU: //����
			System.out.println("Good Bye~");
			break;
			
		default:
			System.out.println("�߸��� �޴��� �����߽��ϴ�");
		}
		
	}
}














