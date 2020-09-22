package java16_thread;

import java.util.Random;

public class Ex04_join extends Thread {

	private int idx; //������ �ε���
	
	public Ex04_join(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx + " ������ ����");
		
		Random ran = new Random();
		try {
			// 0~3000�и����� ������ Sleep
			Thread.sleep(ran.nextInt(3000));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(idx + " ������ ��");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main ������ ����");

		Ex04_join t1 = new Ex04_join(1);
		Ex04_join t2 = new Ex04_join(2);
		Ex04_join t3 = new Ex04_join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			// join() - �ٸ� �������� ���Ḧ ��ٸ����ϴ� �޼ҵ�
			//	Main Thread�� t1, t2, t3 �������� ���Ḧ ��ٸ���
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ������ ��");
		
	}

}














