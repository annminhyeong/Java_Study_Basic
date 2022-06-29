package ch13;

//join() :������ �ð����� Ư�� �����尡 �۾��ϴ� ���� ��ٸ���. (sleep�� ���)
//void join() : �۾��� ��� ���� ������
//void join(long millis) : õ���� ���ʵ���
//void join(long millis, int nanos) : õ���� ���� + ������ ����


public class Ex14 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		//join�� ������ main ������� �ٷ� ����ȴ�.
		try {
			//main ������� th1�����尡 �۾��� ���������� ��ٸ���
			th1.join();
			
			//main ������� th2�����尡 �۾��� ���������� ��ٸ���
			th2.join();
		} catch (InterruptedException e) {}
		
		System.out.print("�ҿ�ð� :" + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx14_1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx14_2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
}
