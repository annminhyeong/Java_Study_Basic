package ch12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Iterator<E> : 클래스를 작성할 때, Object타입 대신 T와 같은 타입변수를 사용

class Student {
	String name = ""; //이름
	int ban; //반
	int no; //번호
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}

public class Ex4 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			//지네릭스를 사용하지않으면 형변환 필요
			Student s = it.next();
			System.out.printf("%s, %d, %d%n", s.name, s.ban, s.no);
		}
	}
}