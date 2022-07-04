package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

//flatMap : Stream안의 Stream을 Stream으로 변환

public class Ex16 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "GHI", "JKL"}
		);
		
		//Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		
		//여러배열을 합치고 싶을때는 flatMap() 
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
		
		//여러배열을 합치고 싶을때는 flatMap()
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) //" +" 정규식임 (하나이상의 공백)
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}
}
