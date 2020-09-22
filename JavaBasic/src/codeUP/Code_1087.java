package codeUP;

import java.util.Scanner;

//1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
//그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
//
//즉, 1부터 n까지 정수를 계속 더한다고 할 때,
//어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.
//
//하지만, 이번에는 그 때의 합을 출력해야 한다.
//
//예를 들어 57을 입력하면
//1+2+3+...+8+9+10=55에 다시 11을 더해 66이 될 때,
//그 값 66이 출력되어야 한다.

public class Code_1087 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수 입력: ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		int sum = 0; //num과 비교될 변수
		int i = 0; //sum에 순서대로 더해질 변수
		
		while(sum < num) { //sum이 num보다 작은 경우에만 실행
			i++;
			sum += i;
		}
		System.out.println(sum);

	}
}
