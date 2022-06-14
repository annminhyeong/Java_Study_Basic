package ch09;

public class Ex10 {

	public static void main(String[] args) {
		//StringBuffer 클래스
		//1. String 처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
		//2. StringBuffer는 String과 달리 내용을 변경할 수 있다.
		//3. StringBuffer는 equals가 오버라이딩되어있지 않다.(주소비교)
		//4. StringBuffer의 값비교는 string으로 변환한뒤에 equals()로 비교해야한다.

		//배열은 길이 변경불가능함 공간이 부족하면 새로운 배열을 생성하고 내용을 복사한다음 변경된 주소값을 참조변수에 넣어야하므로
		//StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야한다.
		
		StringBuffer str = new StringBuffer("StringBuffer");
		System.out.println(str);
	}
}
