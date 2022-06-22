package ch12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Iterator<E> : Ŭ������ �ۼ��� ��, ObjectŸ�� ��� T�� ���� Ÿ�Ժ����� ���

class Student {
	String name = ""; //�̸�
	int ban; //��
	int no; //��ȣ
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}

public class Ex4 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 2));
		list.add(new Student("ȫ�浿", 2, 1));
		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			//���׸����� ������������� ����ȯ �ʿ�
			Student s = it.next();
			System.out.printf("%s, %d, %d%n", s.name, s.ban, s.no);
		}
	}
}