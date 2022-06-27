package ch12;

import javax.naming.directory.DirContext;

//열거형에 멤버 추가하기
//불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다.
//괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야한다.
//열거형의 생성자는 묵시적으로 private이므로, 외부에서 객체생성불가

enum Direction2{
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value; //상수의 1번째인자를 저장할 저장
	private final String symbol; //상수의 2번째인자를 저장할 변수
	
	
	//생성자는 private 생략가능
	//생성자를 호출하면 상수의 인자가 생성자에 대입됨
	Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
	
	public static Direction2 of(int dir) {
		if(dir < 1 || dir > 4)
			throw new IllegalArgumentException("Invalid value :"+ dir);
		
		return DIR_ARR[dir -1];
	}
	
	//방향을 회전시키는 메서드, num값만큼 90도씩 시계방향으로 회전
	public Direction2 rotate(int num) {
		num = num % 4;
		if(num < 0) num+=4; //num이 음수일때 시계반대방향으로 회전
		return DIR_ARR[(value-1+num)% 4];
	}
	
	public String toString() {
		return name()+ getSymbol();
	}
}

public class Ex10 {
	public static void main(String[] args) {
		for(Direction2 d : Direction2.values())
			//getValue는 열거형 상수의 값을 반환
			System.out.printf("%s=%d%n", d.name(), d.getValue()); 
		
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d1=%s, %d%n", d2.name(), d2.getValue());
		
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	}
}
