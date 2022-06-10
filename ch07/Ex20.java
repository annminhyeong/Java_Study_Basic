package ch07;


//외부클래스
public class Ex20 {
	
	//인스턴스 내부클래스
	//iv처럼사용
	//규칙) 인스턴스 클래스에서는 static 멤버를 쓸수 없다. (상수는 제외)-> 이해하기 X ,규칙임
	class InstainceInnerClass{
		int iv = 100;
		//static int cv = 100; //static 클래스만 static맴버를 정의할 수 있음
		
		//상수케이스
		//1. 인스턴스를 생성할때 마다 동일한 값을 갖는 상수는 static을 붙임
		//2. 인스턴스를 생성할때 마다 다른 값을 갖는 상수는 static으로 선언하면 안됨, 인스턴스 생성이후에는 변경불가
			
		//상수앞에 static을 써도 되는이유는 
		//매번 인스턴스를 생성할 때 동일한 값을 갖기 때문에 static 붙이는 것을 허용함
		final static int CONST = 100;
	}
	
	//스태틱 내부클래스
    //cv처럼 사용
	//규칙) 스태틱 내부클래스에서만 static 멤버를 쓸수 있다. -> 이해하기 X ,규칙임
	static class StaticInnerClass{
		int iv = 200;
		
		//static 맴버는 객체 생성 없이 쓸수 있어야함 그런데
		//static 클래스가 아니면 instance 클래스이므로 객체를 생성해야 쓸수 있음 -> 모순발생
		//그러므로 클래스 앞에 static을 붙임
		
		//static 내부 클래스에서는 외부 클래스의 인스턴스 맴버에 접근할 수 없음
		//이유는 외부에 인스턴스가 생성되지 않았을 수도 있기때문에 쓸 수 없음
		static int cv = 200;
	}
	
	void method() {
		
		//지역 내부클래스
		//lv처럼 사용
		//규칙) 지역 내부클래스에서는 static 멤버를 쓸수 없다. (상수는 제외)-> 이해하기 X ,규칙임
		class LocalInnerClass{
			int iv = 300;
			//static int cv = 300; //static 클래스만 static맴버를 정의할 수 있음
			
			//상수앞에 static을 써도 되는이유는 
			//매번 인스턴스를 생성할 때 동일한 값을 갖기 때문에 static 붙이는 것을 허용함
			
			
			//지역내부클래스상수는 메서드 내에서만 사용가능
			final static int CONST = 300;
		}
		System.out.println(LocalInnerClass.CONST); //가능
	}
	
	public static void main(String[] args) {
		System.out.println(InstainceInnerClass.CONST);
		System.out.println(StaticInnerClass.cv);
		//System.out.println(LocalInnerClass.CONST); //에러: 지역내부클래스는 메서드 안에서만 사용가능
	}
}
