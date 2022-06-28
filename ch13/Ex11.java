package ch13;

import javax.swing.JOptionPane;

//interrupt() : �����(WAITING)�� �����带 ������ ����(RUNNABLE)�� �����.
//
//void interrupt() : �������� interrupted ���¸� false���� true�� ����
//
//boolean isInterrupted() : �������� interrupted���¸� ��ȯ.
//
//static boolean interrupted() : ���� �������� interrupted ���¸� �˷��ְ�, false�� �ʱ�ȭ

public class Ex11 {
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���:");
		System.out.println("�Է��ϽŰ��� "+input+"�Դϴ�.");
		
		System.out.println("main�����忡�� Interrupt �߻��� th1����(isInterrupted()): "+ th1.isInterrupted());
		System.out.println();
		
		//interrupt�� ȣ���ϸ� interrupted ���´� true�� �ȴ�
		th1.interrupt();
		
		System.out.println("main�����忡�� Interrupt �߻��� th1����(isInterrupted()): "+ th1.isInterrupted());
		
		//interrupted() �޼���� static �޼����̹Ƿ� �ڱ� �ڽ��� �����常 �����
		System.out.println("main�����忡�� Interrupt �߻��� th1����(interrupted()): "+ Thread.interrupted());
		System.out.println();
		
		System.out.println("main�����忡�� Interrupt �߻��� ��ȣ��� th1����(isInterrupted()): "+ th1.isInterrupted());
		System.out.println();
	}
}

class ThreadEx11_1 extends Thread{
	
	@Override
	public void run() {
		int i = 10;
		
		while (i !=0 && !isInterrupted()) {
			System.out.println(i--);
			
			//�ð�����
			for(long x=0; x<250000000000000000L; x++);
			
			//sleep()���� interrupt flag�� �ʱ�ȭ�Ͽ�. ���ͷ�Ʈ�� �߻��ߴٴ� ���� �� �� ���Ե�
			//delay(1000);
		}
		
		System.out.println("th1���� Interrupt �߻��� th1����(isInterrupted()): "+ this.isInterrupted());
		System.out.println("th1���� Interrupt �߻��� ��ȣ��� th1����(isInterrupted()): "+ this.isInterrupted());
		System.out.println();
		
		//interrupted() �޼���� static �޼����̹Ƿ� �ڱ� �ڽ��� �����常 �����
		System.out.println("th1���� Interrupt �߻��� th1����(interrupted()): "+ Thread.interrupted());
		System.out.println("th1���� Interrupt �߻��� ��ȣ��� th1����(interrupted()): "+ Thread.interrupted());
		
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
	
	public static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println("���ͷ�Ʈ�߻�");
		}
	}
}
