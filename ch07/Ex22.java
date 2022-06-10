package ch07;

public class Ex22 {
	private int outIv = 0;
	private static int outCv = 0;
	
	class InstanceInner{
		int innerIv = outIv;
		int innerCv = outCv;
	}
	
	static class StaticInner{
		//스테틱클래스에서는 인스턴스맴버에 접근불가
		//int innerIv = outIv;
		int innerCv = outCv;
	}
	
	void myMethod() {
		int Lv = 0;//jdk1.8이상부터 값이 바뀌지 않는 변수는 상수취급하므로 final 생략가능
		//Lv++; 값을 바꾸면 에러발생
		final int LConst = 0; 
		
		//내부클래스의 객체가 메서드의 지역변수보다 더 오래 존재가능(쓰레드)
		//지역 내부클래스를 감싸고있는 메서드의 상수만 가능
		class LocalInner{
			int innerIv = outIv; 
			int innerCv = outCv;
			
			//외부클래스의 지역변수는 상수만 접근가능하다.
			int innerLv = Lv; //jdk1.8이상에서는 값이 안바뀌면 컴파일러가 자동으로 final을 붙여주기때문에 에러 아님
			int innerLConst = LConst;
		}
	}
}
