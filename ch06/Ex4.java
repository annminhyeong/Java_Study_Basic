package ch06;

public class Ex4 {

	public static void main(String[] args) {
		
		//객체 생성없이 사용가능
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 5;
		
		//겍체 생성한뒤 사용가능
		System.out.println(c1.kind);
		System.out.println(c1.number);
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 1;
		
		//겍체 생성한뒤 사용가능
		System.out.println(c2.kind);
		System.out.println(c2.number);
		
		//권장X : 클래스변수는 클래스당 1개밖에 없는데 c1.width라고 쓰면 c1객체만 값을 바꾼것으로 오해하기 쉬움
		//c1.width = 200; //귄장X 
		//c1.height = 300; //귄장X
		Card.height = 200; //권장
		Card.width = 300; //권장
	}
}

class Card{
	//공통속성은 클래스 변수
	//개별속성은 인스턴스 변수
	
	//클래스변수(static)는 클래스(설계도)당 1개만 생성
	static int width = 100; //폭
	static int height = 250; //높이
	
	//인스턴스변수는 객체당 1개만 생성
	String kind; //무늬
	int number; //숫자
}
