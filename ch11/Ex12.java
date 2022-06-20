package ch11;

import java.util.HashSet;
import java.util.Objects;

//HashSet(교집합) : 중복 x, 순서 x
//HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
//같은 객체가 없으면 저장하고 있으면 저장하지 않는다
//boolean add(Object o)는 저장할 객체의 equals() 와 hashCode()를 호출
//equals()와 hashCode()가 오버라이딩 되어 있어야함


public class Ex12 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc"); //중복이라 저장안됨
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));		
		System.out.println(set);
	}
}
//equals()와 hashCode()를 오버라이딩하지 않으면 주소비교를함
//값비교를 하고싶으면 equals()와 hashCode()를 오버라이딩해야함
class Person{
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}

	public int hashCode() {
		//int hash(Object... values) //가변인자
		return Objects.hash(age, name);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		//Object 리모콘에는 name과 age가 없으므로 Person으로 형변환 해줘야함
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	
}
