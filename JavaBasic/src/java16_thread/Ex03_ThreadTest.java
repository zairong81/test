package java16_thread;

import java.util.Random;

public class Ex03_ThreadTest extends Thread {

	private int idx; //������ �ε���
	
	public Ex03_ThreadTest(int idx) {
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

		for( int i=0; i<10; i++ ) {
			new Ex03_ThreadTest(i).start();
		}
		
		System.out.println("Main ������ ��");
		
	}

}














