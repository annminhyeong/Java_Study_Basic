package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

//람다식을 메서드 참조로 변환
//생성자의 메서드 참조
//
//매개변수 0개인 경우
//람다식 : Supplier<MyClass> s = () -> new MyClass();
//메서드 참조: Supplier<MyClass> s = MyClass::new
//
//매개변수 1개인 경우
//람다식 : Funtion<Integer, MyClass> s = (i) -> new MyClass(i);
//메서드 참조 : Funtion<Integer, MyClass> s = MyClass::new;
//
//배열과 메서드 참조
//람다식 : Funtion<Integer, int[]> f = x -> new int[x]
//메서드 참조 : Funtion<Integer, int[]> f = int[]::new;

class MyClass{
	int iv;
	MyClass() {}
	MyClass(int iv) {
		this.iv = iv;
	}
}

public class Ex7 {
	public static void main(String[] args) {
		//람다식
		//MyClass 객체 반환
		Supplier<MyClass> s1 = () -> new MyClass(); //Supplier은 입력X, 출력O
		
		//메서드 참조
		Supplier<MyClass> s2 = MyClass::new;
		
		System.out.println("인스턴스 생성 입력X 람다식: " + s1.get());
		System.out.println("인스턴스 생성 입력X 람다식: " + s1.get());
		
		System.out.println("인스턴스 생성 입력X 메서드참조: " + s2.get());
		System.out.println("인스턴스 생성 입력X 메서드참조: " + s2.get());
		System.out.println();
		
		//람다식
		//MyClass 객체를 반환
		Function<Integer, MyClass> s3 = (i) -> new MyClass(i);
		
		//메서드 참조
		Function<Integer, MyClass> s4 = MyClass::new;
		
		System.out.println("인스턴스 생성 입력1개 람다식: " + s3.apply(1));
		System.out.println("인스턴스 생성 입력1개 람다식: " + s3.apply(1));
		
		System.out.println("인스턴스 생성 입력1개 메서드참조: " + s4.apply(1));
		System.out.println("인스턴스 생성 입력1개 메서드참조: " + s4.apply(1));
		System.out.println();
		
		System.out.println("인스턴스 생성 입력1개 메서드참조의 iv값: " + s4.apply(1).iv);
		System.out.println();
		
		//람다식 배열
		//배열객체를 반환
		Function<Integer, int[]> f1 = (i) -> new int[i];
		
		//메서드 참조
		Function<Integer, int[]> f2 = int[]::new;
		
		System.out.println("f1 배열크기: " + f1.apply(5).length);
		System.out.println("f2 배열크기: " + f2.apply(5).length);
	}
}
