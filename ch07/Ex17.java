package ch07;

//�������̽��� ����
//1. �� ��ü���� '����, ��ȭ, ����'�� ���� �߰� ������ �Ѵ�.
//2. ����� ������ �и���ų�� �ִ�.
//3. ���� �ð��� ������ �� �ִ�
//4. ���濡 ������ ������ ���谡 �����ϴ�
//5. ǥ��ȭ�� �����ϴ�
//6. ���� ������� Ŭ�������� �����ְ� �ξ��� �� �ִ�.

class A{
	//�������̽��� ����ϸ� �����ڵ带 �ٲ� �ʿ䰡 ����
	//public void method(B b) {  }
	//public void method(C c) {  }
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I{
	public void method() { System.out.println("B method"); }
}

class C implements I{
	public void method() { System.out.println("C method"); }
}
public class Ex17 {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); //A�� B�� ���(����)
	}

}
