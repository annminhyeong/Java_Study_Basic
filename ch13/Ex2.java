package ch13;

//�������� ������ ����
//1. ThreadŬ������ ���
//2 Runnable �������̽��� ���� (��õ)

//�������� ���� - start()
//������� run()�޼��带 ������ ����
//�����带 ������ �ڿ� start()�� ȣ���ؾ� �����尡 �۾��� �����Ѵ�.

//start()�� run() ���ۿ���
//����(main ������)ȣ�⽺�ÿ��� start()�޼���� ���ο� ȣ�⽺��(������)�� �����Ѵ�.
//���ο� ȣ�⽺�ÿ� run()�޼��带 ���� ���� start()�޼���� ����ȴ�. 
//�׷��� ������ ȣ�⽺��(main ������)�� ���ο� ȣ�⽺��(������)�� �����Ƽ� ����ȴ�.

public class Ex2 {
	public static void main(String[] args) {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		
		Runnable r = new ThreadEx2_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

//Thread Ŭ������ ����ؼ� �����带 ����
class ThreadEx2_1 extends Thread{
	
	//Thread Ŭ������ run()�޼��� ������
	@Override
	public void run() {
		
		//�ݺ�Ƚ���� ��� ������� ��µǴ� ��ó�� ����
		//����� 1�������尡 ���� ������� 2�� ������� OS �����ٷ��� �����ϴ� ���̹Ƿ� ������� ����������� �� �� ���� 
		for(int i=0; i<5; i++) {
			//getName()�� this�� ������
			System.out.println(getName()); //������ getName()�� ȣ��
		}
		
		//�ΰ��� �۾��� �����Ƽ� �����
		for(int i=0; i<500; i++)
			System.out.print(0);
	}
	
}

//Runnable�� ����ؼ� �����带 ����
class ThreadEx2_2 implements Runnable{
	
	//Runnable �������̽��� ����
	@Override
	public void run() {
		
		//�ݺ�Ƚ���� ��� ������� ��µǴ� ��ó�� ����
		//����� 1�������尡 ���� ������� 2�� ������� OS �����ٷ��� �����ϴ� ���̹Ƿ� ������� ����������� �� �� ����
		for(int i=0; i<5; i++) {
			//currentThread() : ���� �������� Thread�� ��ȯ�Ѵ� 
			System.out.println(Thread.currentThread().getName());
		}
		
		//�ΰ��� �۾��� �����Ƽ� �����
		for(int i=0; i<500; i++)
			System.out.print(1);
	}
	
}
