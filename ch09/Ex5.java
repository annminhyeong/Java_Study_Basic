package ch09;

public class Ex5 {
	public static void main(String[] args) {
		//String concat(String str) : 문자열(str)을 뒤에 덧붙인다.
		String s1 = "Hello";
		String s2 = s1.concat(" World");

		//boolean contains(CharSequence s) : 지정된문자열(s)가 포함되었는지 검사한다.
		String s3 = "abcdefg";
		boolean b1 = s3.contains("bc");

		//boolean endsWith(String suffix) :지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");

		//boolean equals(Object obj) : 매개변수로 받은 문자열(obj)과 String 인스턴스 문자열을 비교한다. 문자열이아니거나 같지않으면 false를 반환함
		String s4 = "Hello";
		boolean b3 = s4.equals("Hello");
		boolean b4 = s4.equals("hello");

		//boolean equalsIgnoreCase(String str) : 문자열과 String인스턴스의 문자열의 대소문자 상관 없이 비교
		String s5 = "Hello";
		boolean b5 = s5.equalsIgnoreCase("Hello");
		boolean b6 = s5.equalsIgnoreCase("hello");

		//int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치를 알려준다. 못찾으면 -1를 반환한다.
		String s6 = "Hello";
		int idx1 = s6.indexOf('o');
		int idx2 = s6.indexOf('k');

	}
}
