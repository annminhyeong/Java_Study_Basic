package ch09;

import java.util.ArrayList;

public class Ex19 {
	public static void main(String[] args) {
		//오토박싱 & 언박싱
		//기본형과 참조형의 자동 형변환
		//JDK1.5이전에는 기본형과 참조형간의 연산이 불가능
		
		//기본형을 참조형으로 형변환 가능 -> JDK1.5이후부터 컴파일러가 valueOf()붙여서 자동 형변환 해줌

		//int(기본형) -> Integer(참조형) : 오토박싱
		//Integer(참조형) -> int(기본형) : 언박싱
		
		//ArrayList : 객체만 저장가능한 클래스
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//JDK1.5이전에는 에러였음 JDK1.5이후에는 int를 Integer로 컴파일러가 자동 형변환 해줌
		list.add(100); 
		list.add(new Integer(100));//음 list에는 객체만 추가가능
		
		Integer i1 = list.get(0); //list에 저장된 첫번째 객체를 꺼낸다
		int i2 = list.get(0).intValue();//intValue()로 Integer 참조형 타입을 기본형타입으로 바꾼다.
		int i3 = list.get(0); //JDK1.5이후에는 자동으로 컴파일로가 참조형타입을 기본형으로 바꿔줌
		
	}
}
