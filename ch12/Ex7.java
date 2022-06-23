package ch12;

import java.util.ArrayList;

//와일드 카드 <?>
//참조변수의 타입변수와 생성자의 타입변수 불일치 해도  됨
//<? extends T> : 와일드 카드의 상한 제한. T와 그 자손들만 가능
//<? super T> : 와일드 카드의 하한 제한 T와 그 조상들만 가능
//<?> : 제한 없음 모든 타입이 가능 <? extends Object>와 동일
//메서드의 매개변수에 와일드 카드 사용가능

//지네릭 메서드
//제네릭 타입이 선언된 메서드 (타입 변수는 메서드 내에서만 유효)
//클래스의 타입 매개변수<T>와 메서드의 타입 매개변수<T>는 별개
//메서드를 호출할 때마다 타입을 대입해야(대부분 생략 가능)

class Fruit2{ public String toString(){ return "Fruit"; } }
class Apple2 extends Fruit2{ public String toString(){ return "Apple"; } }
class Grape2 extends Fruit2{ public String toString(){ return "Grape"; } }
class Juice2{
	String name;
	Juice2(String name) { this.name = name + "Juice"; }
	public String toString(){ return name; }
}
class Juicer2{
	static Juice2 makeJuice2(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		for(Fruit2 f : box.getList()) {
			tmp += f+" ";
		}
		return new Juice2(tmp);
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T>{}
class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList(){ return list; };
}
public class Ex7 {
	public static void main(String[] args) {
		//와일드카드를 쓰면 참조변수와 매개변수의 타입변수가 일치하지 않아도 됨
		FruitBox2<? extends Fruit2> fruitBox1;
		fruitBox1 = new FruitBox2<Fruit2>();
		fruitBox1 = new FruitBox2<Apple2>();
		fruitBox1 = new FruitBox2<Grape2>();
		
		FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();		
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox2.add(new Apple2());
		fruitBox2.add(new Grape2());
		
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer2.makeJuice2(fruitBox2));
		System.out.println(Juicer2.makeJuice2(appleBox));
	}
}
