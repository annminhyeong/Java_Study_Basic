package ch13;

//static yield() : ���� �ð��� ���� �����忡�� �纸�ϰ�, �ڽ�(���� ������)�� �������Ѵ�.
//yield�� interrupt�� ������ ����ϸ� ���伺�� ȿ���� ���� �� �ִ�. 

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
	//cpu�� �ھ���� ĳ�� �޸𸮰� Ram�� �޸��� ���� �����ؼ� ������ ����.
	//���� ���� �ٲ�� ���� ��� cpu�� ĳ�ø޸𸮴� ��������� Ram�� �޸� ���� �ȹٲ�� ��찡 ����.
	//volatile�� �׷� ��� cpu ĳ�ø޸𸮰� Ram �޸𸮰��� �����ؼ� ��������ʰ� ���� Ram �޸𸮿��� �����ͼ� ����ϵ��� ������
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
