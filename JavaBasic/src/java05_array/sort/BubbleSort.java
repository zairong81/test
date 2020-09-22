package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		//���� ����	
		//	1. �� ROUND�� �˰���
		//	 0��° �ε����� ������ 2���� �� (0�ε���, 1�ε���)
		//	������ �����Ͱ� ũ�� �����Ѵ�
		//	 �̷� ������� ������ ��ұ��� ����(�ݺ�)
		
		//	2. 1�� �˰����� �̿��ؼ� ��� ��Ұ� ���ĵ� ������ �ݺ�
		//	 �� ROUND�� ����� ������ 1���� ��Ұ� ���ĵ� ���°� ��
		//	�� ROUND�� ����Ǹ� �����ؾ��ϴ� ����� ���� 1���� �پ��
		
		int[] arr = {3,2,5,4,1};
		
		// --- ���� ��� ---
		System.out.println("--- ���� �� ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// -----------------
		
		// --- ���� ���� ---
		for(int i=0; i<arr.length-1; i++) { //ROUND �ݺ�
			for(int j=0; j<arr.length-1-i; j++) {//�� ROUND �ڵ�, ��������
				if( arr[j] > arr[j+1] ) { //�������� ����
					//����
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
			
			//�� ���� �������� ����غ���
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		// -----------------

		// --- ���� ���� ��� ---
		System.out.println("--- ���� �� ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// -----------------
		
	}
}












