package ch09;

public class Ex14 {

	public static void main(String[] args) {
		//void setCharAt(int index, char ch) : ������ ��ġ�� ���ڸ� �־��� ����(ch)�� �ٲ۴�.
		StringBuffer sb1 = new StringBuffer("0123456");
		sb1.setCharAt(5,'o');

		//void setLength(int newLength) : 
		//������ ���̷� ���ڿ��� ���̸� �����Ѵ�. ���̸� �ø��� ��쿡 ������ �� ������ �ι��� '\u0000'�� ä������.
		StringBuffer sb2 = new StringBuffer("0123456");
		sb2.setLength(5);

		StringBuffer sb3 = new StringBuffer("0123456");
		sb3.setLength(10);
		String str1 = sb2.toString().trim();

		//String toString() : StringBuffer�ν��Ͻ��� ���ڿ��� String���� ��ȯ
		StringBuffer sb4 = new StringBuffer("0123456");
		String str2 = sb4.toString();

		//String substring(int start)
		//String substring(int start, int end) : 
		//������ ���� ���� ���ڿ��� �̾Ƽ� ��ȯ�Ѵ�. ������ġ(start)�� �����ϸ� ������ġ���� ���ڿ� ������ �̾Ƽ� ��ȯ�Ѵ�.
		StringBuffer sb5 = new StringBuffer("0123456");
		String str3 = sb5.substring(3);
		String str4 = sb5.substring(3,5);
	}
}
