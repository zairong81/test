package java16_thread.sync;

// 1~100 ���� �����ϴ� ������
public class Input extends Thread {
	
	SyncData data;
	
	public Input(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("--- Input Start ---");
		
		synchronized (data) {
			for(int i=1; i<=100; i++) {
				data.total += i;
			}
			
			data.available = true; //�������Է¿Ϸ� ����
			
			data.notify(); // LOCK ���� ����
//			data.notifyAll(); // LOCK ���� ����
		}
		
		System.out.println("--- Input End ---");
	}
	
}













