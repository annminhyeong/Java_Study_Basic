package ch09;

public class Ex13 {
	public static void main(String[] args) {
		//StringBuffer insert(int pos, type) : 
		//�ι�° �Ű������� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������ ��ġ(pos)�� �߰��Ѵ�. pos�� 0���� ����
		StringBuffer sb1 = new StringBuffer("0123456");
		sb1.insert(4,'.');

		//int length() : StringBuffer�ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ���̸� ��ȯ�Ѵ�. 
		StringBuffer sb2 = new StringBuffer("0123456");
		int length = sb2.length();

		//StringBuffer replace(int start, int end, String str) : 
		//������ ����(start ~ end)�� ���ڵ��� �־������ڿ�(str)�� �ٲ۴�. (start<= x < end)
		StringBuffer sb3 = new StringBuffer("0123456");
		sb3.replace(3, 6, "AB");

		//StringBuffer reverse() : StringBuffer�ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ������ �Ųٷ� �����Ѵ�.
		StringBuffer sb4 = new StringBuffer("0123456");
		sb4.reverse();
	}
}
