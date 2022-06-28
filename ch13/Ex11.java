package ch13;

import javax.swing.JOptionPane;

//interrupt() : 대기상대(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다.
//
//void interrupt() : 쓰레드의 interrupted 상태를 false에서 true로 변경
//
//boolean isInterrupted() : 쓰레드의 interrupted상태를 반환.
//
//static boolean interrupted() : 현재 쓰레드의 interrupted 상태를 알려주고, false로 초기화

public class Ex11 {
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요:");
		System.out.println("입력하신값은 "+input+"입니다.");
		
		System.out.println("main쓰레드에서 Interrupt 발생전 th1상태(isInterrupted()): "+ th1.isInterrupted());
		System.out.println();
		
		//interrupt를 호출하면 interrupted 상태는 true가 된다
		th1.interrupt();
		
		System.out.println("main쓰레드에서 Interrupt 발생후 th1상태(isInterrupted()): "+ th1.isInterrupted());
		
		//interrupted() 메서드는 static 메서드이므로 자기 자신의 쓰레드만 제어가능
		System.out.println("main쓰레드에서 Interrupt 발생후 th1상태(interrupted()): "+ Thread.interrupted());
		System.out.println();
		
		System.out.println("main쓰레드에서 Interrupt 발생후 재호출시 th1상태(isInterrupted()): "+ th1.isInterrupted());
		System.out.println();
	}
}

class ThreadEx11_1 extends Thread{
	
	@Override
	public void run() {
		int i = 10;
		
		while (i !=0 && !isInterrupted()) {
			System.out.println(i--);
			
			//시간지연
			for(long x=0; x<250000000000000000L; x++);
			
			//sleep()쓰면 interrupt flag를 초기화하여. 인터럽트가 발생했다는 것을 알 수 없게됨
			//delay(1000);
		}
		
		System.out.println("th1에서 Interrupt 발생후 th1상태(isInterrupted()): "+ this.isInterrupted());
		System.out.println("th1에서 Interrupt 발생후 재호출시 th1상태(isInterrupted()): "+ this.isInterrupted());
		System.out.println();
		
		//interrupted() 메서드는 static 메서드이므로 자기 자신의 쓰레드만 제어가능
		System.out.println("th1에서 Interrupt 발생후 th1상태(interrupted()): "+ Thread.interrupted());
		System.out.println("th1에서 Interrupt 발생후 재호출시 th1상태(interrupted()): "+ Thread.interrupted());
		
		System.out.println("카운트가 종료되었습니다.");
	}
	
	public static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println("인터럽트발생");
		}
	}
}
