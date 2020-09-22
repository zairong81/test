package java16_thread.sync;

class SyncTest01 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.println(i + "�� ���ϱ�");
		}
	}
}

public class WaitNotifyEx_01 {
	public static void main(String[] args) {
		
		SyncTest01 st = new SyncTest01();
		st.start(); //������ Ȱ��ȭ, 1~100 ���� ����
		
		// Main �����尡 st �������� ���ۿϷ�(���� ����) �������� ��ٸ�
		try {
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100�� �� : " + st.total); //��� ���
		
	}
}












