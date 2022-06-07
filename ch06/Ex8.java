package ch06;

public class Ex8 {
	//static 메서드와 인스턴스 메서드 차이점 : iv 사용 여부
	//객체 : iv 묶음
	
	//static은 공통속성
	//인스턴스는 개별속성
	
	//인스턴스 메서드
	//인스턴스 생성후, 참조변수.메서드이름() 으로 호출
	//인스턴스 맴버 (iv, im)와 관련된 작업을 하는 메서드
	//메서드 내에서 인스턴스 변수, 인스턴스 메서드 사용가능
	
	//static 메서드
	//객체생성없이 클래스이름.메서드이름()으로 호출
	//인스턴스 맴버 (iv, im)와 관련없는 작업을 하는 메서드
	//메서드 내에서 인스턴스 변수, 인스턴스 메서드 사용불가

	//iv : intence variable, im : instance method
	
	public static void main(String[] args) {
		TestClass2.classMethod(); //만약 static 메서드가 같은 클래스에 있다면 클래스명 생략가능
		
		TestClass2 cc = new TestClass2();
		cc.instanceMethod();
	}
}

class TestClass2{
	int iv;
	static int cv; //언제나 사용가능
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void classMethod() {
		//static은 객체를 생성하지 않고 사용, 인스턴스 변수는 객체가 생성후 사용 가능
		//static 메서드가 인스턴스 변수를 호출했을때 객체가 생성되었다는 보장이 없으므로 사용 불가능
		//System.out.println(iv);
		System.out.println(cv);
	}	
}
