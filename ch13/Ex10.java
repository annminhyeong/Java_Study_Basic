package ch13;


//**static ���� �޼���� �ڱ��ڽŸ� ȣ�Ⱑ��**
//static sleep() : ���� �����带 ������ �ð����� ���߰��Ѵ�.
//����ó���� �ؾ��Ѵ�.(�߰��� ���� �����InterruptedException�� �߻���)
//Ư�� �����带 �����ؼ� ���߰� �ϴ� ���� �Ұ����ϴ�.

public class Ex10 {
	public static void main(String[] args) {
		ThreadEx10_1 th1 = new ThreadEx10_1();
		ThreadEx10_2 th2 = new ThreadEx10_2();
		
		th1.start();
		th2.start();
		
		try {
			//sleep() �޼���� static�̹Ƿ� th1 �����尡 ���°��� �ƴ� main�޼��尡 1�ʽ�
			//Thread.sleep(1000);�� ����
			th1.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.print("<<main����>>");
	}
	
	//����ó���� �޼��带 ����ϸ� �ڵ尡 ��������
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}

class ThreadEx10_1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) System.out.print("-");
		System.out.print("<<th1����>>");
	}
}

class ThreadEx10_2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) System.out.print("|");
		System.out.print("<<th2����>>");
	}
}
