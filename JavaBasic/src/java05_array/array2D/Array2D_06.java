package java05_array.array2D;

public class Array2D_06 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println("���� : " + arr.length);
		
		int[] backup = arr;
		
		arr = new int[3];
		System.out.println("���� : " + arr.length);

		// int[3]�� ������� ���ο� �迭�� �����ϸ鼭
		//������ int[5] �迭�� �ƹ��� �������� �ʰ� �ȴ�
		
		// �̷��� �ƹ��� �������� �ʴ� �����Ҵ������ GC�� �����Ѵ�
		//	Garbage Collector
	}
}













