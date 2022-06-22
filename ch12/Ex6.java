package ch12;

import java.util.ArrayList;

//extends�� ������ �� �ִ� Ÿ���� ����
//�������̽��� ��쿡�� extends�� ���

//Ÿ�� ������ ������ �ν��Ͻ����� �ٸ��� ����
//ex) Box<Apple> appleBox = new Box<appleBox>();
//Box<Grape> grapeBox = new Box<Grape>();
//
//�ν��Ͻ����� �ٸ��� Ÿ�Ժ����� �����Ҽ� �����Ƿ� static �ɹ����� Ÿ�Ժ��� ��� �Ұ�
//ex) class Box<T>{ 
//	    static T item;
//	    static int compare(T t1){    }
//	  }
//
//�迭,��ü ������ �� Ÿ�Ժ��� ���Ұ�. Ÿ�� ������ �迭,��ü ������ ����
//ex) class Box<T>{
//	     T[] itemArr; //����
//	     T[] toArray(){
//	          T[] tmpArr = new T[itemArr.length]; //����, ���׸� �迭�����Ұ�
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
	ArrayList<T> list = new ArrayList<T>(); //item�� ������ ����Ʈ
	void add(T item) { list.add(item); } //item �߰� �޼���
	T get(int i) { return list.get(i); } //item ��� �������� �޼���
	int size() { return list.size(); } //item ũ�� �޼���
	public String toString() { return list.toString(); }
}

public class Ex6 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //���� Ÿ�Ժ���ġ
		
		//FruitBox���� Ÿ�Ժ��� ������ �ֱ⶧���� Toy�� ����
		//FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		//Box�� Ÿ�Ժ��� ������ ���⶧���� ����
		Box<Toy> toyBox = new Box<Toy>();
		
	}
}
