package ch09;

public class Ex6 {

	public static void main(String[] args) {
		//int indexOf(int ch, int pos) :
		//지정된위치(pos)부터 주어진문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못찾으면 -1를 반환한다.
		String s1 = "Hello";
		int idx1 = s1.indexOf('e', 0);
		int idx2 = s1.indexOf('e', 2);

		//int indexOf(String str)
		//주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1를 반환한다.
		String s2 = "ABCDEFG";
		int idx3 = s2.indexOf("CD");

		//int lastIndexOf(int ch) : 
		//지정된문자(ch) 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아내서 위치(index)를 알려준다. 못찾으면 -1을 반환한다.
		String s3 = "java.lang.Object";
		int idx4 = s3.lastIndexOf('.');
		int idx5 = s3.indexOf('.');

		//int lastIndexOf(String str) : 
		//지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아내 위치(index)를 알려준다. 못찾으면 -1를 반환한다.
		String s4 = "java.lang.java";
		int idx6 = s4.lastIndexOf("java");
		int idx7 = s4.indexOf("java");

		//int length() : 문자열의 길이를 알려준다.
		String s5 = "Hello";
		int length = s5.length();
	}

}
