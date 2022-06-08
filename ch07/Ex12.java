package ch07;

class Product{
	int price;
	int bonusPoint;

	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10);
	}
}

class Tv extends Product{
	Tv() { super(100); }
	public  String toString() { return "Tv"; }
}
class Computer extends Product{
	Computer() { super(50); }
	public  String toString() { return "Computer"; }
}
class Audio extends Product{
	Audio() { super(10); }
	public  String toString() { return "Audio"; }
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("��������ǰ:" + p.toString());
		System.out.println("���� ��:" + money);
		System.out.println("����Ʈ:" + bonusPoint);
	}
}
public class Ex12 {
	public static void main(String[] args) {
		//�Ű������� ������
		//������ �Ű������� �޼��� ȣ���, �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ�Ÿ���� �ν��Ͻ��� �Ѱ��� �� �ִ�.
		//
		//�Ű������� ������ ����
		//1. �������Ű�����
		//2.�ϳ��� �迭�� �������� ��ü �ٷ��

		Buyer b = new Buyer();
		Product p1 = new Tv();	
		
		b.buy(p1);
		b.buy(new Computer()); //��ü�� �����ϰ� �ٷ� �ѱ�, ���θ޼��忡���� ������������ 
	}
}
