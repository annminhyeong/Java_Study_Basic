package ch13;


//**static 붙은 메서드는 자기자신만 호출가능**
//static sleep() : 현재 쓰레드를 지정된 시간동안 멈추게한다.
//예외처리를 해야한다.(중간에 누가 깨우면InterruptedException이 발생함)
//특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다.

public class Ex10 {
	public static void main(String[] args) {
		ThreadEx10_1 th1 = new ThreadEx10_1();
		ThreadEx10_2 th2 = new ThreadEx10_2();
		
		th1.start();
		th2.start();
		
		try {
			//sleep() 메서드는 static이므로 th1 쓰레드가 쉬는것이 아닌 main메서드가 1초쉼
			//Thread.sleep(1000);과 같음
			th1.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.print("<<main종료>>");
	}
	
	//예외처리된 메서드를 사용하면 코드가 간결해짐
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}

class ThreadEx10_1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) System.out.print("-");
		System.out.print("<<th1종료>>");
	}
}

class ThreadEx10_2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) System.out.print("|");
		System.out.print("<<th2종료>>");
	}
}
