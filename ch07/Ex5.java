package ch07;


//super() ������: ������ �����ڸ� ȣ���Ҷ� ���
//super() ����
//�������� ù �ٿ� �ݵ�� �����ڸ� ȣ���ؾ� �Ѵ�. (this() �ƴϸ� super()�� ȣ���ؾ���)
//�׷��� ������ �����Ϸ��� �������� ù�⿡ super()�� �����Ѵ�.
class Point3{
	int x;
	int y;
	
	Point3(int x, int y){
		//super()�� �Ⱦ��� Object()�� �⺻�����ڸ� �ڵ����� �߰���
		//super(); 
		this.x = x;
		this.y = y;
	}
}

class Point3D3 extends Point3{
	int z;

	Point3D3(int x, int y, int z){
		//super(x, y)�� Point3 ������(Point3(x, y))�� ȣ����
		//���� super(x, y); ���� ������ super()�� �ڵ����� �����Ϸ��� �߰��ϴµ�
		//Point3���� �⺻�����ڰ� ��� ������ �߻��Ѵ�.
		super(x, y);
		this.z = z;
	}
}
public class Ex5 {

}
