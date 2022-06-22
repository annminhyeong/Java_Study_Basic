package ch12;

import java.util.HashMap;

//HashMap<K,V>
//여러 개의 타입변수가 필요한경우, 콤마로 구분함

class Student1 {
	String name = ""; //이름
	int ban; //반
	int no; //번호
	int kor; //국어
	int eng; //영어
	int math; //수학
	
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		
		//JDK1.7부터 생성자의 타입변수 생략가능 
		HashMap<String, Student1> map =  new HashMap<>(); 
		
		map.put("자바왕", new Student1("자바왕", 1, 1, 100, 100, 100));
		Student1 s = map.get("자바왕"); //지네릭스 안쓰면 형변환 해줘야함
		
		System.out.println(map);
		System.out.printf("%s, %d, %d, %d, %d, %d%n", s.name, s.ban, s.no, s.kor, s.eng, s.math);
	}
}











