package java13_exception;

public class ExceptionEx_03_try {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
		if( num2!=0 ) {
			System.out.println( num1 / num2 ); // divide by zero
		} else {
			System.out.println("[WARN] 나눔수가 0입니다");
		}
		
		System.out.println("--------------------------------");
		
		try {
			System.out.println( num1 / num2 ); // divide by zero
			
		} catch (ArithmeticException e) {
//			e.printStackTrace(); //예외 메시지 확인
			System.out.println("[WARN] 나눔수가 0입니다");
			
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}












