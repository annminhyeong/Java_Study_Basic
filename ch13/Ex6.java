package ch13;


//쓰레드의 우선순위 (희망사항)
//작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수있다.
//
//
//void setPriority(int newPriority) : 쓰레드의 우선순위를 지정한 값으로 변경한다.
//int getPriority() : 쓰레드의 우선순위를 반환한다.


public class Ex6 {
	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//쓰레드의 기본 우선순위는 5이다
		//우선순위의 범위는 1~10이다.
		th2.setPriority(7);
		
		System.out.println("th1 우선순위(-) :"+th1.getPriority());
		System.out.println("th2 우선순위(|) :"+th2.getPriority());
		
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
