package java10_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int com; //��ǻ���� ��
		int user; //������� ��
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("=============START=============");
		com = ran.nextInt(50)+1; //��ǻ�� ���� ����

		for(int j=0; j<7; j++) { //7�� �ݺ�
			//������� ����
			while(true) {
				System.out.print("1~50 �� �ϳ� �Է� : ");
				user = sc.nextInt();
				
				if (1<=user && user<=50)
					break;
				else
					System.out.println("1~50 !!");
				
			}
			
			if(user==com) {
				System.out.println("�̰���ϴ�.");
				return;
			} else if(user>com) {
				System.out.println("Down");
			} else if(user < com) {
				System.out.println("Up");
			}
		}

		System.out.println("����. ��ǻ�ʹ� "+com+" �̶�� \n");
	}
}
