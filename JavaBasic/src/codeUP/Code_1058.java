package codeUP;

import java.util.Scanner;

//두 개의 참(1) 또는 거짓(0)이 입력될 때,
//모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.

public class Code_1058 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력(0,1): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 0 && b == 0){ //둘 다 거짓일 경우 
			System.out.println(1);
		} else { 
			System.out.println(0);
		}
		
	}
}
