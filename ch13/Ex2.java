package ch13;

//쓰레드의 구현과 실행
//1. Thread클래스를 상속
//2 Runnable 인터페이스를 구현 (추천)

//쓰레드의 실행 - start()
//쓰레드는 run()메서드를 구현한 다음
//쓰레드를 생성한 뒤에 start()를 호출해야 쓰레드가 작업을 시작한다.

//start()와 run() 동작원리
//기존(main 쓰레드)호출스택에서 start()메서드는 새로운 호출스택(쓰레드)을 생성한다.
//새로운 호출스택에 run()메서드를 넣은 다음 start()메서드는 종료된다. 
//그러면 기존의 호출스택(main 쓰레드)와 새로운 호출스택(쓰레드)가 번갈아서 실행된다.

public class Ex2 {
	public static void main(String[] args) {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		
		Runnable r = new ThreadEx2_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

//Thread 클래스를 상속해서 쓰레드를 구현
class ThreadEx2_1 extends Thread{
	
	//Thread 클래스의 run()메서드 재정의
	@Override
	public void run() {
		
		//반복횟수가 적어서 순서대로 출력되는 것처럼 보임
		//사실은 1번쓰레드가 먼저 실행될지 2번 쓰레드는 OS 스케줄러가 결정하는 것이므로 어느것이 먼저실행될지 알 수 없음 
		for(int i=0; i<5; i++) {
			//getName()에 this가 생략됨
			System.out.println(getName()); //조상인 getName()을 호출
		}
		
		//두가지 작업이 번갈아서 실행됨
		for(int i=0; i<500; i++)
			System.out.print(0);
	}
	
}

//Runnable를 상속해서 쓰레드를 구현
class ThreadEx2_2 implements Runnable{
	
	//Runnable 인터페이스를 구현
	@Override
	public void run() {
		
		//반복횟수가 적어서 순서대로 출력되는 것처럼 보임
		//사실은 1번쓰레드가 먼저 실행될지 2번 쓰레드는 OS 스케줄러가 결정하는 것이므로 어느것이 먼저실행될지 알 수 없음
		for(int i=0; i<5; i++) {
			//currentThread() : 현재 실행중인 Thread를 반환한다 
			System.out.println(Thread.currentThread().getName());
		}
		
		//두가지 작업이 번갈아서 실행됨
		for(int i=0; i<500; i++)
			System.out.print(1);
	}
	
}
