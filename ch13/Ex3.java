package ch13;


//main 쓰레드
//main메서드의 코드를 수행하는 쓰레드
//쓰레드는 사용자 쓰레드와 데몬 쓰레드 두 종류가 있다.
//main 쓰레드는 사용자 쓰레드이다.
//실행중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다.

public class Ex3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();
		
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		
//		try {
//			//main 쓰레드가 th1(1번쓰레드)의 작업이 끝날때까지 기다린다.
//			th1.join();
//			
//			//main 쓰레드가 th2(2번쓰레드)의 작업이 끝날때까지 기다린다.
//			th2.join();
//		} catch (InterruptedException e) {}
		
		System.out.println("소요시간 :" + (System.currentTimeMillis() - startTime));
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
