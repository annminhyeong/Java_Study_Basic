package ch09;

public class Ex7 {

	public static void main(String[] args) {
		//String[] split(String regex) : ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�.
		String animals1 = "dog,cat,bear";
		String[] arr1 = animals1.split(",");

		//String[] split(String regex, int limit) : 
		//���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�. �� ���ڿ� ��ü�� ������ ��(limit)�� �ڸ���.
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(",", 2);

		//boolean startsWith(String prefix) : �־��� ���ڿ�(prefix)�� �����ϴ��� �˻��Ѵ�.
		String s1 = "java.lang.Object";
		boolean b1 =s1.startsWith("java");
		boolean b2 =s1.startsWith("lang");

		//String substring(int begin)
		//String substring(int begin, int end) 
		//: �־��� ������ġ(begin)���� ����ġ(end) ������ ���Ե� ���ڿ��� ��´� ������ġ�� ���ڿ��� ���Ե����� �� ��ġ�� ���ڴ� ���Ե��� �ʴ´�.
		//(begin <= x < end)
		String s2 = "java.lang.Object";
		String c = s2.substring(10);
		String p = s2.substring(5,9);

	}

}
