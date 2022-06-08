package ch07;
//�������̵� : ��ӹ��� ������ �޼��带 �ڽſ� �°� �����ϴ� ��, ����δ� ����Ұ�

//�������̵� ����
//1. �����(String, int, void)�� ����Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�.
//2. ����������(public, protected, default, private)�� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����.
//3. ����(throws)�� ���� Ŭ������ �޼��庸�� ���� ������ �� ����.

class MyPoint3{
	int x;
	int y;

	String getLocation() {
		return "x:"+ x + "y:" + y;
	}
	
	//����Ŭ���� Object�� ���� ��ӹ��� toString() �޼��� ������
	public String toString() {
		return "Object Ŭ������ toString() ������";
	}
	
}

class MyPoint3D extends MyPoint3{
	int z;
	
	//�θ�Ŭ���� MyPoint3�� getLocation()�޼��� ������
	String getLocation() {
		return "x:"+ x + "y:" + y + "z:" + z;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		MyPoint3 mp = new MyPoint3();
		
		System.out.println(mp.toString());
		System.out.println(mp); //toString() ��������
		
		
		MyPoint3D p = new MyPoint3D();
		p.x = 10;
		p.y = 20;
		p.z = 30;
		System.out.println(p.getLocation());
	}

}
