package ch09;

public class Ex10 {

	public static void main(String[] args) {
		//StringBuffer Ŭ����
		//1. String ó�� ������ �迭(char[])�� ���������� ������ �ִ�.
		//2. StringBuffer�� String�� �޸� ������ ������ �� �ִ�.
		//3. StringBuffer�� equals�� �������̵��Ǿ����� �ʴ�.(�ּҺ�)
		//4. StringBuffer�� ���񱳴� string���� ��ȯ�ѵڿ� equals()�� ���ؾ��Ѵ�.

		//�迭�� ���� ����Ұ����� ������ �����ϸ� ���ο� �迭�� �����ϰ� ������ �����Ѵ��� ����� �ּҰ��� ���������� �־���ϹǷ�
		//StringBuffer�� ������ ���ڿ��� ���̸� ����ؼ� ������ ũ��� �����ؾ��Ѵ�.
		
		StringBuffer str = new StringBuffer("StringBuffer");
		System.out.println(str);
	}
}
