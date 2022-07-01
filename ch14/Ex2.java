package ch14;


@FunctionalInterface
interface MyFuntion2{
	void run();
}

public class Ex2 {
	
	//매개변수타입이 MyFuntion2인 메서드
	static void  excute(MyFuntion2 f) {
		f.run();
	}
	
	//반환타입이 MyFuntion2인 메서드
	static MyFuntion2 getMyfuntion() {
		MyFuntion2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		
		//람다식으로 MyFuntion2를 구현
		MyFuntion2 f1 = () -> System.out.println("f1.run()");
		
		//익명클래스로 run을 구현
		MyFuntion2 f2 = new MyFuntion2() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFuntion2 f3 = getMyfuntion();
		
		f1.run();
		f2.run();
		f3.run();
		
		excute(f1);
		excute(()-> System.out.println("run()"));
	}
}






























