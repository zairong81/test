package java16_thread.sync;

// ���� ��� ����ϴ� ������
public class Output extends Thread{

	SyncData data;
	
	public Output(SyncData data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("--- Output Start ---");
		
		synchronized (data) {
			
			//������ �Ϸ���� �ʾ��� ���
			while( !data.available ) {
				try {
					data.wait(); // LOCK �ݳ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("TOTAL : " + data.total);
		}
		
		System.out.println("--- Output End ---");
	}
	
}













