package ch07;

class Mypoint{
	int x;
	int y;	
}

//상속
//class Circle extends Mypoint{
//	int r;
//}

//포함
class Circle{
	Mypoint p = new Mypoint();
	int r;
}


public class Ex2 {
	//포함관계
	//클래스의 맴버로 참조변수를 선언하는 것
	//
	//상속관계: a는 b이다
	//포함관계: a는 b를 가지고 있다. (대부분 포함관계)

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.printf("%d, %d, %d", c.p.x, c.p.y, c.r);
	}

}
