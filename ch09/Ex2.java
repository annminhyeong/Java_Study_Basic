package ch09;

import java.util.Objects;

//hashCode()
//객체의 해시코드를 반환하는 메서드 (객체의 지문)
//Object 클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
//
//equals()의 결과가 true인 두 객체의 해시코드는 같아야하기때문에 equals()를 오버라이딩하면, hashCode()도 오버라이딩해야한다.
//
//System.identityHashCode(Object obj)는 Object클래스의 hashCode()와 같다
//
//
//toString()
//객체를 문자열으로 변환하는 메서드
//getClass(): 설계도 객체
//getName():클래스 이름
//@ : at 위치
//
//객체 = iv 집합이므로
//객체를 문자열로 변환한다는 것은 iv의 값을 문자열로 변환한다는 것과 같다.
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//Object toString() 메서드를 오버라이딩 
	public String toString() {
		return "kind: " + kind + ", number: " + number;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		Card c = (Card)obj;
		return kind.equals(c.kind) && this.number == c.number; //kind는 c1객체이고 c.kind는 c2겍체임
	}
	
	//equals 오버라이딩하면 hashCode도 오버라이딩해야함
	//int hash(Object... value)
	//Objects 클래스는 객체 관련된 유용한 메서드를 제공하는 유틸 클래스
	//매개변수가 가변인자(Object..)라서 호출시 지정하는 값의 개수가 정해져있지 않다.
	public int hashCode() {
		return Objects.hash(kind, number);
		
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
