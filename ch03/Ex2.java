package ch03;

public class Ex2 {
	public static void main(String[] args) {
		int a = 1_000_000; //10^6
		int b = 2_000_000; //2*10^6
		
		
//		long c = a * b; //10^12����,  int�� ������ 10^9���� �����÷ο� �߻�
		long c = (long)a * b;
		
		System.out.println(c);
	}
}
