package ch09;

public class Ex9 {
	public static void main(String[] args) {
		//join()�� StringJoiner
		//join()�� ���� ���ڿ� ���̿� �����ڸ� �־ �����Ѵ�.
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		String str = String.join("-", arr); //�迭�� ���ڿ��� "-"�� �����ڷ� ����
		System.out.println(str);
		
		//���ڿ��� �⺻�� ���� ��ȯ
		int i = 100;
		String str1 = i+"";
		String str3 = Integer.toString(100);
		String str2 = String.valueOf(i);

		//���ڿ��� ���ڷ� �ٲٴ� ��� 2����
		int i1 = Integer.parseInt("100");
		int i2 = Integer.valueOf("100");
		Integer i3 = Integer.valueOf("100");

	}
}
