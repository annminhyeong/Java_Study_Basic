package ch07;

//내부 클래스
//클래스 안에 클래스를 넣는 것
//장점: 내부클래스에서 외부클래스 객체를 생성하지 않고 외부클래스의 멤버에 접근 가능
//코드의 복잡성을 줄일 수 있다. (캡슐화)
//외부클래스에서만 사욜할것 같을때 사용

class AAA{//AAA는 BBB의 외부 클래스
	int i = 100;
	BBB b = new BBB();
	
	//BBB클래스는 AAA클래스에서만 사용하고 싶을때 내부클래스 사용하기
	class BBB{ //BBB는 AAA의 내부 클래스
		void getI() {
			//AAA a = new AAA();
			//System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부 클래스 맴버변수에 접근가능
		}
	}
}

//class CCC{
//	BBB b = new BBB();
//}
public class Ex19 {
	public static void main(String[] args) {
		//BBB클래스가 내부클래스이기 때문에 바로 인스턴스 생성불가능
		//BBB b = new BBB();
		//b.getI();
	}
}
