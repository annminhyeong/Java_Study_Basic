package ch14;

import java.util.Optional;

//Optional<T> : T타입 객체의 래퍼클래스
//null을 줄이기 위해 사용됨
//1. null을 직접 다루는 것은 위험 (NullPointException)
//2. null 체크 : if문 필수, 코드가 지저분해짐
//를 해결하기 위해 나옴

public class Ex17 {
	public static void main(String[] args) {
		//null로 초기화하는것은 바람직 하지 않음
		//int[] arr = null;
		
		int[] arr = new int[0];
		System.out.println("arr.length:"+arr.length);
		
		//null로 초기화하는것은 바람직하지 않음
		//Optional<String> opt = null;
		
		////빈객체 생성
		Optional<String> opt = Optional.empty();
		
		//abc로 초기화
		//Optional<String> opt = Optional.of("abc");
		
		System.out.println("opt:" + opt);
		
		String str = "";
		
		//optional 값꺼낼때는 get(), get()은 null을 꺼낼려고 하면 NullpointException 발생
		try {
			str = opt.get();
		} catch (Exception e) {
			str = "";
		}
		System.out.println("opt.get:" + str);
		
		//Null처리 안하고 싶을때
		System.out.println("opt.orElse:"+ opt.orElse(""));
		
		//람다식 사용하고 싶을때
		System.out.println("opt.orElseGet:"+ opt.orElseGet(String::new));
	}
}
