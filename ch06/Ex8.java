package ch06;

public class Ex8 {
	//static �޼���� �ν��Ͻ� �޼��� ������ : iv ��� ����
	//��ü : iv ����
	
	//static�� ����Ӽ�
	//�ν��Ͻ��� �����Ӽ�
	
	//�ν��Ͻ� �޼���
	//�ν��Ͻ� ������, ��������.�޼����̸�() ���� ȣ��
	//�ν��Ͻ� �ɹ� (iv, im)�� ���õ� �۾��� �ϴ� �޼���
	//�޼��� ������ �ν��Ͻ� ����, �ν��Ͻ� �޼��� ��밡��
	
	//static �޼���
	//��ü�������� Ŭ�����̸�.�޼����̸�()���� ȣ��
	//�ν��Ͻ� �ɹ� (iv, im)�� ���þ��� �۾��� �ϴ� �޼���
	//�޼��� ������ �ν��Ͻ� ����, �ν��Ͻ� �޼��� ���Ұ�

	//iv : intence variable, im : instance method
	
	public static void main(String[] args) {
		TestClass2.classMethod(); //���� static �޼��尡 ���� Ŭ������ �ִٸ� Ŭ������ ��������
		
		TestClass2 cc = new TestClass2();
		cc.instanceMethod();
	}
}

class TestClass2{
	int iv;
	static int cv; //������ ��밡��
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void classMethod() {
		//static�� ��ü�� �������� �ʰ� ���, �ν��Ͻ� ������ ��ü�� ������ ��� ����
		//static �޼��尡 �ν��Ͻ� ������ ȣ�������� ��ü�� �����Ǿ��ٴ� ������ �����Ƿ� ��� �Ұ���
		//System.out.println(iv);
		System.out.println(cv);
	}	
}
