package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_05 {
//	- 1�������� �Էµ� � ������ ���� �ִ� �Ҽ���
//	 ã�� ���α׷��� �ۼ��϶�.
//		* �Ҽ� = 1 �� �ڽ��� ���ڷθ� ������ �������� ��
//		* ex) 2,3,5,7,11,13, ...
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		boolean flag = false; //�Ҽ��Ǻ� �÷���
		
		for(int i=1; i<=num; i++) {
			// ���ܻ�Ȳ : 1�� �Ҽ��� �ƴ� 
			if(i==1) {
				System.out.println(i + " ��/�� �Ҽ��� �ƴ�");
				continue;
			}
			
			flag = false;
			
			// ���� �� ���� ���� �Ҽ� �Ǻ�
			for(int j=2; j<=i-1; j++) {
				if( i%j==0 ) {
					flag = true;
				}
			}
	
			if(flag == true) {
				System.out.println(i + " ��/�� �Ҽ��� �ƴ�");
			} else {
				System.out.println(i + " ��/�� �Ҽ�");
			}
		}
		
	}
}










