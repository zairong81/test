package codeUP;

import java.util.Scanner;

//1, 2, 3 ... 을 계속 더해 나갈 때,
//그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
//계속 더하는 프로그램을 작성해보자.
//
//즉, 1부터 n까지 정수를 계속 더한다고 할 때,
//어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.

public class Code_1080 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int sum = 0, i= 0;
		
		while(sum < num) {
			i++;
			sum += i;
		}
		System.out.println(i);
		sc.close();
		
	}
}
