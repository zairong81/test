package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1���� �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] arr1D = { 1,2,3,4,5 };
		
		//2���� �迭�� ����� ���ÿ� �ʱ�ȭ
		int[][] arr2D ={
				{ 1,2,3 },
				{ 4,5,6 },
				{ 7,8,9 }
		};
		//3�� 3���� 2���� �迭 ����
		
		
		//2���� �迭�� �� �����ϱ�
		for( int i=0; i<3; i++ ) { //i��
			for( int j=0; j<3; j++ ) { //j��
				arr2D[i][j] = (i+1)*10 + (j+1);
			}
		}
		
		//2���� �迭�� �� ����ϱ�
		for( int i=0; i<3; i++ ) { //i��
			
			for( int j=0; j<3; j++ ) { //j��
				System.out.print(arr2D[i][j] + " "); //�� ���
			}
			
			System.out.println(); //�ึ�� �ٹٲٱ�
		}

	}
}













