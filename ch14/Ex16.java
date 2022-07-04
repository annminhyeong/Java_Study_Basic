package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

//flatMap : Stream���� Stream�� Stream���� ��ȯ

public class Ex16 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "GHI", "JKL"}
		);
		
		//Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		
		//�����迭�� ��ġ�� �������� flatMap() 
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
			"Belive or not It is true",
			"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		
		//�����迭�� ��ġ�� �������� flatMap()
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) //" +" ���Խ��� (�ϳ��̻��� ����)
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}
}
