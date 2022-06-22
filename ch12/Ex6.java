package ch12;

import java.util.ArrayList;

//extends로 대입할 수 있는 타입을 제한
//인터페이스인 경우에도 extends를 사용

//타입 변수에 대입은 인스턴스별로 다르게 가능
//ex) Box<Apple> appleBox = new Box<appleBox>();
//Box<Grape> grapeBox = new Box<Grape>();
//
//인스턴스마다 다르게 타입변수를 선언할수 있으므로 static 맴버에는 타입변수 사용 불가
//ex) class Box<T>{ 
//	    static T item;
//	    static int compare(T t1){    }
//	  }
//
//배열,객체 생성할 때 타입변수 사용불가. 타입 변수로 배열,객체 선언은 가능
//ex) class Box<T>{
//	     T[] itemArr; //가능
//	     T[] toArray(){
//	          T[] tmpArr = new T[itemArr.length]; //블가능, 지네릭 배열생성불가
//	     }
//	  }


interface Eatable {}
class Fruit implements Eatable{
	public String toString(){ return "Fruit"; }
}
class Apple extends Fruit{
	public String toString(){ return "Apple"; }
}
class Grape extends Fruit{
	public String toString(){ return "Grape"; }
}
class Toy{
	public String toString(){ return "Toy"; }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>(); //item을 저장할 리스트
	void add(T item) { list.add(item); } //item 추가 메서드
	T get(int i) { return list.get(i); } //item 요소 가져오기 메서드
	int size() { return list.size(); } //item 크기 메서드
	public String toString() { return list.toString(); }
}

public class Ex6 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러 타입불일치
		
		//FruitBox에는 타입변수 제한이 있기때문에 Toy는 못들어감
		//FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		//Box는 타입변수 제한이 없기때문에 가능
		Box<Toy> toyBox = new Box<Toy>();
		
	}
}
