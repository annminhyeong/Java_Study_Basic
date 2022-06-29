package ch13;

import java.util.ArrayList;

//wait()과 notify()
//동기화의 효율을 높이기 위해 wait(), notify()를 사용
//
//Object 클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있다.
//
//wait() : 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다. (열쇠 반납)
//
//notify() : waiting pool에서 대기중인 쓰레드중의 랜덤으로 하나를 깨운다. (열쇠 재획득)
//
//notifyAll() : waiting pool에서 대기중인 모든 쓰레드를 깨운다. (그 중 하나의 쓰레드가 열쇠 재획득)

public class Ex17 {
	public static void main(String[] args) throws Exception {
		//여러쓰레드가 공유하는 테이블(식당)객체 생성
		Table2 table = new Table2(); 
		
		//요리사 객체생성, 요리사 쓰레드생성
		new Thread(new Cook2(table),"COOK").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		//손님1 객체생성, 손님1 쓰레드생성
		new Thread(new Customer2(table, "donut"), "CUST1").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		//손님2 객체생성, 손님2 쓰레드생성
		new Thread(new Customer2(table, "burger"), "CUST2").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

//테이블(식당)
class Table2{
	
	//요리이름들????
	String[] dishNames = {"donut", "donut", "burger"};
	
	//테이블에 놓을수 있는 최대 음식개수
	final int MAX_FOOD = 6;
	
	//테이블 음식목록
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		
		//최대요리개수보다 요리한개수가 많으면
		while(dishes.size()>MAX_FOOD) {
			//쓰레드 이름(손님)이름 저장
			String name = Thread.currentThread().getName();
			
			//손님에게 음식기다리라고 출력
			System.out.println(name+" is waiting");
			
			try {
				wait(); //손님은 번호표를 반납해 요리사가 요리할 시간을 줌
			} catch (InterruptedException e) {}
			
		}
		
		//아니면 음식추가
		dishes.add(dish);
		
		//기다린손님에게 알림
		notify();
		
		//태이블 음식목록 출력
		System.out.println("dishes :" + dishes.toString());
	}
	
	//테이블 음식 제거
	public void remove(String disName) {
		synchronized (this) {
			
			//쓰레드(손님)이름 저장
			String name = Thread.currentThread().getName();
			
			//음식이 없으면
			while (dishes.size()==0) {
				
				//해당 쓰레드(손님)에게 기다리라고 출력
				System.out.println(name + " is waiting");
				
				//
				try {
					wait(); //음식이 없으므로 번호표를 반납함
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			
			while (true) {
				//음식이 있으면
				for(int i=0; i<dishes.size(); i++) {
					if(disName.equals(dishes.get(i))) {
						//음식먹기
						dishes.remove(i);
						
						//요리할 테이블이 생겼으므로 요리사를 깨움
						notify();
						return;
					}
				}
				
				//원하는 음식이 없는 경우
				try {
					//해당 쓰레드(손님)에게 기다리라고 출력
					System.out.println(name + " is waiting");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}//while
		}
	}
	
	//음식목록의 길이
	public int dishNum() { return dishNames.length; }
}

//요리사
class Cook2 implements Runnable{
	
	private Table2 table;
	Cook2(Table2 table){ this.table = table; }
	
	@Override
	public void run() {
		while (true) {
			
			//음식목록에있는 것중 하나를 조리
			int idx = (int)(Math.random()*table.dishNum());
			
			//조리한 음식을 테이블에 전달
			table.add(table.dishNames[idx]);
			
			//100밀리초 휴식
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}

//손님
class Customer2 implements Runnable{
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food){
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while (true) {
			//10밀리초 휴식
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			
			//해당쓰레드(손님)이름 저장
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}
