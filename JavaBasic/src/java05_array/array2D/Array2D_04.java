package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		//1~3�г�
		//2����
		//4���� �л�
		//3����
		//����
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		// -----------------------------------------------
		
		// 2���� ����, ����, ���� ������ �����ϴ� �迭
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //2���� ���� �迭
		double[] avg = new double[2]; //2���� ��� �迭
		
		// --- 2���� �л����� 3���� ���� �Է¹ޱ� ---
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"����", "����", "����"};
		for(int i=0; i<sco.length; i++) { // i��° �л�
			for(int j=0; j<sco[i].length; j++) { // j��° ����
				System.out.print( (i+1) + "�� �л��� " + subject[j] + " ���� : " );
				sco[i][j] = sc.nextInt();
			}
			System.out.println(); //�л��� ���� �Է� ���̿� �� �ٲ�(����)
		}
		// ------------------------------------------
//		//TEST
//		for(int i=0; i<sco.length; i++) { // i��° �л�
//			for(int j=0; j<sco[i].length; j++) { // j��° ����
//				System.out.print(sco[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// --- ���� ����ϱ� ---
		for(int i=0; i<sum.length; i++) { // i��° �л�
			for(int j=0; j<sco[i].length; j++) { //j��° ����
				sum[i] += sco[i][j];
			}
		}
		// ---------------------
//		// TEST
//		for(int i=0; i<sum.length; i++) { // i��° �л�
//			System.out.print(sum[i] + " ");
//		}
//		System.out.println();
		
		// --- ��� ����ϱ� ---
		for(int i=0; i<avg.length; i++) { // i��° �л�
			avg[i] = sum[i] / (double)3;
		}
		// ---------------------
//		//TEST
//		for(int i=0; i<avg.length; i++) { // i��° �л�
//			System.out.print(avg[i] + " ");
//		}
//		System.out.println();
		
		// --- ���� ��� ---
		//	ex)	��ȣ	����	����	����	����	���
		//		1��		xxx		xxx		xxx		xxx		xxx
		//		2��		xxx		xxx		xxx		xxx		xxx
		// -----------------
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		for(int i=0; i<sco.length; i++) { //i��° �л�
			System.out.print(i+1 + "��"); //��ȣ ���
			
			for(int j=0; j<sco[i].length; j++) { //3���� ���� ���
				System.out.print("\t" + sco[i][j]);
			}
			
			System.out.print("\t" + sum[i]); //���� ���
			
			System.out.println("\t" + avg[i]); //��� ���
		}
	}
}












