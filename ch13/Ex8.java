package ch13;
//데몬 쓰레드
//일반 쓰레드의 작업을 돕는 보조적인 쓰레드
//일반 쓰레드가 종료되면 자동적으로 종료된다.
//가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다.
//무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
//
//boolean isDaemon() : 쓰레드가 데몬 쓰레드인지 확인한다.
//void setDaemon(boolean on) : 쓰레드를 데몬 쓰레드 또는 사용자 쓰레드로 변경, 매개변수 on을 true로 지정하면 데몬쓰레드가 된다
//
//setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야한다. 그렇지 않으면 IllegalThreadStateException이 발생한다.


public class Ex8 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		//Thread(Runnable r) : Runnable인터페이스를 구현한 클래스 넣기
		Thread t = new Thread(new Ex8());
		
		//데몬쓰레드로 설정
		//이부분이 없으면 종료되지 않는다.
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i ==5)autoSave = true;
		}
		System.out.println("프로그램 종료이 종료되었습니다.");

		
	}
	
	@Override
	public void run() {
		
		//main(사용자)쓰레드가 종료되면 데몬쓰레드는 종료됨
		//무한루프
		while (true) {
			try {
				//3초마다
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {}
			if(autoSave) autoSave();
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
