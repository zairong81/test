package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_02 {
//	- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//	약수 = 어떤 수를 정수로 나눌 수 있는 수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input >> ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if( num%i == 0 ) {
				System.out.print(i + " ");
			}
		}
		
	}
}










