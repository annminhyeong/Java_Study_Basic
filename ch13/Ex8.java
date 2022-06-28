package ch13;
//���� ������
//�Ϲ� �������� �۾��� ���� �������� ������
//�Ϲ� �����尡 ����Ǹ� �ڵ������� ����ȴ�.
//������ �÷���, �ڵ�����, ȭ�� �ڵ����� � ���ȴ�.
//���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϴٰ� Ư�������� �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ��Ѵ�.
//
//boolean isDaemon() : �����尡 ���� ���������� Ȯ���Ѵ�.
//void setDaemon(boolean on) : �����带 ���� ������ �Ǵ� ����� ������� ����, �Ű����� on�� true�� �����ϸ� ���󾲷��尡 �ȴ�
//
//setDaemon(boolean on)�� �ݵ�� start()�� ȣ���ϱ� ���� ����Ǿ���Ѵ�. �׷��� ������ IllegalThreadStateException�� �߻��Ѵ�.


public class Ex8 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		//Thread(Runnable r) : Runnable�������̽��� ������ Ŭ���� �ֱ�
		Thread t = new Thread(new Ex8());
		
		//���󾲷���� ����
		//�̺κ��� ������ ������� �ʴ´�.
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i ==5)autoSave = true;
		}
		System.out.println("���α׷� ������ ����Ǿ����ϴ�.");

		
	}
	
	@Override
	public void run() {
		
		//main(�����)�����尡 ����Ǹ� ���󾲷���� �����
		//���ѷ���
		while (true) {
			try {
				//3�ʸ���
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {}
			if(autoSave) autoSave();
		}
	}
	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}
}
