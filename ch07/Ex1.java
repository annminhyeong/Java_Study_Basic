package ch07;

class Point{
	int x = 1;
	int y = 2;
}

class Point3D extends Point{
	int z = 3;
}
public class Ex1 {
	//��� Ư¡
	//1. �ڼ��� ������ ��� �ɹ��� ��ӹ޴´�.(������, �ʱ�ȭ�� ����)
	//2. �ڼ��� �ɹ������� ���󺸴� ���� �� ���� (���ų� ����)
	//3. �ڼ��� ������ ���� ������ ��ġ�� �ʴ´�.

	public static void main(String[] args) {
		Point3D p3D = new Point3D();
		System.out.printf("%d, %d, %d",p3D.x, p3D.y, p3D.z);
	}

}
