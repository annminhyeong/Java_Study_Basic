package ch14;

import java.util.Random;
import java.util.stream.IntStream;

//��Ʈ�� ����� ������ ��
//������ ��ҷ� ���� ��Ʈ�� �����ϱ�

public class Ex10 {
	public static void main(String[] args) {
		//���� ���� ��Ʈ��
		IntStream intStream1 = new Random().ints();
				
		//limit���� ������ �������� ������ �������� ������ ����
		intStream1.limit(5).forEach(System.out::println);
		System.out.println();
		
		
		//limit���ְ� ó������ ���� �����ϱ� ����
		IntStream intStream2 = new Random().ints(5);
		intStream2.forEach(System.out::println);
		System.out.println();
		
		//limit���ְ� ó������ ���ڹ��� ��������
		IntStream intStream3 = new Random().ints(5,1,10); //start ~ end (end�� ���Ծȵ�)
		intStream3.forEach(System.out::println);
	}
}
