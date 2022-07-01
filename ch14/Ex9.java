package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림 만들기 - 컬렉션
//컬렉션 인터페이스의 stream()으로 컬렉션을 스트림으로 변환
//Collection 인터페이스의 메서드
//Stream<E> stream() :list를 기반으로 새로운 스트림 생성


//스트림 만들기 - 배열
//객체 배열로 부터 스트림 생성하기
//Stream<T> Stream.of(T... values) //가변 인자
//Stream<T> Stream.of(T[])
//Stream<T> Arrays.stream(T[])
//Stream Arrays.stream(T[] array, int startInclusive, int endExclusive)

//기본형 배열로 부터 스트림 생성하기
//IntStream IntStream.of(int... values) //Stream이 아니라 IntStream
//IntStream IntStream.of(int[])
//IntStream Arrays.stream(int[])
//IntStream Arrays.stream(int[] array, int startInclusive, int endexclusive)


public class Ex9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//list데이터 소스로하는 새로은 스트림생성
		Stream<Integer> intStream1 = list.stream();
		intStream1.forEach(System.out::print);
		System.out.println();
		
		//에러 : 스트림은 1회용, stream이 최종연산을하면 stream이 닫힌다.
		//intStream.forEach(System.out::print);
		
		Stream<String> strStream1 = Stream.of("a","b","c");
		//이렇게 사용해도 됨 (중괄호만은 안됨)
		//Stream<String> strStream = Stream.of(new String[] {"a","b","c"});
		strStream1.forEach(System.out::println);
		
		//Arrays.stream(객체를 넣아야함)
		Stream<String> strStream2 = Arrays.stream(new String[] {"d", "e", "f"});
		strStream2.forEach(System.out::print);
		System.out.println();
		
		
		int[] intArr1 = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr1);
		intStream2.forEach(System.out::print);
		System.out.println();
		
		IntStream intStream3 = Arrays.stream(intArr1);
		//에러 최종연산은 한번만가능
		//System.out.println("count= "+ intStream3.count());
		
		//IntStream은 다양한 숫자관련 메서드 제공 (sum, count, average 등등)
		System.out.println("sum= "+intStream3.sum());

		
		Integer[] intArr2 = {6,7,8,9,10};
		//는 아래와 같이 컴파일러가 자동으로 오토박싱해준다.
		//Integer[] intArr5 = {new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)};
		Stream<Integer> intStream4 = Stream.of(intArr2);
		intStream4.forEach(System.out::print);
		System.out.println();
		
		Stream<Integer> intStream5 = Stream.of(intArr2);
		System.out.println("count= "+intStream5.count());
	}
}
