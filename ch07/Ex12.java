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
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("구입한제품:" + p.toString());
		System.out.println("남은 돈:" + money);
		System.out.println("포인트:" + bonusPoint);
	}
}
public class Ex12 {
	public static void main(String[] args) {
		//매개변수의 다형성
		//참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
		//
		//매개변수의 다형성 장점
		//1. 다형성매개변수
		//2.하나의 배열로 여러종류 객체 다루기

		Buyer b = new Buyer();
		Product p1 = new Tv();	
		
		b.buy(p1);
		b.buy(new Computer()); //객체를 생성하고 바로 넘김, 메인메서드에서는 참조변수없음 
	}
}
