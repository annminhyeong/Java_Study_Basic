package ch09;

import java.util.Date;

public class Ex8 {

	public static void main(String[] args) {
		//String toLowerCase() : String�ν��Ͻ��� ����Ǿ��ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		String s1 = "Hello";
		String s2 = s1.toLowerCase();

		//String toUpperCase() : String �ν��Ͻ��� ����Ǿ��� ��� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		String s3 = "Hello";
		String s4 = s3.toUpperCase();

		//String trim() : 
		//���ڿ��� ���� ���� ������ ���� �ִ� ������ ���� ����� ��ȯ�Ѵ�. �� �� ���ڿ� �߰��� �ִ� ������ ���ŵ��� �ʴ´�.
		String s5 = "     Hello World    ";
		String s6 = s5.trim();

		//static String valueOf() : 
		//�����Ȱ��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�Ѵ�. ���������� ���, toString()�� ȣ���� ����� ��ȯ�Ѵ�.
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(100f);
		String d = String.valueOf(100.0);
		Date dd = new Date();
		String date = String.valueOf(dd);
	}

}
