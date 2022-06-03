package ch06;

public class Ex3 {
	
	//클래스 안의 선언위치에 따른 변수의 종류
	//1.클래스 영역 
	//  (변수선언, 메서드 선언)만 가능
	//  iv - instance variable (class 안에 위치한 변수)
	//	iv 생성시기 : 인스턴스가 생성 되었을 때
	//	iv는 객체 생성 필요 O
	//
	//	cv - class variable (iv에 static을 붙인 변수)
	//	cv 생성시기: 클래스가 메모리에 올라갈 때
	//	cv는 객체 생성 필요 X
	//
	//2. 메서드 영역
	//	lv - local variable (메서드 안에 위치한 변수)
	
	int iv; //인스턴스 변수
	static int cv; //클래스 변수
	
	void func() {
		int lv; //지역 변수
	};
}
