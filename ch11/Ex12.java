package ch11;

import java.util.HashSet;
import java.util.Objects;

//HashSet(������) : �ߺ� x, ���� x
//HashSet�� ��ü�� �����ϱ����� ������ ���� ��ü�� �ִ��� Ȯ��
//���� ��ü�� ������ �����ϰ� ������ �������� �ʴ´�
//boolean add(Object o)�� ������ ��ü�� equals() �� hashCode()�� ȣ��
//equals()�� hashCode()�� �������̵� �Ǿ� �־����


public class Ex12 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc"); //�ߺ��̶� ����ȵ�
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));		
		System.out.println(set);
	}
}
//equals()�� hashCode()�� �������̵����� ������ �ּҺ񱳸���
//���񱳸� �ϰ������ equals()�� hashCode()�� �������̵��ؾ���
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
		//int hash(Object... values) //��������
		return Objects.hash(age, name);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		//Object �����ܿ��� name�� age�� �����Ƿ� Person���� ����ȯ �������
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	
}
