package ch14;

import java.util.function.Function;

//메서드 참조
//람다식을 더 간단히 한 것
//하나의 메서드만 호출하는 람다식은 메서드 참조로 간단히 할 수 있다.

//람다식 (x) -> ClassName.method(x) 을
//static 메서드 참조로 ClassName::method 바꿈

//람다식 (obj, x) -> obj.method(x) 을 
//인스턴스 메서드 참조로 ClassName::method 바꿈

//람다식 (x) -> obj.method(x) 을 
//특정 객체 인스턴스 메서드 참조(거의 안씀) obj::method로 바꿈


public class Ex6 {
	public static void main(String[] args) {
		
		//람다식
		Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
		
		//메서드 참조 : 람다식을 더 간단히 한 것
		Function<String, Integer> f2 = Integer::parseInt;
		
		System.out.println(f1.apply("123") + 321);
		System.out.println(f2.apply("123") + 321);
	}
}
