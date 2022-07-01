package ch14;

import java.util.Random;
import java.util.stream.IntStream;

//스트림 만들기 임의의 수
//난수를 요소로 갖는 스트림 생성하기

public class Ex10 {
	public static void main(String[] args) {
		//무한 난수 스트림
		IntStream intStream1 = new Random().ints();
				
		//limit으로 범위를 제한하지 않으면 무한으로 랜덤값 찍힘
		intStream1.limit(5).forEach(System.out::println);
		System.out.println();
		
		
		//limit안주고 처음부터 개수 지정하기 가능
		IntStream intStream2 = new Random().ints(5);
		intStream2.forEach(System.out::println);
		System.out.println();
		
		//limit안주고 처음부터 숫자범위 지정가능
		IntStream intStream3 = new Random().ints(5,1,10); //start ~ end (end는 포함안됨)
		intStream3.forEach(System.out::println);
	}
}
