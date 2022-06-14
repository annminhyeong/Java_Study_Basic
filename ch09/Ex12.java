package ch09;

public class Ex12 {

	public static void main(String[] args) {
		//int capacity() : StringBuffer 인스턴스의 버퍼크기를 알려준다.
		//length()는 버퍼에 담긴 문자열의 길이를 알려준다
		StringBuffer sb1 = new StringBuffer(100);
		sb1.append("abcd");
		int bufferSize = sb1.capacity();
		int stringSzie = sb1.length();

		//char charAt(int index) : 지정된 위치(index)에 있는 문자를 반환한다.
		StringBuffer sb2 = new StringBuffer("abc");
		char c = sb2.charAt(2);

		//StringBuffer delete(int start, int end) : 시작위치(start)부터 끝 위치(end) 사이에 있는 문자를 제거한다. 단 끝 위치의 문자는 제외
		StringBuffer sb3 = new StringBuffer("0123456");
		StringBuffer sb4 = sb3.delete(3,6);

		//StringBuffer deleteCharAt(int index) : 지정된 위치의 문자를 제거한다.
		StringBuffer sb5 = new StringBuffer("0123456");
		sb5.deleteCharAt(3);

	}

}
