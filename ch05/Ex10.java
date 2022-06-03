package ch05;

public class Ex10 {

	public static void main(String[] args) {
		String str1 = "ABCDE";
		
		//charAt(index) : 문자열에서 해당 위치(index)에 있는 문자를 반환
		char ch = str1.charAt(2);
		System.out.println(ch);
		
		//subString(from, to): 문자열에서 해당 범위 (from ~ to)의 문자열 반환 (to는 포함 안됨)
		//to를 생략하면 from 부터 문자열 끝까지 나옴
		String str2 = str1.substring(0,3);
		System.out.println(str2);
	}

}
