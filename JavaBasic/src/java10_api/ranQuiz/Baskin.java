package java10_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class Baskin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int com=0; //��ǻ���� ��
		int user=0; //������� ��
		
		int num=1;
		
		int max = 31;
		
		int winner = 0;
		
		while(num<=max) {
			com = ran.nextInt(3) + 1;
			
			for(int i=0; i<com && num<=max; i++) {
				System.out.println("com : " + num++);
				
				if(num>max)	winner=2;
			}
			
			while(num<=max) {
				System.out.println();
				System.out.print(">> �� ���� ���ӵ� ���ڸ� ���Ͻðڽ��ϱ�? ");
				user = sc.nextInt();

				if(user<1 || user>3) {
					System.out.println();
					System.out.println(">> 1~3������ �Է°����մϴ�. �ٽ�!");
				} else	break;
			}
			
			for(int i=0; i<user && num<=max; i++) {
				System.out.println("user : " + num++);
				if(num>max)	winner=1;
			}
		}
		
		if(winner==1) {
			System.out.println("�� �¸�");
		} else if(winner==2) {
			System.out.println("���� �¸�");
		}
	}
}
