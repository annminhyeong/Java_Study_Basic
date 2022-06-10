package ch07;


//�ܺ�Ŭ����
public class Ex20 {
	
	//�ν��Ͻ� ����Ŭ����
	//ivó�����
	//��Ģ) �ν��Ͻ� Ŭ���������� static ����� ���� ����. (����� ����)-> �����ϱ� X ,��Ģ��
	class InstainceInnerClass{
		int iv = 100;
		//static int cv = 100; //static Ŭ������ static�ɹ��� ������ �� ����
		
		//������̽�
		//1. �ν��Ͻ��� �����Ҷ� ���� ������ ���� ���� ����� static�� ����
		//2. �ν��Ͻ��� �����Ҷ� ���� �ٸ� ���� ���� ����� static���� �����ϸ� �ȵ�, �ν��Ͻ� �������Ŀ��� ����Ұ�
			
		//����տ� static�� �ᵵ �Ǵ������� 
		//�Ź� �ν��Ͻ��� ������ �� ������ ���� ���� ������ static ���̴� ���� �����
		final static int CONST = 100;
	}
	
	//����ƽ ����Ŭ����
    //cvó�� ���
	//��Ģ) ����ƽ ����Ŭ���������� static ����� ���� �ִ�. -> �����ϱ� X ,��Ģ��
	static class StaticInnerClass{
		int iv = 200;
		
		//static �ɹ��� ��ü ���� ���� ���� �־���� �׷���
		//static Ŭ������ �ƴϸ� instance Ŭ�����̹Ƿ� ��ü�� �����ؾ� ���� ���� -> ����߻�
		//�׷��Ƿ� Ŭ���� �տ� static�� ����
		
		//static ���� Ŭ���������� �ܺ� Ŭ������ �ν��Ͻ� �ɹ��� ������ �� ����
		//������ �ܺο� �ν��Ͻ��� �������� �ʾ��� ���� �ֱ⶧���� �� �� ����
		static int cv = 200;
	}
	
	void method() {
		
		//���� ����Ŭ����
		//lvó�� ���
		//��Ģ) ���� ����Ŭ���������� static ����� ���� ����. (����� ����)-> �����ϱ� X ,��Ģ��
		class LocalInnerClass{
			int iv = 300;
			//static int cv = 300; //static Ŭ������ static�ɹ��� ������ �� ����
			
			//����տ� static�� �ᵵ �Ǵ������� 
			//�Ź� �ν��Ͻ��� ������ �� ������ ���� ���� ������ static ���̴� ���� �����
			
			
			//��������Ŭ��������� �޼��� �������� ��밡��
			final static int CONST = 300;
		}
		System.out.println(LocalInnerClass.CONST); //����
	}
	
	public static void main(String[] args) {
		System.out.println(InstainceInnerClass.CONST);
		System.out.println(StaticInnerClass.cv);
		//System.out.println(LocalInnerClass.CONST); //����: ��������Ŭ������ �޼��� �ȿ����� ��밡��
	}
}
