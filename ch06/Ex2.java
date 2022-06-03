package ch06;

public class Ex2 {

	public static void main(String[] args) {
		//객체배열 만들기
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		Tv t; //객체 참조변수 생성
		t = new Tv(); //객체 참조변수에 객체메모리주소(연속적) 저장 (인스턴스 생성)
		
		t.channel = 7; //Tv 인스턴스 맴버변수에 값 저장
		t.channelDown(); //Tv 인스턴스 메서드 호출
		
		System.out.println("현재채널은" + t.channel + "입니다."); //Tv 인스턴스 맴버변수 사용
	}

}

class Tv{	
	//Tv의 속성(맴버 변수)
	String color;   //색상
	boolean power;  //전원상태
	int channel;    //채널
	
	//Tv의 기능(메서드)
	void power(){ power = !power; };  //채널 on/off
	void channelUp(){ ++channel; };   //채널 올리기
	void channelDown(){ --channel; }; //채널 내리기
}
