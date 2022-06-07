package ch06;

public class Ex12 {

	int x; //인스턴스가 생성될때 0으로 초기화됨
	int y = x;
	
	//지역변수는 수동 초기화 해야함(사용전 꼭!!)
	void method1() {
		int i; // 초기화 안됨
		//int j = i; 무슨값인지 모르므로 에러발생 
	}
}
