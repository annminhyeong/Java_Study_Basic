package ch09;

public class Ex5 {
	public static void main(String[] args) {
		//String concat(String str) : ���ڿ�(str)�� �ڿ� �����δ�.
		String s1 = "Hello";
		String s2 = s1.concat(" World");

		//boolean contains(CharSequence s) : �����ȹ��ڿ�(s)�� ���ԵǾ����� �˻��Ѵ�.
		String s3 = "abcdefg";
		boolean b1 = s3.contains("bc");

		//boolean endsWith(String suffix) :������ ���ڿ�(suffix)�� �������� �˻��Ѵ�.
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");

		//boolean equals(Object obj) : �Ű������� ���� ���ڿ�(obj)�� String �ν��Ͻ� ���ڿ��� ���Ѵ�. ���ڿ��̾ƴϰų� ���������� false�� ��ȯ��
		String s4 = "Hello";
		boolean b3 = s4.equals("Hello");
		boolean b4 = s4.equals("hello");

		//boolean equalsIgnoreCase(String str) : ���ڿ��� String�ν��Ͻ��� ���ڿ��� ��ҹ��� ��� ���� ��
		String s5 = "Hello";
		boolean b5 = s5.equalsIgnoreCase("Hello");
		boolean b6 = s5.equalsIgnoreCase("hello");

		//int indexOf(int ch) : �־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷��ش�. ��ã���� -1�� ��ȯ�Ѵ�.
		String s6 = "Hello";
		int idx1 = s6.indexOf('o');
		int idx2 = s6.indexOf('k');

	}
}
