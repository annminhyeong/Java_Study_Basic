package ch13;


//main ������
//main�޼����� �ڵ带 �����ϴ� ������
//������� ����� ������� ���� ������ �� ������ �ִ�.
//main ������� ����� �������̴�.
//�������� ����� �����尡 �ϳ��� ���� �� ���α׷��� ����ȴ�.

public class Ex3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();
		
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		
//		try {
//			//main �����尡 th1(1��������)�� �۾��� ���������� ��ٸ���.
//			th1.join();
//			
//			//main �����尡 th2(2��������)�� �۾��� ���������� ��ٸ���.
//			th2.join();
//		} catch (InterruptedException e) {}
		
		System.out.println("�ҿ�ð� :" + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx3_1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx3_2 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
}
