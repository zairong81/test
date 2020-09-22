package codeUP;

import java.util.Scanner;

//입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
//비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.

public class Code_1061 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a|b);
		
	}
}
