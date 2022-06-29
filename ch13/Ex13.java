package ch13;

//static yield() : 남은 시간을 다음 쓰레드에게 양보하고, 자신(현재 쓰레드)은 실행대기한다.
//yield와 interrupt를 적절히 사용하면 응답성과 효율을 높일 수 있다. 

public class Ex13 {
	public static void main(String[] args) {
		ThreadEx13_1 th1 = new ThreadEx13_1("*");
		ThreadEx13_1 th2 = new ThreadEx13_1("**");
		ThreadEx13_1 th3 = new ThreadEx13_1("***");
		
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

class ThreadEx13_1 implements Runnable{
	//cpu의 코어들이 캐시 메모리가 Ram의 메모리의 값을 복사해서 가지고 있음.
	//값이 자주 바뀌는 값인 경우 cpu의 캐시메모리는 변경됬지만 Ram의 메모리 값이 안바뀌는 경우가 있음.
	//volatile은 그런 경우 cpu 캐시메모리가 Ram 메모리값을 복사해서 사용하지않고 직접 Ram 메모리에서 가져와서 사용하도록 설정함
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	ThreadEx13_1(String name){
		th = new Thread(this, name); //Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}

	void stop() {
		stopped = true;
		th.interrupt();
	}
	
	void suspend() {
		suspended = true;
		th.interrupt();
	}
	
	void resume() {
		suspended = false;
	}
	
	@Override
	public void run() {
		while (!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}else {
				Thread.yield();
			}

		}
	}
	
}
