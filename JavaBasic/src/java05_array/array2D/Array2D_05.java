package java05_array.array2D;

import java.util.Scanner;

public class Array2D_05 {
	public static void main(String[] args) {

		//new
		//	���� �Ҵ� ������
		
		//�����Ҵ�
		//�����Ҵ�
		//	�Ҵ� : �������� ����(������� ����)
		
		//	���� : ���� ��, Compile-time
		//	���� : ���� ��, ���� ��, Run-time
		
		int num; //int�� ���� ���� -> ���� �Ҵ�
		
		int[] arr; //int�� �迭 ���� ���� -> ���� �Ҵ�
		arr = new int[5]; //int[5] �迭 ���� -> ���� �Ҵ�
		
		//-----------------------------------------
		
//		int[] arr2 = new int[-5];
		// �迭�� ����� ���ÿ� �����ϴ� �ڵ��
		//������ ����� �迭�� ������ �ѹ��� �ۼ�������
		//���� �����ϴ� ������ �ٸ���(�����Ҵ�, �����Ҵ�) 
		
		//-----------------------------------------
		
		int[][] arr3 = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(i+"�� �迭�� ũ���? ");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}
	}
}













