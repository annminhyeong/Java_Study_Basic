package ch07;

public class Ex21 {
	class InstanceInner{}
	static class StaticInner{} 
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static �޼���� �ܺ�Ŭ������ ��ü���������ʰ� �����ֱ⶧���� ��ü�� �������� ������ ���Ұ���
		//InstanceInner obj1 = new InstanceInner(); 
		StaticInner obj2 = new StaticInner();
		
		//�ܺ�Ŭ������ü�� �����ѵ� ����Ŭ���� ��ü�������ϸ� static �޼��忡�� �ν��Ͻ� ����Ŭ���� ��밡��
		Ex21 outer = new Ex21();
		InstanceInner obj3 = outer.new InstanceInner();
	}
	
	void InstanceMethod() {
		//�ν��Ͻ� �޼���� �ܺ�Ŭ������ ��ü�� �����ؾ� ��밡���ϱ⶧���� �׳� ��� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//��������Ŭ������ �ܺο��� ���� �Ұ���
		//LocalInner obj3 = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
