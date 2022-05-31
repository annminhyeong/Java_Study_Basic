package ch02;

public class Ex5 {

	public static void main(String[] args) {
		//%b : boolean 형식 출력
		//%d : 10진수 정수 형식 출력
		//%o : 8진수 정수 형식 출력
		//%x : 16진수 정수 형식 출력
		//%f : 부동 소수점 형식 출력
		//%e : 지수 표현식 형식 출력
		//%c : 문자 형식 출력
		//%s : 문자열 형식 출력
		
//		System.out.printf("%d%n", 15); //10진수
//		System.out.printf("%#o%n", 15); //8진수
//		System.out.printf("%#x%n", 15); //16진수
//		System.out.printf("%s%n", Integer.toBinaryString(15)); //2진수
		
//		double f = 123.456789;
//		System.out.printf("%f%n", f);
		
		//정수 : %(+, -, 0)전체자리형식 : - 왼쪽정렬, + 오른쪽정렬, 빈칸 0으로 채움
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		//실수 : %(+, -, 0)전체자리.소수점아래자리형식 : -왼쪽정렬, +오른쪽정렬
		double d = 1.23456789;
		System.out.printf("[%14.10f]%n", d);
		System.out.printf("[%.10f]%n", d);
		
		
		//문자열 : %(+, -)전체자리형식 : - 왼쪽정렬, + 오른쪽정렬
		System.out.printf("[%s]%n", "www.code.com");
		System.out.printf("[%20s]%n", "www.code.com");
		System.out.printf("[%.10s]%n", "www.code.com"); //문자열 일부 출력
		
	}

}
