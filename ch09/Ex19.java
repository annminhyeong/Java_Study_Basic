package ch09;

import java.util.ArrayList;

public class Ex19 {
	public static void main(String[] args) {
		//����ڽ� & ��ڽ�
		//�⺻���� �������� �ڵ� ����ȯ
		//JDK1.5�������� �⺻���� ���������� ������ �Ұ���
		
		//�⺻���� ���������� ����ȯ ���� -> JDK1.5���ĺ��� �����Ϸ��� valueOf()�ٿ��� �ڵ� ����ȯ ����

		//int(�⺻��) -> Integer(������) : ����ڽ�
		//Integer(������) -> int(�⺻��) : ��ڽ�
		
		//ArrayList : ��ü�� ���尡���� Ŭ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//JDK1.5�������� �������� JDK1.5���Ŀ��� int�� Integer�� �����Ϸ��� �ڵ� ����ȯ ����
		list.add(100); 
		list.add(new Integer(100));//�� list���� ��ü�� �߰�����
		
		Integer i1 = list.get(0); //list�� ����� ù��° ��ü�� ������
		int i2 = list.get(0).intValue();//intValue()�� Integer ������ Ÿ���� �⺻��Ÿ������ �ٲ۴�.
		int i3 = list.get(0); //JDK1.5���Ŀ��� �ڵ����� �����Ϸΰ� ������Ÿ���� �⺻������ �ٲ���
		
	}
}
