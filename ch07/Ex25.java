package ch07;

public class Ex25 extends Object {
	//익명클래스
	//이름이 없는 일회용 클래스 정의와 생성을 동시에
	//형식1: new 조상클래스이름(){ }
	//형식2: new 구현(조상)인터페이스이름(){ }
	
	Object iv = new Object() {void method(){}}; //익명클래스
	static Object cv = new Object() {void method(){}}; //익명클래스

	void myMethod() {
		Object lv = new Object() {void method(){}}; //익명클래스
	}

}
