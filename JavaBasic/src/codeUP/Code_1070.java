package codeUP;

import java.util.Scanner;

//월이 입력될 때 계절 이름이 출력되도록 해보자.
//
//예
//월 : 계절 이름
//12, 1, 2 : winter
//  3, 4, 5 : spring
//  6, 7, 8 : summer
//  9, 10, 11 : fall

public class Code_1070 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("월을 의미하는 1개의 정수 입력(1~12): ");
		int month = sc.nextInt();
		sc.close();
		
		switch(month) { 
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
			
		default:
			System.out.println("fall");
			break;
		}
		
	}
}
