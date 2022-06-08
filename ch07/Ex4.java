package ch07;
//super ���������� ������ �ɹ��� �ڽ��� �ɹ��� �����ϴµ� ����
//super : ������ �ɹ�
//this : ����� ��ü(Ŭ����)�� �ɹ�
class Parent1{
	int x = 10; // super.x
}

class Child1 extends Parent1{
	int x = 20; // this.x
	
	void method() {
		System.out.println("x:"+ x); //Child1�� x�� Parent1�� x���� �����Ƿ� child1�� x (�ٸ��ּҸ� ����Ŵ)
		System.out.println("this.x:"+ this.x); //Child1�� x�� Parent1�� x���� �����Ƿ� child1�� x (�ٸ��ּҸ� ����Ŵ)
		System.out.println("super.x:"+ super.x); //������ x
	}
}

class Child2 extends Parent1{
	void method() {
		System.out.println("x:"+ x); //Child2���� x�� ��ӹ޾ұ⶧���� x�� ����� ���� (���� �ּҸ� ����Ŵ)
		System.out.println("this.x:"+ this.x); //Child2���� x�� ��ӹ޾ұ⶧���� x�� ����� ���� (���� �ּҸ� ����Ŵ)
		System.out.println("super.x:"+ super.x); //������ x
	}
}


public class Ex4 {

	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		ch1.method();
		
		Child2 ch2 = new Child2();
		ch2.method();
	}

}
