package java06_class.method.quiz;

public class Calculator {

	//����
	public int sum(int n1, int n2) {
		return n1+n2;
	}

	//����
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	
	//����
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	
	//������
	public double div(double n1, double n2) {
		if( n2 != 0 ) {
			return n1/n2;
		} else {
			System.out.println("[ERROR] 0���� ���� �� �����ϴ�");
			return 0.0;
		}
	}
	
}













