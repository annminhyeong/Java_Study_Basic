package ch09;

public class Ex11 {
	public static void main(String[] args) {
		//StringBuffer() : 16���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb1 = new StringBuffer(); //ũ��16
		

		//StringBuffer(int length) : ������ ������ ���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb2 = new StringBuffer(10); //ũ��10
		

		//StringBuffer(String str) : ������ ���ڿ� ��(str)�� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb3 = new StringBuffer("Hi"); //ũ��16
		

		//StringBuffer append() : �Ű������� �Էµ� ���� ���ڿ��� ��ȯ�Ͽ� Stringbuffer�ν��Ͻ��� �����ϰ� �ִ� ���ڿ� �ڿ� �����δ�.
		//sb4, sb5, sb6�� �������� �ּҰ��� ����.
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = sb4.append(true);
		sb4.append('d').append(10.0f);
		StringBuffer sb6 = sb4.append("ABC").append(123);
	}
}
