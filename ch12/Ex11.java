package ch12;
//�ֳ����̼�
//�ּ�ó�� ���α׷��� �� ������ ��ġ�� ������, ������ ������ ����
//
//@Override
//�������̵��� �ùٸ��� �ߴ��� �����Ϸ��� üũ�ϰ��Ѵ�.

//@Deprecated
//������ ������� ���� ���� �����ϴ� �ʵ峪 �޼��忡 ���δ�.

//@FuntionalInterface
//�Լ��� �������̽��� ���̸�, �����Ϸ��� �ùٸ��� �ۼ��ߴ��� üũ
//�Լ��� �������̽����� �ϳ��� �߻�޼��常 ������ �Ѵٴ� ������ ����

//@SuppressWarnings
//�����Ϸ��� ���޽����� ��Ÿ���� �ʰ� �����Ѵ�.

class Parent{
	void parentMethod() {}
}

//�Լ��� �������̽��� �ϳ��� �߻�޼��常 ����
@FunctionalInterface
interface Testable{
	void test(); //�߻�޼���
	//void check(); //�߻�޼���
}	

public class Ex11 extends Parent{
	
	@Override
	@Deprecated
	void parentMethod() {}
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Ex11 e = new Ex11();
		e.parentMethod(); //Deprecate�� �޼��� ���
	}
}
