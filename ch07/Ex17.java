package ch07;

//인터페이스의 장점
//1. 두 객체간의 '연결, 대화, 소통'을 돕는 중간 역할을 한다.
//2. 선언과 구현을 분리시킬수 있다.
//3. 개발 시간을 단축할 수 있다
//4. 변경에 유리한 유연한 설계가 가능하다
//5. 표준화가 가능하다
//6. 서로 관계없는 클래스들을 관계있게 맺어줄 수 있다.

class A{
	//인터페이스를 사용하면 여기코드를 바꿀 필요가 없음
	//public void method(B b) {  }
	//public void method(C c) {  }
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I{
	public void method() { System.out.println("B method"); }
}

class C implements I{
	public void method() { System.out.println("C method"); }
}
public class Ex17 {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); //A가 B를 사용(의존)
	}

}
