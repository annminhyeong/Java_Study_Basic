package ch07;

//�ܺ�Ŭ����
public class Ex20 {
	
	//�ν��Ͻ� ����Ŭ����
    //ivó�����
	class InstainceInnerClass{
		int iv = 100;
		//static int cv = 100; //static Ŭ������ static�ɹ��� ������ �� ����
		final static int CONST = 100; //final static�� ����̹Ƿ� ����
	}
	
	//����ƽ ����Ŭ����
    //cvó�� ���
	static class StaticInnerClass{
		int iv = 100;
		
		//static ���� Ŭ���������� �ܺ� Ŭ������ �ν��Ͻ��� ������ �� ����
		static int cv = 100; //static Ŭ������ static�ɹ��� ������ �� ����
	}
	
	void method() {
		
		//���� ����Ŭ����
		//lvó�����, �޼��� �ȿ����� ��밡��
		class LocalInnerClass{
			int iv = 100;
			//static int cv = 100; //static Ŭ������ static�ɹ��� ������ �� ����
			final static int CONST = 100; //final static�� ����̹Ƿ� ����
		}
		System.out.println(LocalInnerClass.CONST); //����
	}
	
	public static void main(String[] args) {
		System.out.println(InstainceInnerClass.CONST);
		System.out.println(StaticInnerClass.cv);
		//System.out.println(LocalInnerClass.CONST); //����: ��������Ŭ������ �޼��� �ȿ����� ��밡��
	}
}
