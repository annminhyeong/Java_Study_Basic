package ch06;

class Data_1{
	int value;
	//생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자 추가
}

class Data_2{
	int value;
	
	Data_2(int v){
		value = v;
	}
}

public class Ex10 {
	
	//생성자 = iv 초기화 메서드
	//인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
	//인스턴스 생성시 수행할 작업(iv 초기화)에 사용
	//
	//생성자 생성 규칙
	//1. 생성자의 이름은 클래스 이름과 같아야한다
	//2. 리턴값이 없다. (void 안붙임) 규칙임
	//3. 모든 클래스는 반드시 생성자를 가져야 한다.
	//
	//기본생성자 : 매개변수가 없는 생성자
	//생성자가 하나도 없을때만, 컴파일러가 자동 추가
	//형식: 클래스이름(){}

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		//Data_2 d2 = new Data_2(); 기본생성자가 없으므로 오류발생
		
		//1. new가 객체를 생성해서 메모리 주소를 d2에 저장
		//2. Data_2 생성자 호출
		Data_2 d2 = new Data_2(10);
	}

}
