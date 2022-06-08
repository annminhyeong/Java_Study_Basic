package ch07;

//부모가 없는 모든 클래스는 object 클래스를 상속 받는다.
//extends Object 컴파일러가 저동으로 추가해줌
class Mypoint {
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
		System.out.println(c.toString()); //페키지이름.클래스이름@객체주소값
		System.out.println(c); //toString() 생략가능
		System.out.printf("%d, %d, %d", c.p.x, c.p.y, c.r);
	}

}
