package ch13;


import java.util.ArrayList;

//동기화는 객체당 1개의 락을 가지고 있다.

//문제점 : 음식이 없을 때, 손님이 Table의 lock(열쇠)를 쥐고 안놓는다.
//해결책 : 음식이 없을때 wait()으로 손님이 lock(열쇠)를 풀고 기다리게하자
//요리사는 음식을 추가하면, notify()로 손님에게 알리자 (손님이 lock(열쇠) 재획득)

public class Ex16 {
	public static void main(String[] args) throws Exception {
		//여러쓰레드가 공유하는 테이블(식당)객체 생성
		Table table = new Table(); 
		
		//요리사 객체생성, 요리사 쓰레드생성
		new Thread(new Cook(table),"COOK").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		//손님1 객체생성, 손님1 쓰레드생성
		new Thread(new Customer(table, "donut"), "CUST1").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		//손님2 객체생성, 손님2 쓰레드생성
		new Thread(new Customer(table, "burger"), "CUST2").start(); //new Thread의 두번째 인자는 쓰레드이름
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

//테이블(식당)
class Table{
	
	//요리이름들????
	String[] dishNames = {"donut", "donut", "burger"};
	
	//테이블에 놓을수 있는 최대 음식개수
	final int MAX_FOOD = 6;
	
	//테이블 음식목록
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		
		//최대요리개수보다 요리한개수가 많으면 주문취소
		if(dishes.size()>MAX_FOOD) return;
		
		//아니면 음식추가
		dishes.add(dish);
		
		//태이블 음식목록 출력
		System.out.println("dishes :" + dishes.toString());
	}
	
	//테이블 음식 제거
	public boolean remove(String disName) {
		synchronized (this) {
			//음식이 없으면
			while (dishes.size()==0) {
				//쓰레드(손님)이름 저장
				String name = Thread.currentThread().getName();
				
				//해당 쓰레드(손님)에게 기다리라고 출력
				System.out.println(name + " is waiting");
				
				//500 밀리초 휴식
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
			
			//음식이 있으면
			for(int i=0; i<dishes.size(); i++) {
				if(disName.equals(dishes.get(i))) {
					//음식먹기
					dishes.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	//음식목록의 길이
	public int dishNum() { return dishNames.length; }
}

//요리사
class Cook implements Runnable{
	
	private Table table;
	Cook(Table table){ this.table = table; }
	
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
class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food){
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
			
			//먹을 음식이 있으면
			if(eatFood())
				//먹기 출력
				System.out.println(name + " ate a " + food);
			else
				//먹기 실패 출력
				System.out.println(name + " fail to eat. :(");
		}
	}
	
	//먹을수 있는지 없는지 체크
	boolean eatFood() {return table.remove(food);}
}



