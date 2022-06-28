package ch13;


//�������� �켱���� (�������)
//�۾��� �߿䵵�� ���� �������� �켱������ �ٸ��� �Ͽ� Ư�� �����尡 �� ���� �۾��ð��� ���� �� ���ִ�.
//
//
//void setPriority(int newPriority) : �������� �켱������ ������ ������ �����Ѵ�.
//int getPriority() : �������� �켱������ ��ȯ�Ѵ�.


public class Ex6 {
	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//�������� �⺻ �켱������ 5�̴�
		//�켱������ ������ 1~10�̴�.
		th2.setPriority(7);
		
		System.out.println("th1 �켱����(-) :"+th1.getPriority());
		System.out.println("th2 �켱����(|) :"+th2.getPriority());
		
		th1.start();
		th2.start();
	}
}

class ThreadEx6_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x=0; x<10000000; x++);
		}
	}
}

class ThreadEx6_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x=0; x<10000000; x++);
		}
	}
}
