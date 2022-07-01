package ch14;

import java.util.stream.Stream;

//��Ʈ�� ����� - Ư�� ������ ����
//IntStream IntStream.range(int begin, int end) //end ���Ծȵ�
//IntStream IntStream.rangeClosed(int begin, int end) //end ����
//
//��Ʈ�� ����� ���ٽ�
////seed : �ʱⰪ, f: ���ٽ�
//static <T> Stream<T> iterate(T seed UnaryOperator<T> f) //������ҿ� ������
//
////s :���ٽ�
//static <T> Stream<T> generate(Supplier<T> s) // ������ҿ� ������
//
//iterate()�� ���� ��Ҹ� seed�� �ؼ� ���� ��Ҹ� �����Ѵ�.
//
//generate()�� seed�� ������� �ʴ´�.

public class Ex11 {
	public static void main(String[] args) {
		
		//���� ��Ʈ����
		Stream<Integer> intStream1 = Stream.iterate(1, n -> n + 2);
		intStream1.limit(10).forEach(System.out::println);
		
		//���� ��Ʈ����
		Stream<Integer> intStream2 = Stream.generate(() -> 1);
		intStream2.limit(10).forEach(System.out::println);
	}
}
