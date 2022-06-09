package ch07;

//외부클래스
public class Ex20 {
	
	//인스턴스 내부클래스
    //iv처럼사용
	class InstainceInnerClass{
		int iv = 100;
		//static int cv = 100; //static 클래스만 static맴버를 정의할 수 있음
		final static int CONST = 100; //final static은 상수이므로 가능
	}
	
	//스태틱 내부클래스
    //cv처럼 사용
	static class StaticInnerClass{
		int iv = 100;
		
		//static 내부 클래스에서는 외부 클래스의 인스턴스에 접근할 수 없음
		static int cv = 100; //static 클래스만 static맴버를 정의할 수 있음
	}
	
	void method() {
		
		//지역 내부클래스
		//lv처럼사용, 메서드 안에서만 사용가능
		class LocalInnerClass{
			int iv = 100;
			//static int cv = 100; //static 클래스만 static맴버를 정의할 수 있음
			final static int CONST = 100; //final static은 상수이므로 가능
		}
		System.out.println(LocalInnerClass.CONST); //가능
	}
	
	public static void main(String[] args) {
		System.out.println(InstainceInnerClass.CONST);
		System.out.println(StaticInnerClass.cv);
		//System.out.println(LocalInnerClass.CONST); //에러: 지역내부클래스는 메서드 안에서만 사용가능
	}
}
