package ch12;

import java.util.ArrayList;

//���ϵ� ī�� <?>
//���������� Ÿ�Ժ����� �������� Ÿ�Ժ��� ����ġ �ص�  ��
//<? extends T> : ���ϵ� ī���� ���� ����. T�� �� �ڼյ鸸 ����
//<? super T> : ���ϵ� ī���� ���� ���� T�� �� ����鸸 ����
//<?> : ���� ���� ��� Ÿ���� ���� <? extends Object>�� ����
//�޼����� �Ű������� ���ϵ� ī�� ��밡��

//���׸� �޼���
//���׸� Ÿ���� ����� �޼��� (Ÿ�� ������ �޼��� �������� ��ȿ)
//Ŭ������ Ÿ�� �Ű�����<T>�� �޼����� Ÿ�� �Ű�����<T>�� ����
//�޼��带 ȣ���� ������ Ÿ���� �����ؾ�(��κ� ���� ����)

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
		//���ϵ�ī�带 ���� ���������� �Ű������� Ÿ�Ժ����� ��ġ���� �ʾƵ� ��
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
