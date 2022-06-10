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
		Outer2.InstanceInner ic = oc.new InstanceInner(); //�׳� ������ �ϱ�
		
		System.out.println("�ν��Ͻ� ����Ŭ���� iv:"+ic.iv);
		System.out.println("����ƽ ����Ŭ���� cv:"+Outer2.StaticInner.cv);
		
		Outer2.StaticInner sc = new Outer2.StaticInner(); //�׳� ������ �ϱ�
		System.out.println("����ƽ ����Ŭ���� iv:"+sc.iv);
		
	}
}
