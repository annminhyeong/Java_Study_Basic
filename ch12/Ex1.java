package ch12;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		//���׸��� : �����Ͻ� Ÿ���� üũ���ִ� ���
		//���׸������� Ÿ���� �˰������Ƿ� �����Ϸ��� �ڵ����� ����ȯ ����
		//������������ϰ� �����ÿ��� ���׸���Ÿ���� Object ���, �� ����ȯ�ؾ���
		//JDK1.5 ���� Ŭ����Ÿ�Կ� Object�� �ִ°�� ���׸�Ÿ���� �ʼ��� ��

		
		//ArrayList list = new ArrayList(); //JDK1.5����, ���׸��� ������
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10); //list.add(new Integer(10);
		list.add(20);
		list.add("30"); //String�� �߰�
		
		//������ OK, ����� ����ȯ���� �߻�
		//�����Ϸ��� �Ѱ�, �����Ϸ��� ���δ� üũ�� �� ����
		Integer i = (Integer)list.get(2); 
		
		System.out.println(list);
	}
}
