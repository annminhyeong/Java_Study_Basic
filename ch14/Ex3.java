package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//java.util.funtion��Ű��
//���� ���Ǵ� �پ��� �Լ��� �������̽� ����

//�Ű������� 1���� �Լ��� �������̽�
//T : �Ű�����Ÿ��, R :��ȯŸ��
//java.lang.Runnable : �Ű������� ����, ��ȯ���� ������ ���
//Supplier<T> : �Ű��������� ��ȯ���� ������ ���
//Consumer<T> : �Ű������� �ְ� ��ȯ���� ����
//Function<T,R> : �Ϲ������Լ�. �ϳ��� �Ű������� �޾Ƽ� ����� ��ȯ�Ҷ� ���
//Predicate<T> : ���ǽ��� ǥ���ϴµ� ���. �Ű��������ϳ� ��ȯŸ���� boolean

//�Ű������� 2���� �Լ��� �������̽�
//T : ù��°�Ű�����Ÿ��, U: �ι�°�Ű�����Ÿ�� R:��ȯŸ��
//BiConsumer<T,U> : �ΰ��� �Ű������� �ְ�, ��ȯ���� ����
//BiPredicate<T,U> : ���ǽ��� ǥ���ϴµ� ����. �Ű������� ��, ��ȯ���� boolean
//BiFuntion<T,U,R> : �� ���� �Ű������� �޾Ƽ� �ϳ��� ����� ��ȯ

//�Ű������� Ÿ�԰� ��ȯŸ���� ��ġ�ϴ� �Լ��� �������̽�
//T : �Ű�����Ÿ��
//UnaryOperator<T> : Funtion�� �ڼ�, Funtion�� �޸� �Ű������� ���Ÿ���� ����
//BinaryOperator<T> : BiFuntion�� �ڼ�, BiFuntion�� �޸� �Ű�������  ���Ÿ���� ����


public class Ex3 {
	public static void main(String[] args) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); //list�� ���������� ä���
		System.out.println(list);
		printEvenNum(p, c, list); //¦���� ���
		List<Integer> newList = doSomething(f,list);
		System.out.println(newList);
	}


	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) {
			//�����ڸ��� ���ּ� ���ο� list�� ����
			newList.add(f.apply(i));
		}
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			//¦������ �˻�
			if(p.test(i)) {
				//ȭ�鿡 i ���
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			//Supplier�κ��� 1~100���� ������ �޾� list�� �߰�
			list.add(s.get()); 
		}
	}
}















