package ch09;

public class Ex12 {

	public static void main(String[] args) {
		//int capacity() : StringBuffer �ν��Ͻ��� ����ũ�⸦ �˷��ش�.
		//length()�� ���ۿ� ��� ���ڿ��� ���̸� �˷��ش�
		StringBuffer sb1 = new StringBuffer(100);
		sb1.append("abcd");
		int bufferSize = sb1.capacity();
		int stringSzie = sb1.length();

		//char charAt(int index) : ������ ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		StringBuffer sb2 = new StringBuffer("abc");
		char c = sb2.charAt(2);

		//StringBuffer delete(int start, int end) : ������ġ(start)���� �� ��ġ(end) ���̿� �ִ� ���ڸ� �����Ѵ�. �� �� ��ġ�� ���ڴ� ����
		StringBuffer sb3 = new StringBuffer("0123456");
		StringBuffer sb4 = sb3.delete(3,6);

		//StringBuffer deleteCharAt(int index) : ������ ��ġ�� ���ڸ� �����Ѵ�.
		StringBuffer sb5 = new StringBuffer("0123456");
		sb5.deleteCharAt(3);

	}

}
