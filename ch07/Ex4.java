package ch07;
//super 참조변수는 조상의 맴버와 자신의 맴버를 구별하는데 쓰임
//super : 조상의 맴버
//this : 가까운 객체(클래스)의 맴버
class Parent1{
	int x = 10; // super.x
}

class Child1 extends Parent1{
	int x = 20; // this.x
	
	void method() {
		System.out.println("x:"+ x); //Child1의 x가 Parent1의 x보다 가까우므로 child1의 x (다른주소를 가리킴)
		System.out.println("this.x:"+ this.x); //Child1의 x가 Parent1의 x보다 가까우므로 child1의 x (다른주소를 가리킴)
		System.out.println("super.x:"+ super.x); //조상의 x
	}
}

class Child2 extends Parent1{
	void method() {
		System.out.println("x:"+ x); //Child2에서 x를 상속받았기때문에 x는 조상과 같음 (같은 주소를 가리킴)
		System.out.println("this.x:"+ this.x); //Child2에서 x를 상속받았기때문에 x는 조상과 같음 (같은 주소를 가리킴)
		System.out.println("super.x:"+ super.x); //조상의 x
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
