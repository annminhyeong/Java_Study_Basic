package ch07;

public class Ex25 extends Object {
	//�͸�Ŭ����
	//�̸��� ���� ��ȸ�� Ŭ���� ���ǿ� ������ ���ÿ�
	//����1: new ����Ŭ�����̸�(){ }
	//����2: new ����(����)�������̽��̸�(){ }
	
	Object iv = new Object() {void method(){}}; //�͸�Ŭ����
	static Object cv = new Object() {void method(){}}; //�͸�Ŭ����

	void myMethod() {
		Object lv = new Object() {void method(){}}; //�͸�Ŭ����
	}

}
