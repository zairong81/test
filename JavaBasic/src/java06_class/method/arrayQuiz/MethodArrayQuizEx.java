package java06_class.method.arrayQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		MethodArrayQuiz maq = new MethodArrayQuiz();
		
		int[] arr = {1,2,3,4,5};
		//1. �迭�� ��� ��� 10��(����, main�� arr�� �����)
		maq.mul10(arr);
		
		//2. �迭�� ��� ��� ���
		maq.print(arr);
		
		
		System.out.println("------------------------");
		int[] arr2 = {6,7,8,9,10};
		
		//1.�����迭(main�� arr2)�� �״�� �ΰ�
		//	��� ��Ҹ� 10���� ���ο� �迭(�������� ����) ��ȯ
		int[] res = maq.mul10_v2(arr2);
		
		//2. �迭�� ��� ��� ���
		maq.print(arr2);
		maq.print(res);
		
	}
}






