package java16_thread.sync;

class SyncTest02 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) { //����ȭ ���
			for(int i=1; i<=100; i++) {
				this.total += i;
				System.out.println(i + "�� ���ϱ�");
			}
		}
		
//		action(this); //����ȭ �޼ҵ� ȣ��
		
	}
	
//	public synchronized void action(SyncTest02 st) { //����ȭ �޼ҵ�
//		for(int i=1; i<=100; i++) {
//			st.total += i;
//			System.out.println(i + "�� ���ϱ�");
//		}
//	}
}

public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		
		SyncTest02 st = new SyncTest02();
		st.start(); //������ Ȱ��ȭ, 1~100 ���� ����
		
		synchronized (st) { //����ȭ ���
			
			try {
				st.wait(); //�����带 ����ȭ �����·� �����
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("1~100�� �� : " + st.total); //��� ���
		}
		
//		action(st); //����ȭ �޼ҵ� ȣ��
	}
	
	//����ȭ �޼ҵ�
//	public synchronized static void action(SyncTest02 st) {
//		System.out.println("1~100�� �� : " + st.total); //��� ���
//	}
	
}












