package ch12;

import java.util.HashMap;

//HashMap<K,V>
//���� ���� Ÿ�Ժ����� �ʿ��Ѱ��, �޸��� ������

class Student1 {
	String name = ""; //�̸�
	int ban; //��
	int no; //��ȣ
	int kor; //����
	int eng; //����
	int math; //����
	
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
		
		//JDK1.7���� �������� Ÿ�Ժ��� �������� 
		HashMap<String, Student1> map =  new HashMap<>(); 
		
		map.put("�ڹٿ�", new Student1("�ڹٿ�", 1, 1, 100, 100, 100));
		Student1 s = map.get("�ڹٿ�"); //���׸��� �Ⱦ��� ����ȯ �������
		
		System.out.println(map);
		System.out.printf("%s, %d, %d, %d, %d, %d%n", s.name, s.ban, s.no, s.kor, s.eng, s.math);
	}
}











