package codeUP;

import java.util.Scanner;

public class Code_1068{
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 90) { //점수가 90이상일 경우
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
	}
}
