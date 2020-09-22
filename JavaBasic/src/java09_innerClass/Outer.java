package java09_innerClass;

public class Outer {
	public int num = 10; //인스턴스 변수
	
	public void print() {
		System.out.println("멤버 메소드");
	}
	
	
	//멤버중첩클래스의 객체
	public MemberInner mi = new MemberInner();
	
	//멤버(인스턴스) 중첩 클래스
	public class MemberInner {
		public int num = 20;
		
		public void print() {
			System.out.println("멤버 중첩 클래스");
		}
	}
	
	//------------------------------------------------
	
	public static int staticNum = 30; //정적 변수
	
	public static void display() {
		System.out.println("정적 메소드");
	}
	
	//정적 중첩 클래스
	public static class StaticInner {
		public static int num = 40;
		
		public static void out() {
			System.out.println("정적 중첩 클래스");
		}
	}
	
	// ------------------------------------------------
	
	//멤버 메소드
	public void out() {
		
		int num = 50; //지역변수
		
		class LocalInner { //지역 중첩 클래스
			public int num = 60;
			public void out() {
				System.out.println("지역 중첩 클래스");
			}
		}
		
		LocalInner li = new LocalInner();
		System.out.println( li.num );
		li.out();
	}
	
}














