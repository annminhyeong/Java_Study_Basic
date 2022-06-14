package ch09;

public class Ex16 {
	public static void main(String[] args) {
		//static double random() : 0<= x < 1 범위의 임의의 double값을 반환한다. 
		double d1 = Math.random();
		int i1 = (int)(Math.random()*10)+1;
		
		//static double rint(double a) : 
		//주어진 double값과 가장 가까운 정수값을 double 형태로 반환한다. 단 두 정수 가운데 있는 값(1.5, 2.5, 3.5 등)은 짝수로 반환
		double d2 = Math.rint(1.2);
		double d3 = Math.rint(2.6);
		double d4 = Math.rint(3.5);
		double d5 = Math.rint(4.5);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		//static long round(double a)
		//static long round(float a) : 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다. 두 정수 정가운데있는 값은 항상 큰 정수로 반환
		long d6 = Math.round(1.2);
		long d7 = Math.round(2.6);
		long d8 = Math.round(3.5);
		long d9 = Math.round(4.5);
		
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
	}
}
