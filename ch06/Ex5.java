package ch06;

public class Ex5 {

	public static void main(String[] args) {
		long result1 = MyMath.add(1L, 2L);
		long result2 = MyMath.subtract(1L, 2L);
		
		MyMath mm = new MyMath();
		long result3 = mm.multiply(3L, 2L);
		double result4 = mm.divide(5.0, 3.0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}

class MyMath{
	//�޼���� Ŭ���� ������ ���� ����
	//�޼��忡�� �ϳ��� ��ɸ� �ֱ�, result�� 0~1�Ǹ� ��ȯ�� �� ����
	static long add(long a, long b) { return a + b; };
	static long subtract(long a, long b) { return a - b; };
	long multiply(long a, long b) { return a * b; };
	double divide(double a, double b) { return a / b; };
}
