package ch12;

import java.util.ArrayList;

//���׸� Ÿ���� ����ȯ
//���׸�Ÿ�԰� ����Ÿ�� ���� ����ȯ�� �ٶ��� ���� �ʴ�.(��� �߻�
//ex) Box -> Box<String>, Box<String> -> Box
//
//���ϵ� ī�尡 ���� ���׸� Ÿ�����δ� ����ȯ ����

//���׸� Ÿ���� ����
//1.�����Ϸ��� ���׸�Ÿ���� �����ϰ�, �ʿ��� ���� ����ȯ�� �ִ´�.
//2. ���׸� Ÿ�� ���� �Ŀ� Ÿ���� ����ġ�ϸ� �����Ϸ��� ����ȯ�� �߰�
//3. ���ϵ�ī�尡 ���Ե� ���, ������ Ÿ������ ����ȯ �߰�


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
		b = (Box)bT; //���׸�Ÿ�� -> ����Ÿ��, ���������� ��õX
		bT = (Box<String>)b; //����Ÿ�� -> ���׸�Ÿ��, ���������� ��õX
		
		//�����Ϸ��� �ڵ� ������Box<String>�� Box�� ����ȯ����
		//���������� ����Ÿ���̹Ƿ� Integer�� �� ����, ��õX
		Box b2 = new Box<String>(); 
		b2.add(new Integer(10));
		
		FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
		FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();
		FruitBox3<Grape3> grapeBox = new FruitBox3<Grape3>();
		
		//��Ӱ��谡 �ƴϹǷ� ����
		//FruitBox3<Grape3> grapeBox = new FruitBox3<Apple3>();
		
		//FruitBox3�� Fruit3�� �ڽŰ� �ڼ��� Ÿ�Ժ����� ����ϹǷ� ����
		//FruitBox3<Toy3> toyBox = new FruitBox3<Toy3>();
		
		//FruitBox3<? extends Fruit3> box = (FruitBox3<? extends Fruit3>)new FruitBox3<Apple3>();
		 //�����Ϸ��� �ڵ����� �ٲ���
		//FruitBox<Apple3> -> FruitBox3<? extends Fruit3> �� ����ȯ
		FruitBox3<? extends Fruit3> box1 = new FruitBox3<Apple3>();
		
		//FruitBox3<? extends Fruit3> -> FruitBox<Apple3> �� ����ȯ
		FruitBox3<Apple3> box2 = (FruitBox3<Apple3>) box1;
		
		fruitBox.add(new Fruit3());
		fruitBox.add(new Apple3());
		fruitBox.add(new Grape3());
		
		appleBox.add(new Apple3());
		//Grape3�� Apple3�� �ڼ��� �ƴ�
		//appleBox.add(new Grape3());
		grapeBox.add(new Grape3());
		
		System.out.println("fruitBox-"+ fruitBox);
		System.out.println("appleBox-"+ appleBox);
		System.out.println("grapeBox-"+ grapeBox);
	}
}
