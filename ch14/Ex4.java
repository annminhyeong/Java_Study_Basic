package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

//Predicate(조건식)의 결합 

//and(), or(), negate()으로 두 Predicate를 하나로 결합(default 메서드)

//등가비교를 위한 Predicate의 작성에는 isEqual()를 사용(static 메서드)


public class Ex4 {
	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> Integer.parseInt(s, 16);
		Function<Integer, String> g1 = i ->Integer.toBinaryString(i);
		
		//andThen : f1의 결과값을 g1함수의인자로 넣는다.
		//funtion(f1의 인자타입, g1의 결과타입)
		Function<String, String> h1 = f1.andThen(g1);
		
		//compose (andThen의 반대) : g1의 결과값을 f1의 함수의 인자로 넣는다.
		//funtion(g1의 인자타입, f1의 결과타입)
		Function<Integer, Integer> h2 = f1.compose(g1);
		
		//h1이라는 익명함수의 인자에 "FF" 넣기
		System.out.println(h1.apply("FF"));
		//h2이라는 익명함수의 인자에 "2" 넣기
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 = x -> x;
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p1 = i -> i < 100;
		Predicate<Integer> q1 = i -> i < 200;
		Predicate<Integer> r1 = i -> i%2 ==0;
		Predicate<Integer> notP1 = p1.negate(); //not 조건식 반대
		
		Predicate<Integer> all = notP1.and(p1.or(r1));
		
		//all이라는 익명함수의 인자에 "150" 넣기
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		//boolean result = str1.equals(str2) 랑 같음
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}
