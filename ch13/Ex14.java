package ch13;

//join() :지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다. (sleep과 비슷)
//void join() : 작업이 모두 끝날 때까지
//void join(long millis) : 천분의 일초동안
//void join(long millis, int nanos) : 천분의 일초 + 나노초 동안


public class Ex14 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		//join이 없으면 main 쓰레드는 바로 종료된다.
		try {
			//main 쓰레드는 th1쓰레드가 작업이 끝날때까지 기다린다
			th1.join();
			
			//main 쓰레드는 th2쓰레드가 작업이 끝날때까지 기다린다
			th2.join();
		} catch (InterruptedException e) {}
		
		System.out.print("소요시간 :" + (System.currentTimeMillis() - startTime));
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
