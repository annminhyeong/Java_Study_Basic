package ch09;

public class Ex4 {

	public static void main(String[] args) {
		//String(String s) : �־��� ���ڿ�(s)�� ���� String �ν��Ͻ��� ����
		String s1 = new String("Hello");
		
		//String(char[] value) : char�迭�� ���ڿ��� ��ȯ�� string �ν��Ͻ��� ����
		char[] c1 = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c1);

		//String(StringBuffer buf) : StringBuffer�� ���� ���ڿ��� String �ν��Ͻ��� ����
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);

		//char charAt(int index) : ������ ��ġ�� �ִ� ���ڸ� �˷���
		String s4 = "Hello";
		String n1 = "0123456";
		char c = s2.charAt(1);
		char c2 = n1.charAt(1);

		//int compareTo(String str) : ���ڿ��� ��������(a,b,c ��)�� ���Ѵ�. ������ 0��, ���������� �����̸� ����, �����̸� ����� ��ȯ�Ѵ�. 
		int i1 = "aaa".compareTo("aaa"); //0
		int i2 = "aaa".compareTo("bbb");//-1
		int i3 = "bbb".compareTo("aaa");//1
	}

}
