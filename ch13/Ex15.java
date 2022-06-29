package ch13;

//�������� ����ȭ
//���� �����尡 �Ѱ��� �ڿ��� �����ϸ� ������ �߻��� �� ����
//��Ƽ ������ ���μ��������� ���� �ڿ��� �����ϱ� ������ �ٸ� �������� �۾��� ������ ��ĥ �� �ִ�.
//
//�������� �۾��� �ٸ� �����忡�� �������� �ʰ� �Ϸ��� ����ȭ�� �ʿ�
//
//�������� ����ȭ�� �� �����尡 �������� �۾��� �ٸ� �����尡 �������� ���ϰ� ���� ��
//
//����ȭ�Ϸ��� �������� �ʾƾ��ϴ� ������� �Ӱ迵��(�ڹ���)���� ����
//
//�Ӱ迵���� ��(����)�� ���� �� �ϳ��� �����常 ���԰��� (��ü 1���� �� 1��)
//
//synchronized�� �̿��� ����ȭ
//synchronized�� �Ӱ迵��(lock�� �ɸ��� ����)�� �����ϴ� 2���� ���
//1. �޼��� ��ü�� �Ӱ� �������� ����
//public synchronized void method()
//
//2. Ư���� ������ �Ӱ� �������� ����
//synchronized(��ü�� ��������){}

public class Ex15 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx15_1();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start();
	}
}

class Acount{
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx15_1 implements Runnable{
	Acount acc = new Acount();
	
	@Override
	public void run() {
		while (acc.getBalance()> 0) {
			//int money = (int)(Math.random()*3 + 1) * 100;
			int money = 500;
			acc.withdraw(money);
			System.out.println("Balance :"+acc.getBalance());
		}
	}
}











