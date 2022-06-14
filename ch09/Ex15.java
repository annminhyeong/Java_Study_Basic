package ch09;

public class Ex15 {
	public static void main(String[] args) {
		//StringBuilder 클래스
		//StringBuffer와 거의 같은 의미이다.
		
		//StringBuilder 클래스와 StringBuffer차이점
		//StringBuilder는 동기화 되어있지 않다.
		//멀티 쓰레드 프로그램이 아닌경우, 동기화는 필요한 성능저하를 일으킴
		//StringBuffer는 동기화(데이터 보호)되어 있다. 멀티 쓰레드에 안전(thread-safe)

		//Math클래스
		//수학관련 static메서드의 집합

		//static double abs(type a) : 주어진값의 절대값을 반환한다.
		int i1 = Math.abs(-10);
		double d1 = Math.abs(-10.0);

		//static double ceil(double a) : 주어진 값을 올림하여 반환한다.
		double d2 = Math.ceil(10.1);
		double d3 = Math.ceil(-10.1);
		double d4 = Math.ceil(10.000015);

		//static double floor(double a) : 주어진 값을 버림하여 반환한다.
		double d5 = Math.ceil(10.8);
		double d6 = Math.ceil(-10.8);

		//static double max(type a, type b) : 주어진 두 값을 비교하여 큰쪽을 반환한다.
		double d7 = Math.max(9.5, 9.50001);
		int i2 = Math.max(0, -1);
		
		//static type min(type a, type b) : 주어진 두 값을 비교하야 작은 쪽을 반환한다.
		double d8 = Math.min(9.5, 9.50001);
		int i3 = Math.min(0, -1);
	}
}
