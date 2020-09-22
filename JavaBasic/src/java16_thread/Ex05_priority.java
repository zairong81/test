package java16_thread;

public class Ex05_priority extends Thread {
	
	private int idx; //������ �ε���
	
	//������
	public Ex05_priority(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx + " ������ ����");
		
		for(int i=0; i<500; i++)
			System.out.print(idx);
		
		System.out.println(idx + " ������ ��");
	}
	
	public static void main(String[] args) {
		System.out.println("Main ������ ����");
		
		Ex05_priority t1 = new Ex05_priority(1);
		Ex05_priority t2 = new Ex05_priority(2);
		Ex05_priority t3 = new Ex05_priority(3);
		
		// �ڹ��� Thread��
		//Round Robin�˰���(��ȯ�Ҵ�)��
		//Priority(�켱����)�� �����ؼ�
		//������ �����ٸ��� �Ѵ�
		
		//�켱���� ����
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MAX_PRIORITY); //10
		
		//������ Ȱ��ȭ
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ������ ��");
	}
}















