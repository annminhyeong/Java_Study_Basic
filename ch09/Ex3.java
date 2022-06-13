package ch09;


//String 클래스 =데이터(char[]) + 메서드(문자열관련)
//문자열을 다루기 위한 클래스
//내용을 변경할 수 없는 불변클래스임
//덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐
//문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer(내용변경 가능)를 사용


public class Ex3 {
	public static void main(String[] args) {
		String a = "a"; //주소값: 0x100
		String b = "b"; //주소값: 0x200
		
		//내용을 변경할 수 없는 불변클래스 이므로 새로운 주소값에 저장함 
		a = a + b; //주소값: 0x300
		
		//문자열 리터럴방식은 값이 같으면 참조변수가 가리키는 주소값이 같음
		//문자열 리터럴은 프로그램 실행시 자동으로 생성된다. 
		//모든 문자열은 constant pool에 저장됨
		String str1 = "abc"; //주소값: 0x400
		String str2 = "abc"; //주소값: 0x400
		
		//문자열 new연산자방식은 값이 같아도 참조변수가 가리키는 주소값은 다름
		String str3 = new String("abc"); //주소값: 0x500
		String str4 = new String("abc"); //주소값: 0x600
	}
}
