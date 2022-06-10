package ch07;

class Outer2{
	class InstanceInner{
		int iv = 1;
	}
	
	static class StaticInner{
		int iv = 2;
		static int cv = 3;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 4;
		}
	}
}
public class Ex23 {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ic = oc.new InstanceInner(); //그냥 문법임 암기
		
		System.out.println("인스턴스 내부클래스 iv:"+ic.iv);
		System.out.println("스태틱 내부클래스 cv:"+Outer2.StaticInner.cv);
		
		Outer2.StaticInner sc = new Outer2.StaticInner(); //그냥 문법임 암기
		System.out.println("스태틱 내부클래스 iv:"+sc.iv);
		
	}
}
