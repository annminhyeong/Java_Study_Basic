package ch09;

public class Ex16 {
	public static void main(String[] args) {
		//static double random() : 0<= x < 1 ������ ������ double���� ��ȯ�Ѵ�. 
		double d1 = Math.random();
		int i1 = (int)(Math.random()*10)+1;
		
		//static double rint(double a) : 
		//�־��� double���� ���� ����� �������� double ���·� ��ȯ�Ѵ�. �� �� ���� ��� �ִ� ��(1.5, 2.5, 3.5 ��)�� ¦���� ��ȯ
		double d2 = Math.rint(1.2);
		double d3 = Math.rint(2.6);
		double d4 = Math.rint(3.5);
		double d5 = Math.rint(4.5);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		//static long round(double a)
		//static long round(float a) : �Ҽ��� ù°�ڸ����� �ݿø��� ������(long)�� ��ȯ�Ѵ�. �� ���� ������ִ� ���� �׻� ū ������ ��ȯ
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
