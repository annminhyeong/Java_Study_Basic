package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//java.util.funtion패키지
//자주 사용되는 다양한 함수형 인터페이스 제공

//매개변수가 1개인 함수형 인터페이스
//T : 매개변수타입, R :반환타입
//java.lang.Runnable : 매개변수도 없고, 반환값도 없을때 사용
//Supplier<T> : 매개변수없고 반환값만 있을때 사용
//Consumer<T> : 매개변수만 있고 반환값이 없음
//Function<T,R> : 일반적인함수. 하나의 매개변수를 받아서 결과를 반환할때 사용
//Predicate<T> : 조건식을 표현하는데 사용. 매개변수는하나 반환타입은 boolean

//매개변수가 2개인 함수형 인터페이스
//T : 첫번째매개변수타입, U: 두번째매개변수타입 R:반환타입
//BiConsumer<T,U> : 두개의 매개변수만 있고, 반환값은 없음
//BiPredicate<T,U> : 조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean
//BiFuntion<T,U,R> : 두 개의 매개변수를 받아서 하나의 결과를 반환

//매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스
//T : 매개변수타입
//UnaryOperator<T> : Funtion의 자손, Funtion과 달리 매개변수와 결과타입이 같다
//BinaryOperator<T> : BiFuntion의 자손, BiFuntion과 달리 매개변수와  결과타입이 같다


public class Ex3 {
	public static void main(String[] args) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); //list를 랜덤값으로 채운다
		System.out.println(list);
		printEvenNum(p, c, list); //짝수를 출력
		List<Integer> newList = doSomething(f,list);
		System.out.println(newList);
	}


	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) {
			//일의자리를 없애서 새로운 list에 저장
			newList.add(f.apply(i));
		}
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			//짝수인지 검사
			if(p.test(i)) {
				//화면에 i 출력
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			//Supplier로부터 1~100까지 난수를 받아 list에 추가
			list.add(s.get()); 
		}
	}
}















