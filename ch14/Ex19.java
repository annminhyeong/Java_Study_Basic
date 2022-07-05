package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//��Ʈ���� ��������
//forEach() // ���Ľ�Ʈ���� ��� ������ ������� ����: ��Ʈ���� ��� ��ҿ� ������ �۾��� ����
//forEachOrdered() //���Ľ�Ʈ���� ��쿡�� ������ �����: ��Ʈ���� ��� ��ҿ� ������ �۾��� ������� ����
//
//���� �˻�
//allMatch() //��� ��Ҹ� ������Ű�� true
//anyMatch() //�� ��Ҷ� ������Ű�� true
//noneMatch() //��� ��Ұ� ������ ������Ű�� ������ true
//
//���ǿ� ��ġ�ϴ� ��� ã��
//findFirst() // ù��° ��� ��ȯ. ���� ��Ʈ���� ���
//findAny() //�ƹ��ų� ��ȯ ���� ��Ʈ���� ���
//
//reduce() : ��Ʈ���� ��Ҹ� �ϳ��� �ٿ����� �������� ����
//ù��° ���� : �ʱⰪ
//�ι�° ���� : ���� �������� ��Ʈ���� ��ҿ� ������ ����
//����° ���� : ����ó���� ����� ��ġ�µ� ���

public class Ex19 {
	public static void main(String[] args) {
		String[] strArr = {
			"Inheritance", "Java", "Lambda", "stream",
			"OptionalDouble", "IntStream", "count" , "sum"
		};
		Stream.of(strArr)
		.parallel() //����ó��
		.forEach(System.out::println);
		System.out.println();
		
		//���̰� 0�� �ƴ��� Ȯ��
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0);
		
		//ù��° ���ڰ� s�� ���� ��ȯ
		Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
		
		System.out.println("noEmptyStr: " + noEmptyStr);
		System.out.println("sWord: " + sWord.get());
		System.out.println();
		
		//Stream<String[]>�� IntStream���� ��ȯ
		//{11, 4, 6, 6, 14, 9, 5, 3}���� �ٲ�
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a , b) -> a + 1);
		int sum = intStream2.reduce(0, (a , b) -> a + b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count: " + count);
		System.out.println("sum: " + sum);
		System.out.println("max: " + max.getAsInt());
		System.out.println("min: " + min.getAsInt());
		
	}
}
