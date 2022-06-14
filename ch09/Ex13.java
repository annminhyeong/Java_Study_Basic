package ch09;

public class Ex13 {
	public static void main(String[] args) {
		//StringBuffer insert(int pos, type) : 
		//두번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다. pos는 0부터 시작
		StringBuffer sb1 = new StringBuffer("0123456");
		sb1.insert(4,'.');

		//int length() : StringBuffer인스턴스에 저장되어 있는 문자열의 길이를 반환한다. 
		StringBuffer sb2 = new StringBuffer("0123456");
		int length = sb2.length();

		//StringBuffer replace(int start, int end, String str) : 
		//지정된 범위(start ~ end)의 문자들을 주어진문자열(str)로 바꾼다. (start<= x < end)
		StringBuffer sb3 = new StringBuffer("0123456");
		sb3.replace(3, 6, "AB");

		//StringBuffer reverse() : StringBuffer인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
		StringBuffer sb4 = new StringBuffer("0123456");
		sb4.reverse();
	}
}
