package java04_control.forQuiz;

public class ForQuiz_03 {
//	- 1���� 1000������ �����߿��� 4�� �����
//	 6���� ����� �������� 1�� ���� ���� ����϶�.
	public static void main(String[] args) {

		int total = 0;
		
		for(int i=1; i<=1000; i++) {
			if( i%4==1 && i%6==1 ) {
				total+=i;
			}
		}
		System.out.println(total);
	}
}










