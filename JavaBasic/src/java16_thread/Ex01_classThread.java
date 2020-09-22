package java16_thread;

class Thread01 extends Thread { //������ Ŭ����
	@Override
	public void run() { //������ �ڵ�
		for(int i=1; i<=100; i++) {
			System.out.println("Thread : " + i);
			
			try {
				Thread.sleep(50);//�����带 50�и��� �Ͻ����� ��Ų��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex01_classThread {
	public static void main(String[] args) {
		
		Thread01 th01 = new Thread01();
//		th01.run(); // �Ϲ� �޼ҵ� ȣ���̴ϱ� ���� �� ��! - ������ �ƴ�
		
		th01.start(); //������ ����
		
		for(int i=1; i<=100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50);//�����带 50�и��� �Ͻ����� ��Ų��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + ���α׷� ���� + + +");
		
	}
}












