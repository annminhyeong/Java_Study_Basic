package ch06;

public class Ex9 {

	public static void main(String[] args) {
		int a = add(1, 2);
		float b = add(1, 2.0f);
		
		System.out.println(a);
		System.out.println(b);
	}
	
	//오버로딩
	//한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
	//
	//오버로딩이 성립하기 위한 조건
	//1. 메서드 이름이 같아야 한다.
	//2. 매개변수의 개수 또는 타입이 달라야 한다.
	//3. 반환 타입은 영향 없다.
	
	static int add(int a) {
		return a;
	}
	
	static float add(float a) {
		return a;
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static float add(float a, int b) {
		return a + b;
	}
	
	static float add(int a, float b) {
		return a + b;
	}
	
	static float add(float a, float b) {
		return a + b;
	}
}
