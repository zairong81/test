package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_04 {
//	- �Է¹��� �μ��� �ּ� ������� �ִ� ������� ���ϴ�
//	 ���α׷��� �ۼ��϶�.
//		�ּҰ���� = ����� �߿��� ���� ���� ����
//		�ִ����� = ����� �߿��� ����ġ�� ���� ū ��	public static void main(String[] args) {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Input Number 2 : ");
		int n2 = sc.nextInt();

		
		int lcm=0; //�ּҰ����
		int max = n1>n2 ?n1 : n2;
		for( int i=max; true; i++ ) {
			if( i%n1==0 && i%n2==0 ) {
				lcm = i;
				break;
			}
		}
		
		
		int gcd=0; //�ִ�����
		int min = n1<n2 ?n1 :n2;
		for( int i=1; i<=min; i++ ) {
			if( n1%i==0 && n2%i==0 ) {
				gcd = i;
			}
		}
		
		System.out.println("�ּҰ���� : "+lcm);
		System.out.println("�ִ����� : "+gcd);
	}
}










