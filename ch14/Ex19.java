package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림의 최종연산
//forEach() // 병렬스트림인 경우 순서가 보장되지 않음: 스트림의 모든 요소에 지정된 작업을 수행
//forEachOrdered() //병렬스트림인 경우에도 순서가 보장됨: 스트림의 모든 요소에 지정된 작업을 순서대로 수행
//
//조건 검사
//allMatch() //모든 요소를 만족시키면 true
//anyMatch() //한 요소라도 만족시키면 true
//noneMatch() //모든 요소가 조건을 만족시키지 않으면 true
//
//조건에 일치하는 요소 찾기
//findFirst() // 첫번째 요소 반환. 순차 스트림에 사용
//findAny() //아무거나 반환 병렬 스트림에 사용
//
//reduce() : 스트림의 요소를 하나씩 줄여가며 누적연산 수행
//첫번째 인자 : 초기값
//두번째 인자 : 이전 연산결과와 스트림의 요소에 수행할 연산
//세번째 인자 : 병렬처리된 결과를 합치는데 사용

public class Ex19 {
	public static void main(String[] args) {
		String[] strArr = {
			"Inheritance", "Java", "Lambda", "stream",
			"OptionalDouble", "IntStream", "count" , "sum"
		};
		Stream.of(strArr)
		.parallel() //병렬처리
		.forEach(System.out::println);
		System.out.println();
		
		//길이가 0이 아닌지 확인
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0);
		
		//첫번째 글자가 s인 글자 반환
		Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
		
		System.out.println("noEmptyStr: " + noEmptyStr);
		System.out.println("sWord: " + sWord.get());
		System.out.println();
		
		//Stream<String[]>을 IntStream으로 변환
		//{11, 4, 6, 6, 14, 9, 5, 3}으로 바뀜
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
