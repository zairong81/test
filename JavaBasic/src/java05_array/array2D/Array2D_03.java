package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {

		int[][] arr;
		arr = new int[3][];
		
//		System.out.println( arr[0][0] ); //NullPointerException
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[8];
		
		System.out.println( arr.length );
		System.out.println("-----");
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("-----");
		
		//�ึ�� ���� ���̰� �������� ���� 2���� �迭�� ���
		for(int i=0; i<arr.length; i++) { //i��
			for(int j=0; j<arr[i].length; j++) { //j��
				System.out.print(arr[i][j] + " "); // int ����
			}
			System.out.println(); //����
		}
	}
}













