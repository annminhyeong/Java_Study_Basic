package ch07;

//���� Ŭ����
//Ŭ���� �ȿ� Ŭ������ �ִ� ��
//����: ����Ŭ�������� �ܺ�Ŭ���� ��ü�� �������� �ʰ� �ܺ�Ŭ������ ����� ���� ����
//�ڵ��� ���⼺�� ���� �� �ִ�. (ĸ��ȭ)
//�ܺ�Ŭ���������� ����Ұ� ������ ���

class AAA{//AAA�� BBB�� �ܺ� Ŭ����
	int i = 100;
	BBB b = new BBB();
	
	//BBBŬ������ AAAŬ���������� ����ϰ� ������ ����Ŭ���� ����ϱ�
	class BBB{ //BBB�� AAA�� ���� Ŭ����
		void getI() {
			//AAA a = new AAA();
			//System.out.println(a.i);
			System.out.println(i); //��ü �������� �ܺ� Ŭ���� �ɹ������� ���ٰ���
		}
	}
}

//class CCC{
//	BBB b = new BBB();
//}
public class Ex19 {
	public static void main(String[] args) {
		//BBBŬ������ ����Ŭ�����̱� ������ �ٷ� �ν��Ͻ� �����Ұ���
		//BBB b = new BBB();
		//b.getI();
	}
}
