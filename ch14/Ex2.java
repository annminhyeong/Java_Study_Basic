package ch14;


@FunctionalInterface
interface MyFuntion2{
	void run();
}

public class Ex2 {
	
	//�Ű�����Ÿ���� MyFuntion2�� �޼���
	static void  excute(MyFuntion2 f) {
		f.run();
	}
	
	//��ȯŸ���� MyFuntion2�� �޼���
	static MyFuntion2 getMyfuntion() {
		MyFuntion2 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		
		//���ٽ����� MyFuntion2�� ����
		MyFuntion2 f1 = () -> System.out.println("f1.run()");
		
		//�͸�Ŭ������ run�� ����
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






























