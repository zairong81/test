package java06_class.method.quiz;

import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		// �ǿ����� �� �� �Է�
		System.out.print("Input Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Input Number 2 : ");
		int n2 = sc.nextInt();
		
		sc.nextLine(); //���ۺ���
		
		// ������ �Է�
		System.out.print("Input Operator : ");
		char oper = sc.nextLine().charAt(0);
		
//		System.out.println("[TEST]" + n1 +","+ n2 +","+ oper);
		
		//���� Calculator ��ü
		Calculator calc = new Calculator();
		
		switch(oper) {
		case '+':
			System.out.println(n1 + " + " + n2 + " = " + calc.sum(n1, n2) );
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " = " + calc.sub(n1, n2) );
			break;
		case '*':
			System.out.println(n1 + " * " + n2 + " = " + calc.mul(n1, n2) );
			break;
		case '/':
			System.out.println(n1 + " / " + n2 + " = " + calc.div(n1, n2) );
			break;
		}
	}
}













