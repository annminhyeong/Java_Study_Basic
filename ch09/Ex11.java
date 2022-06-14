package ch09;

public class Ex11 {
	public static void main(String[] args) {
		//StringBuffer() : 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb1 = new StringBuffer(); //크기16
		

		//StringBuffer(int length) : 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb2 = new StringBuffer(10); //크기10
		

		//StringBuffer(String str) : 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb3 = new StringBuffer("Hi"); //크기16
		

		//StringBuffer append() : 매개변수로 입력된 값을 문자열로 변환하여 Stringbuffer인스턴스가 저장하고 있는 문자열 뒤에 덧붙인다.
		//sb4, sb5, sb6는 참조변수 주소값이 같다.
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = sb4.append(true);
		sb4.append('d').append(10.0f);
		StringBuffer sb6 = sb4.append("ABC").append(123);
	}
}
