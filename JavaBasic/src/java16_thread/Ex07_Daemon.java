package java16_thread;

class Daemon implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " HI");
		}
	}
}

public class Ex07_Daemon {
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		
		Daemon daemon = new Daemon(); // Runnable ��ü ����
		
		Thread th = new Thread(daemon); //Thread ��ü ����
		
		th.setDaemon(true); // ���� ������� �����ϱ�
		
		th.start(); // ������ Ȱ��ȭ
		
		System.out.println("--- Main End ---");
	}
}












