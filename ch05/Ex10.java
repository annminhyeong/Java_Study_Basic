package ch05;

public class Ex10 {

	public static void main(String[] args) {
		String str1 = "ABCDE";
		
		//charAt(index) : ���ڿ����� �ش� ��ġ(index)�� �ִ� ���ڸ� ��ȯ
		char ch = str1.charAt(2);
		System.out.println(ch);
		
		//subString(from, to): ���ڿ����� �ش� ���� (from ~ to)�� ���ڿ� ��ȯ (to�� ���� �ȵ�)
		//to�� �����ϸ� from ���� ���ڿ� ������ ����
		String str2 = str1.substring(0,3);
		System.out.println(str2);
	}

}
