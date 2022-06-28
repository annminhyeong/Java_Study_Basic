package ch13;

//suspend(), resume(), stop()
//교착상태 에 빠지기 쉬워서 권장안함
//
//void suspend() : 쓰레드를 일시정지 시킨다.
//void resume() : suspend()에 의해 일시정지된 쓰레드를 실행 대기상태로 만든다.
//void stop() : 쓰레드를 즉시 종료시킨다.

public class Ex12 {
	public static void main(String[] args) {
		Runnable r = new TreadEx12_1();
		
		//new Thread(인터페이스 구현클래스, 쓰레드이름)
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			
			Thread.sleep(2000);
			th2.suspend();
			
			
			Thread.sleep(3000);
			th1.resume();
			
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			
			Thread.sleep(2000);
			th3.stop();
			

		} catch (InterruptedException e) {}
	}
}

class TreadEx12_1 implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
