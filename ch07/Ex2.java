package ch07;

//�θ� ���� ��� Ŭ������ object Ŭ������ ��� �޴´�.
//extends Object �����Ϸ��� �������� �߰�����
class Mypoint {
	int x;
	int y;	
}

//���
//class Circle extends Mypoint{
//	int r;
//}

//����
class Circle{
	Mypoint p = new Mypoint();
	int r;
}


public class Ex2 {
	//���԰���
	//Ŭ������ �ɹ��� ���������� �����ϴ� ��
	//
	//��Ӱ���: a�� b�̴�
	//���԰���: a�� b�� ������ �ִ�. (��κ� ���԰���)

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println(c.toString()); //��Ű���̸�.Ŭ�����̸�@��ü�ּҰ�
		System.out.println(c); //toString() ��������
		System.out.printf("%d, %d, %d", c.p.x, c.p.y, c.r);
	}

}
