package ch09;

public class Ex6 {

	public static void main(String[] args) {
		//int indexOf(int ch, int pos) :
		//��������ġ(pos)���� �־�������(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. ��ã���� -1�� ��ȯ�Ѵ�.
		String s1 = "Hello";
		int idx1 = s1.indexOf('e', 0);
		int idx2 = s1.indexOf('e', 2);

		//int indexOf(String str)
		//�־��� ���ڿ��� �����ϴ��� Ȯ���Ͽ� �� ��ġ(index)�� �˷��ش�. ������ -1�� ��ȯ�Ѵ�.
		String s2 = "ABCDEFG";
		int idx3 = s2.indexOf("CD");

		//int lastIndexOf(int ch) : 
		//�����ȹ���(ch) �Ǵ� �����ڵ带 ���ڿ��� ������ ���������� ã�Ƴ��� ��ġ(index)�� �˷��ش�. ��ã���� -1�� ��ȯ�Ѵ�.
		String s3 = "java.lang.Object";
		int idx4 = s3.lastIndexOf('.');
		int idx5 = s3.indexOf('.');

		//int lastIndexOf(String str) : 
		//������ ���ڿ��� �ν��Ͻ��� ���ڿ� ������ ���� ã�Ƴ� ��ġ(index)�� �˷��ش�. ��ã���� -1�� ��ȯ�Ѵ�.
		String s4 = "java.lang.java";
		int idx6 = s4.lastIndexOf("java");
		int idx7 = s4.indexOf("java");

		//int length() : ���ڿ��� ���̸� �˷��ش�.
		String s5 = "Hello";
		int length = s5.length();
	}

}
