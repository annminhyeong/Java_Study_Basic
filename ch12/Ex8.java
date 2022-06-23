package ch12;

import java.util.ArrayList;

//지네릭 타입의 형변환
//지네릭타입과 원시타입 간의 형변환은 바람직 하지 않다.(경고 발생
//ex) Box -> Box<String>, Box<String> -> Box
//
//와일드 카드가 사용된 지네릭 타입으로는 형변환 가능

//지네릭 타입의 제거
//1.컴파일러는 지네릭타입을 제거하고, 필요한 곳에 형변환을 넣는다.
//2. 지네릭 타입 제거 후에 타입이 불일치하면 컴파일러가 형변환을 추가
//3. 와일드카드가 포함된 경우, 적절한 타입으로 형변환 추가


interface Eatable3{}

class Fruit3 implements Eatable3{
	public String toString() {
		return "Fruit";
	}
}
class Apple3 extends Fruit3{
	public String toString() {
		return "Apple";
	}
}

class Grape3 extends Fruit3{
	public String toString() {
		return "Grape";
	}
}

class Toy3{
	public String toString() {
		return "Toy";
	}
}

class FruitBox3<T extends Fruit3> extends Box3<T>{}
class Box3<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int index) { return list.get(index); }
	ArrayList<T> getList(){return list; }
}

public class Ex8 {
	public static void main(String[] args) {
		Box b = null;
		Box<String> bT = null;
		b = (Box)bT; //지테릭타입 -> 원시타입, 가능하지만 추천X
		bT = (Box<String>)b; //원시타입 -> 지네릭타입, 가능하지만 추천X
		
		//컴파일러가 자동 생성자Box<String>을 Box로 형변환해줌
		//참조변수가 원시타입이므로 Integer들어갈 수 있음, 추천X
		Box b2 = new Box<String>(); 
		b2.add(new Integer(10));
		
		FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
		FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();
		FruitBox3<Grape3> grapeBox = new FruitBox3<Grape3>();
		
		//상속관계가 아니므로 에러
		//FruitBox3<Grape3> grapeBox = new FruitBox3<Apple3>();
		
		//FruitBox3는 Fruit3의 자신과 자손의 타입변수만 허용하므로 에러
		//FruitBox3<Toy3> toyBox = new FruitBox3<Toy3>();
		
		//FruitBox3<? extends Fruit3> box = (FruitBox3<? extends Fruit3>)new FruitBox3<Apple3>();
		 //컴파일러가 자동으로 바꿔줌
		//FruitBox<Apple3> -> FruitBox3<? extends Fruit3> 로 형변환
		FruitBox3<? extends Fruit3> box1 = new FruitBox3<Apple3>();
		
		//FruitBox3<? extends Fruit3> -> FruitBox<Apple3> 로 형변환
		FruitBox3<Apple3> box2 = (FruitBox3<Apple3>) box1;
		
		fruitBox.add(new Fruit3());
		fruitBox.add(new Apple3());
		fruitBox.add(new Grape3());
		
		appleBox.add(new Apple3());
		//Grape3는 Apple3의 자손이 아님
		//appleBox.add(new Grape3());
		grapeBox.add(new Grape3());
		
		System.out.println("fruitBox-"+ fruitBox);
		System.out.println("appleBox-"+ appleBox);
		System.out.println("grapeBox-"+ grapeBox);
	}
}
