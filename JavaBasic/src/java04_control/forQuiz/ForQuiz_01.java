package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_01 {
//	- ������ �� �Է¹��� ���� �ܼ��� ����Ͽ���
//	ex) Input >> 4
//
//	    4 x 1 = 4
//	    4 x 2 = 8
//	    4 x 3 = 12
//	    ....
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input >> ");
		int num = sc.nextInt(); //����� �ܼ�
		
		for(int i=1; i<=9; i++) { //i, 1~9, 9��
			System.out.println(num+"x"+i+"="+(num*i));
		}
		
	}
}












