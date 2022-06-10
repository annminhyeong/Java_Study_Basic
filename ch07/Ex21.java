package ch07;

public class Ex21 {
	class InstanceInner{}
	static class StaticInner{} 
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static 메서드는 외부클래스가 객체생성하지않고 쓸수있기때문에 객체를 생성하지 않으면 사용불가능
		//InstanceInner obj1 = new InstanceInner(); 
		StaticInner obj2 = new StaticInner();
		
		//외부클래스객체를 생성한뒤 내부클래스 객체를생성하면 static 메서드에서 인스턴스 내부클래스 사용가능
		Ex21 outer = new Ex21();
		InstanceInner obj3 = outer.new InstanceInner();
	}
	
	void InstanceMethod() {
		//인스턴스 메서드는 외부클래스가 객체를 생성해야 사용가능하기때문에 그냥 사용 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//지역내부클래스는 외부에서 접근 불가능
		//LocalInner obj3 = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
