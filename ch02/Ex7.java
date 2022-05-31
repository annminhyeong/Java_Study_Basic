package ch02;

public class Ex7 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)); //문자열 -> 문자
		System.out.println('3' - '0'); //문자 - '0' -> 숫자
		System.out.println(Integer.parseInt("3")); // 문자열 -> 숫자
		System.out.println("3" + 1); //문자열 + 숫자 -> 문자열 
		System.out.println((char)(3  + '0')); // 0은 숫자로 48
	}

}
