package ch12;

import java.util.ArrayList;

//타입 변수
//지네릭 클래스를 작성할때, Object타입 대신 타입변수(E)를 선언해서 사용
//
//타입 변수에 대입하기
//ex) ArrayList<Integer> i = new ArrayList<Integer>();
//참조변수와 생성자의 타입이 일치해야함

class Tv{}
class Audio{}
public class Ex2 {
	public static void main(String[] args) {
		
		//ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList list1 = new ArrayList();
		list1.add(new Tv());
		list1.add(new Audio());
		
		//타입을 명시하지 않으면 형변환해야함
		Tv t1 = (Tv) list1.get(0);
		//ArrayList의 타입은 Object이므로 여러타입으로 받을수 있음
		Audio o1 = (Audio) list1.get(1);
		
		
		
		ArrayList<Tv> list2 = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
		list2.add(new Tv());
		
		//Tv타입 아니므로 오류발생
		//list2.add(new Audio()); 
		
		//타입을 명시했으므로 따로형변환하지 않아도 됨
		Tv t2 = list2.get(0);
	}
}
