package ch09;

public class Ex18 {
	public static void main(String[] args) {
		
		//���ڿ��� ���ڷ� ��ȯ�ϴ� �پ��� ���
		int i1 = new Integer("100").intValue();
		int i2 = Integer.parseInt("100"); //10����
		int i3 = Integer.parseInt("100", 2); //2����
		int i4 = Integer.parseInt("100", 8); //8����
		int i5 = Integer.parseInt("100", 16); //16����
		Integer i6 = Integer.valueOf("100");
		
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

	}
}
