package ch06;

public class Ex4 {

	public static void main(String[] args) {
		
		//��ü �������� ��밡��
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 5;
		
		//��ü �����ѵ� ��밡��
		System.out.println(c1.kind);
		System.out.println(c1.number);
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 1;
		
		//��ü �����ѵ� ��밡��
		System.out.println(c2.kind);
		System.out.println(c2.number);
		
		//����X : Ŭ���������� Ŭ������ 1���ۿ� ���µ� c1.width��� ���� c1��ü�� ���� �ٲ۰����� �����ϱ� ����
		//c1.width = 200; //����X 
		//c1.height = 300; //����X
		Card.height = 200; //����
		Card.width = 300; //����
	}
}

class Card{
	//����Ӽ��� Ŭ���� ����
	//�����Ӽ��� �ν��Ͻ� ����
	
	//Ŭ��������(static)�� Ŭ����(���赵)�� 1���� ����
	static int width = 100; //��
	static int height = 250; //����
	
	//�ν��Ͻ������� ��ü�� 1���� ����
	String kind; //����
	int number; //����
}
