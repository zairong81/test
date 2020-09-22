package java12_generics;

interface Inter1<T1> {
	void method1(T1 data); 
}

interface Inter2<T2> { 
	void method2(T2 data); 
}

class Class08<E> implements Inter1<E>, Inter2<E> {

	@Override
	public void method1(E data) {
	}

	@Override
	public void method2(E data) {
	}

}

public class GenericsEx_08_Inherit {
	public static void main(String[] args) {
		
		Class08<String> c = new Class08<>();
		
		c.method1("HI");
		c.method2("Hello");
		
	}
}












