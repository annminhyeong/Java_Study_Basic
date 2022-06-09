package ch07;
//인터페이스: 추상 메서드 집합
//구현된 것이 전혀 없는 설계도 껍데기 (모든 멤버가 public)
//모든 메서드가 추상메서드임
//디폴트메서드, static 메서드, 상수, 추상메서드만 사용가능

//인터페이스의 조상은 인터페이스만 가능
//다중상속이 가능하다
//이유: 조상의 메서드 구현부가 없기때문에 기능이 다를리가 없음 애초에 기능이 없으므로

//인터페이스의 구현
//인터페이스에 정의된 추상 메서드를 완성(몸통 { })하는 것
//일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함

//항상 public static final 타입 상수명 형식이다.
//항상 그런 형식이기때문에 public static final 생략가능
//맴버메서드는 항상 public abstract 타입 메서드명() 형식이다.
//항상 그런 형식이기때문에 public abstract 생략가능

//추상클래스와 인터페이스 차이점
//인터페이스는 iv, im, 생성자를 가질수 없다.


//인터페이스를 이용한 다형성
//인터페이스도 구현 클래스의 부모와 비슷한 기능을 함(거의 같음)
//ex) 인터페이스 i = new 클래스명();

//인터페이스 타입 매개변수는 인터페이스를 구현한 클래스의 객체만 가능
//인터페이스를 메서드의 반환타입 인터페이스면 반환타입도 인터페이스를 구현한 객체를 반환해야한다.
//메서드를 호출한쪽에서는 타입을 인터페이스로 받아야 함
abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("중지"); }
}

interface Fightable{
	void move(int x, int y); //public abstarct가 생략됨
	void attack(Fightable f); //public abstarct가 생략됨
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩 규칙: 조상의 접근제어자보다 범위가 좁으면 안된다.
	//조상과 같은 인터페이스에 public이 붙어 있으므로 default 접근제어자 말고 public을 사용해야함
	public void move(int x, int y) {System.out.printf("move[x=%d,y=%d]%n", x, y);}
	public void attack(Fightable f) {System.out.println(f + "를 공격");}
	
	
	//타입이 인터페이스인경우 implements로 상속받은 객체를 반환해야한다.
	Fightable getFightable() {
		Fighter f = new Fighter();
		
		//Fighter 객체 반환
		return f; // (Fightable) f 형변환이 생략되어있음
	}
}

public class Ex16 {

	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		Fightable f2 = new Fighter();
		Unit2 f3 = new Fighter(); 
		
		Fightable f = f1.getFightable();
		System.out.println(f);
		
		f1.move(0, 10);
		f1.attack(f1);
		f1.stop();
		
		f2.move(100, 200);
		f2.attack(f2);
		//f2.stop(); //Fightable타입에는 stop()이 없어서 접근불가
		
		f3.move(0, 0);
		//f3.attack(f3); //Unit2타입에는 attack()이 없어서 접근불가
		f3.stop();
	}

}
