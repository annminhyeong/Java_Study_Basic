package ch07;
//오버라이딩 : 상속받은 조상의 메서드를 자신에 맞게 변경하는 것, 선언부는 변경불가

//오버라이딩 조건
//1. 선언부(String, int, void)가 조상클래스의 메서드와 일치해야 한다.
//2. 접근제어자(public, protected, default, private)를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//3. 예외(throws)는 조상 클래스의 메서드보다 많이 선언할 수 없다.

class MyPoint3{
	int x;
	int y;

	String getLocation() {
		return "x:"+ x + "y:" + y;
	}
	
	//조상클래스 Object로 부터 상속받은 toString() 메서드 재정의
	public String toString() {
		return "Object 클래스의 toString() 재정의";
	}
	
}

class MyPoint3D extends MyPoint3{
	int z;
	
	//부모클래스 MyPoint3의 getLocation()메서드 재정의
	String getLocation() {
		return "x:"+ x + "y:" + y + "z:" + z;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		MyPoint3 mp = new MyPoint3();
		
		System.out.println(mp.toString());
		System.out.println(mp); //toString() 생략가능
		
		
		MyPoint3D p = new MyPoint3D();
		p.x = 10;
		p.y = 20;
		p.z = 30;
		System.out.println(p.getLocation());
	}

}
