package java06_class.method.quiz;

import java.util.Scanner;

public class MethodQuizEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MethodQuiz mq = new MethodQuiz();
		
		//Q1. 1~100���
		mq.print100();
		System.out.println("---------");
		
		//Q2. 1~�Է°��������
		System.out.print("�󸶱��� ���? ");
		mq.printHello( sc.nextInt() ); 
		
		//Q3. �Է��� Ƚ����ŭ �Է��� �ؽ�Ʈ ���
		System.out.print("��� ���? ");
		int cnt = sc.nextInt();
		sc.nextLine(); //���� ����
		System.out.print("������ ���? ");
		String text = sc.nextLine();
		mq.printText(cnt, text);
		
	}
}








