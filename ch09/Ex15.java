package ch09;

public class Ex15 {
	public static void main(String[] args) {
		//StringBuilder Ŭ����
		//StringBuffer�� ���� ���� �ǹ��̴�.
		
		//StringBuilder Ŭ������ StringBuffer������
		//StringBuilder�� ����ȭ �Ǿ����� �ʴ�.
		//��Ƽ ������ ���α׷��� �ƴѰ��, ����ȭ�� �ʿ��� �������ϸ� ����Ŵ
		//StringBuffer�� ����ȭ(������ ��ȣ)�Ǿ� �ִ�. ��Ƽ �����忡 ����(thread-safe)

		//MathŬ����
		//���а��� static�޼����� ����

		//static double abs(type a) : �־������� ���밪�� ��ȯ�Ѵ�.
		int i1 = Math.abs(-10);
		double d1 = Math.abs(-10.0);

		//static double ceil(double a) : �־��� ���� �ø��Ͽ� ��ȯ�Ѵ�.
		double d2 = Math.ceil(10.1);
		double d3 = Math.ceil(-10.1);
		double d4 = Math.ceil(10.000015);

		//static double floor(double a) : �־��� ���� �����Ͽ� ��ȯ�Ѵ�.
		double d5 = Math.ceil(10.8);
		double d6 = Math.ceil(-10.8);

		//static double max(type a, type b) : �־��� �� ���� ���Ͽ� ū���� ��ȯ�Ѵ�.
		double d7 = Math.max(9.5, 9.50001);
		int i2 = Math.max(0, -1);
		
		//static type min(type a, type b) : �־��� �� ���� ���Ͼ� ���� ���� ��ȯ�Ѵ�.
		double d8 = Math.min(9.5, 9.50001);
		int i3 = Math.min(0, -1);
	}
}
