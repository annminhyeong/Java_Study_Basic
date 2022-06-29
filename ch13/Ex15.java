package ch13;

//쓰레드의 동기화
//여러 쓰레드가 한개의 자원을 공유하면 문제가 발생할 수 있음
//멀티 쓰레드 프로세스에서는 같은 자원을 공유하기 때문에 다른 쓰레드의 작업에 영향을 미칠 수 있다.
//
//진행중인 작업이 다른 쓰레드에게 간섭받지 않게 하려면 동기화가 필요
//
//쓰레드의 동기화는 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
//
//동기화하려면 간섭받지 않아야하는 문장들을 임계영역(자물쇠)으로 설정
//
//임계영역은 락(열쇠)을 얻은 단 하나의 쓰레드만 출입가능 (객체 1개에 락 1개)
//
//synchronized를 이용한 동기화
//synchronized로 임계영역(lock이 걸리는 영역)을 설정하는 2가지 방법
//1. 메서드 전체를 임계 영역으로 지정
//public synchronized void method()
//
//2. 특정한 영역을 임계 영역으로 지정
//synchronized(객체의 참조변수){}

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











