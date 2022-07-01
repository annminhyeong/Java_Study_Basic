package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//��Ʈ�� ����� - �÷���
//�÷��� �������̽��� stream()���� �÷����� ��Ʈ������ ��ȯ
//Collection �������̽��� �޼���
//Stream<E> stream() :list�� ������� ���ο� ��Ʈ�� ����


//��Ʈ�� ����� - �迭
//��ü �迭�� ���� ��Ʈ�� �����ϱ�
//Stream<T> Stream.of(T... values) //���� ����
//Stream<T> Stream.of(T[])
//Stream<T> Arrays.stream(T[])
//Stream Arrays.stream(T[] array, int startInclusive, int endExclusive)

//�⺻�� �迭�� ���� ��Ʈ�� �����ϱ�
//IntStream IntStream.of(int... values) //Stream�� �ƴ϶� IntStream
//IntStream IntStream.of(int[])
//IntStream Arrays.stream(int[])
//IntStream Arrays.stream(int[] array, int startInclusive, int endexclusive)


public class Ex9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//list������ �ҽ����ϴ� ������ ��Ʈ������
		Stream<Integer> intStream1 = list.stream();
		intStream1.forEach(System.out::print);
		System.out.println();
		
		//���� : ��Ʈ���� 1ȸ��, stream�� �����������ϸ� stream�� ������.
		//intStream.forEach(System.out::print);
		
		Stream<String> strStream1 = Stream.of("a","b","c");
		//�̷��� ����ص� �� (�߰�ȣ���� �ȵ�)
		//Stream<String> strStream = Stream.of(new String[] {"a","b","c"});
		strStream1.forEach(System.out::println);
		
		//Arrays.stream(��ü�� �־ƾ���)
		Stream<String> strStream2 = Arrays.stream(new String[] {"d", "e", "f"});
		strStream2.forEach(System.out::print);
		System.out.println();
		
		
		int[] intArr1 = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr1);
		intStream2.forEach(System.out::print);
		System.out.println();
		
		IntStream intStream3 = Arrays.stream(intArr1);
		//���� ���������� �ѹ�������
		//System.out.println("count= "+ intStream3.count());
		
		//IntStream�� �پ��� ���ڰ��� �޼��� ���� (sum, count, average ���)
		System.out.println("sum= "+intStream3.sum());

		
		Integer[] intArr2 = {6,7,8,9,10};
		//�� �Ʒ��� ���� �����Ϸ��� �ڵ����� ����ڽ����ش�.
		//Integer[] intArr5 = {new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)};
		Stream<Integer> intStream4 = Stream.of(intArr2);
		intStream4.forEach(System.out::print);
		System.out.println();
		
		Stream<Integer> intStream5 = Stream.of(intArr2);
		System.out.println("count= "+intStream5.count());
	}
}
