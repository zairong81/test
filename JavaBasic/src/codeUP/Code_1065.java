package codeUP;

import java.util.Scanner;

//세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.

public class Code_1065 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 3개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//각각의 정수가 짝수인지를 확인
		if(a%2 == 0) {
			System.out.println(a);
		}
		if(b%2 == 0) {
			System.out.println(b);
		}
		if(c%2 == 0) {
			System.out.println(c);
		}
		
	}
}
