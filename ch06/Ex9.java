package ch06;

public class Ex9 {

	public static void main(String[] args) {
		int a = add(1, 2);
		float b = add(1, 2.0f);
		
		System.out.println(a);
		System.out.println(b);
	}
	
	//�����ε�
	//�� Ŭ���� �ȿ� ���� �̸��� �޼��� ���� �� �����ϴ� ��
	//
	//�����ε��� �����ϱ� ���� ����
	//1. �޼��� �̸��� ���ƾ� �Ѵ�.
	//2. �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
	//3. ��ȯ Ÿ���� ���� ����.
	
	static int add(int a) {
		return a;
	}
	
	static float add(float a) {
		return a;
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static float add(float a, int b) {
		return a + b;
	}
	
	static float add(int a, float b) {
		return a + b;
	}
	
	static float add(float a, float b) {
		return a + b;
	}
}
