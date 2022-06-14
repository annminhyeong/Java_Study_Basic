package ch09;

import java.util.Date;

public class Ex8 {

	public static void main(String[] args) {
		//String toLowerCase() : String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s1 = "Hello";
		String s2 = s1.toLowerCase();

		//String toUpperCase() : String 인스턴스에 저장되었는 모든 문자열을 대문자로 변환하여 반환한다.
		String s3 = "Hello";
		String s4 = s3.toUpperCase();

		//String trim() : 
		//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		String s5 = "     Hello World    ";
		String s6 = s5.trim();

		//static String valueOf() : 
		//지정된값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(100f);
		String d = String.valueOf(100.0);
		Date dd = new Date();
		String date = String.valueOf(dd);
	}

}
