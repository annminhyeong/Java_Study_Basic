package ch02;

public class Ex5 {

	public static void main(String[] args) {
		//%b : boolean ���� ���
		//%d : 10���� ���� ���� ���
		//%o : 8���� ���� ���� ���
		//%x : 16���� ���� ���� ���
		//%f : �ε� �Ҽ��� ���� ���
		//%e : ���� ǥ���� ���� ���
		//%c : ���� ���� ���
		//%s : ���ڿ� ���� ���
		
//		System.out.printf("%d%n", 15); //10����
//		System.out.printf("%#o%n", 15); //8����
//		System.out.printf("%#x%n", 15); //16����
//		System.out.printf("%s%n", Integer.toBinaryString(15)); //2����
		
//		double f = 123.456789;
//		System.out.printf("%f%n", f);
		
		//���� : %(+, -, 0)��ü�ڸ����� : - ��������, + ����������, ��ĭ 0���� ä��
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		//�Ǽ� : %(+, -, 0)��ü�ڸ�.�Ҽ����Ʒ��ڸ����� : -��������, +����������
		double d = 1.23456789;
		System.out.printf("[%14.10f]%n", d);
		System.out.printf("[%.10f]%n", d);
		
		
		//���ڿ� : %(+, -)��ü�ڸ����� : - ��������, + ����������
		System.out.printf("[%s]%n", "www.code.com");
		System.out.printf("[%20s]%n", "www.code.com");
		System.out.printf("[%.10s]%n", "www.code.com"); //���ڿ� �Ϻ� ���
		
	}

}
