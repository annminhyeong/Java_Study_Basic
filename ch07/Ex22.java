package ch07;

public class Ex22 {
	private int outIv = 0;
	private static int outCv = 0;
	
	class InstanceInner{
		int innerIv = outIv;
		int innerCv = outCv;
	}
	
	static class StaticInner{
		//����ƽŬ���������� �ν��Ͻ��ɹ��� ���ٺҰ�
		//int innerIv = outIv;
		int innerCv = outCv;
	}
	
	void myMethod() {
		int Lv = 0;//jdk1.8�̻���� ���� �ٲ��� �ʴ� ������ �������ϹǷ� final ��������
		//Lv++; ���� �ٲٸ� �����߻�
		final int LConst = 0; 
		
		//����Ŭ������ ��ü�� �޼����� ������������ �� ���� ���簡��(������)
		//���� ����Ŭ������ ���ΰ��ִ� �޼����� ����� ����
		class LocalInner{
			int innerIv = outIv; 
			int innerCv = outCv;
			
			//�ܺ�Ŭ������ ���������� ����� ���ٰ����ϴ�.
			int innerLv = Lv; //jdk1.8�̻󿡼��� ���� �ȹٲ�� �����Ϸ��� �ڵ����� final�� �ٿ��ֱ⶧���� ���� �ƴ�
			int innerLConst = LConst;
		}
	}
}
