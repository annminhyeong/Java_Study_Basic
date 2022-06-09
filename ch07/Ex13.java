package ch07;
class Product2{
	int price;
	int bonusPoint;

	Product2(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10);
	}
}

class Tv2 extends Product2{
	Tv2() { super(100); }
	public  String toString() { return "Tv"; }
}
class Computer2 extends Product2{
	Computer2() { super(50); }
	public  String toString() { return "Computer"; }
}
class Audio2 extends Product2{
	Audio2() { super(10); }
	public  String toString() { return "Audio"; }
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		cart[i] = p;
		i++;
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("��������ǰ:" + p.toString());
		System.out.println("���� ��:" + money);
		System.out.println("����Ʈ:" + bonusPoint);
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length;  i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("������ ��ǰ�� �ѱݾ�:" + sum);
		System.out.println("������ ��ǰ�� ���:" + itemList);
	}
}
public class Ex13 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Product2[] p = {new Tv2(),new Computer2(), new Audio2()};
		b.buy(p[0]);
		b.buy(p[1]);
		b.buy(p[2]);
		b.summary();
	}

}
