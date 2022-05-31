package ch02;

public class Ex4 {

	public static void main(String[] args) {
		//byte, short의 리터럴은 없음, 대신 값의 범위가 넘어가면 에러 발생
		byte num = 127; //범위: -128 ~ 127
		
		//접두사
		int i = 100; //10진수
		int binary = 0b111; //2진수: 앞에 0b가 붙으면 2진수
		int oct = 0100; //8진수: 앞에0이 붙으면 8진수
		int hex = 0x100; //16진수: 앞에 0x가 붙으면 16진수
		
		
		//접미사
		//Long타입의 변수를 사용할때 L를 뒤에 붙여야함
		Long l = 10_000_000_000L;
		
		//float타입의 변수를 사용할때 f를 뒤에 붙여야함 (생략불가)
		float f = 3.14f;
		
		//double이 기본타입
		//double타입의 변수를 사용할때 d를 뒤에 붙여야함(생략가능)
		double d = 3.14d;
		
		//변수의 타입이 리터럴(값)의 범위보다 큰것 가능
		
		
	}

}
