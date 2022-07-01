package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

//���ٽ��� �޼��� ������ ��ȯ
//�������� �޼��� ����
//
//�Ű����� 0���� ���
//���ٽ� : Supplier<MyClass> s = () -> new MyClass();
//�޼��� ����: Supplier<MyClass> s = MyClass::new
//
//�Ű����� 1���� ���
//���ٽ� : Funtion<Integer, MyClass> s = (i) -> new MyClass(i);
//�޼��� ���� : Funtion<Integer, MyClass> s = MyClass::new;
//
//�迭�� �޼��� ����
//���ٽ� : Funtion<Integer, int[]> f = x -> new int[x]
//�޼��� ���� : Funtion<Integer, int[]> f = int[]::new;

class MyClass{
	int iv;
	MyClass() {}
	MyClass(int iv) {
		this.iv = iv;
	}
}

public class Ex7 {
	public static void main(String[] args) {
		//���ٽ�
		//MyClass ��ü ��ȯ
		Supplier<MyClass> s1 = () -> new MyClass(); //Supplier�� �Է�X, ���O
		
		//�޼��� ����
		Supplier<MyClass> s2 = MyClass::new;
		
		System.out.println("�ν��Ͻ� ���� �Է�X ���ٽ�: " + s1.get());
		System.out.println("�ν��Ͻ� ���� �Է�X ���ٽ�: " + s1.get());
		
		System.out.println("�ν��Ͻ� ���� �Է�X �޼�������: " + s2.get());
		System.out.println("�ν��Ͻ� ���� �Է�X �޼�������: " + s2.get());
		System.out.println();
		
		//���ٽ�
		//MyClass ��ü�� ��ȯ
		Function<Integer, MyClass> s3 = (i) -> new MyClass(i);
		
		//�޼��� ����
		Function<Integer, MyClass> s4 = MyClass::new;
		
		System.out.println("�ν��Ͻ� ���� �Է�1�� ���ٽ�: " + s3.apply(1));
		System.out.println("�ν��Ͻ� ���� �Է�1�� ���ٽ�: " + s3.apply(1));
		
		System.out.println("�ν��Ͻ� ���� �Է�1�� �޼�������: " + s4.apply(1));
		System.out.println("�ν��Ͻ� ���� �Է�1�� �޼�������: " + s4.apply(1));
		System.out.println();
		
		System.out.println("�ν��Ͻ� ���� �Է�1�� �޼��������� iv��: " + s4.apply(1).iv);
		System.out.println();
		
		//���ٽ� �迭
		//�迭��ü�� ��ȯ
		Function<Integer, int[]> f1 = (i) -> new int[i];
		
		//�޼��� ����
		Function<Integer, int[]> f2 = int[]::new;
		
		System.out.println("f1 �迭ũ��: " + f1.apply(5).length);
		System.out.println("f2 �迭ũ��: " + f2.apply(5).length);
	}
}
