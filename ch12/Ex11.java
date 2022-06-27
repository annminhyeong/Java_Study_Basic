package ch12;
//애너테이션
//주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
//
//@Override
//오버라이딩을 올바르게 했는지 컴파일러가 체크하게한다.

//@Deprecated
//앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.

//@FuntionalInterface
//함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
//함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음

//@SuppressWarnings
//컴파일러의 경고메시지가 나타나지 않게 억제한다.

class Parent{
	void parentMethod() {}
}

//함수형 인터페이스는 하나의 추상메서드만 가능
@FunctionalInterface
interface Testable{
	void test(); //추상메서드
	//void check(); //추상메서드
}	

public class Ex11 extends Parent{
	
	@Override
	@Deprecated
	void parentMethod() {}
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Ex11 e = new Ex11();
		e.parentMethod(); //Deprecate된 메서드 사용
	}
}
