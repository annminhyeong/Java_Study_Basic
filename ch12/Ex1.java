package ch12;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		//지네릭스 : 컴파일시 타입을 체크해주는 기능
		//지네릭스사용시 타입을 알고있으므로 컴파일러가 자동으로 형변환 해줌
		//여러종류사용하고 싶을시에는 지네릭스타입을 Object 사용, 단 형변환해야함
		//JDK1.5 이후 클래스타입에 Object가 있는경우 지네릭타입이 필수가 됨

		
		//ArrayList list = new ArrayList(); //JDK1.5이전, 지네릭스 도입전
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10); //list.add(new Integer(10);
		list.add(20);
		list.add("30"); //String을 추가
		
		//컴파일 OK, 실행시 형변환에러 발생
		//컴파일러의 한계, 컴파일러가 전부다 체크할 수 없음
		Integer i = (Integer)list.get(2); 
		
		System.out.println(list);
	}
}
