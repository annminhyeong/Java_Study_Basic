package ch07;

class Mypoint{
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
		System.out.printf("%d, %d, %d", c.p.x, c.p.y, c.r);
	}

}
