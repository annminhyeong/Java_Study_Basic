package ch14;

import java.util.stream.Stream;

//스트림 만들기 - 특정 범위의 정수
//IntStream IntStream.range(int begin, int end) //end 포함안됨
//IntStream IntStream.rangeClosed(int begin, int end) //end 포함
//
//스트림 만들기 람다식
////seed : 초기값, f: 람다식
//static <T> Stream<T> iterate(T seed UnaryOperator<T> f) //이전요소에 종속적
//
////s :람다식
//static <T> Stream<T> generate(Supplier<T> s) // 이전요소에 독립적
//
//iterate()는 이전 요소를 seed로 해서 다음 요소를 개산한다.
//
//generate()는 seed를 사용하지 않는다.

public class Ex11 {
	public static void main(String[] args) {
		
		//무한 스트림임
		Stream<Integer> intStream1 = Stream.iterate(1, n -> n + 2);
		intStream1.limit(10).forEach(System.out::println);
		
		//무한 스트림임
		Stream<Integer> intStream2 = Stream.generate(() -> 1);
		intStream2.limit(10).forEach(System.out::println);
	}
}
