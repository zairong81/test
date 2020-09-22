package java16_thread;

class Thread02 implements Runnable { //������ Ŭ����
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

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {

		Thread02 th02 = new Thread02();
//		th02.run(); //�Ϲ� �޼ҵ� ȣ�� - ������ �������� ����!!!
		
		//ThreadŬ������ ��ü�� �����Ѵ� - ������ ���� ��ü
		Thread thExecutor = new Thread(th02);
		
		thExecutor.start(); //������ ����(����)

		
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












