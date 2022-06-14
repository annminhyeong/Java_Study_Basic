package ch09;

public class Ex14 {

	public static void main(String[] args) {
		//void setCharAt(int index, char ch) : 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.
		StringBuffer sb1 = new StringBuffer("0123456");
		sb1.setCharAt(5,'o');

		//void setLength(int newLength) : 
		//지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우에 나머지 빈 공간을 널문자 '\u0000'로 채워진다.
		StringBuffer sb2 = new StringBuffer("0123456");
		sb2.setLength(5);

		StringBuffer sb3 = new StringBuffer("0123456");
		sb3.setLength(10);
		String str1 = sb2.toString().trim();

		//String toString() : StringBuffer인스턴스의 문자열을 String으로 반환
		StringBuffer sb4 = new StringBuffer("0123456");
		String str2 = sb4.toString();

		//String substring(int start)
		//String substring(int start, int end) : 
		//지정된 범위 내의 문자열을 뽑아서 반환한다. 시작위치(start)만 지정하면 시작위치부터 문자열 끝가지 뽑아서 반환한다.
		StringBuffer sb5 = new StringBuffer("0123456");
		String str3 = sb5.substring(3);
		String str4 = sb5.substring(3,5);
	}
}
