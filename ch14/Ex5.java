package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//�÷��� �����ӿ�ũ�� �Լ��� �������̽�
//Collection
//boolean removeIf(Predicate<E> filter) : ���ǿ� �´� ��Ҹ� ����
//
//List
//void replaceAll(UnaryOperator<E> operator) : ��� ��Ҹ� ��ȯ�Ͽ� ��ü
//
//Iterable 
//void forEach(Consumer<T> action) : ����ҿ� �۾� action�� ����
//
//Map
//V compute(K key, BiFuntion(<K, V, V> f) : ������ Ű�� ���� �۾� f ����
//
//V computeIfAbsent(K key, Funtion<K, V> f) : Ű�������� �۾� f ������ �߰�
//
//V computeIfPresent(K key, BiFuntion<K, V, V> f) : ������ Ű�� ���� �� �۾� f ����
//
//V merge(K key, V value, BiFuntion<K, V, V> f) ��� ��ҿ� �����۾� f�� ����
//
//void forEach(BiConsumer<K, V> action) : ��� ��ҿ� �۾� action�� ����
//
//void replaceAll(BiFuntion<K,V,V> f) : ��� ��ҿ� ġȯ�۾� f�� ����


public class Ex5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) list.add(i);
		
		//list�� ����� ���
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();
		
		//list���� 2�ǹ��, 3�ǹ�� ����
		list.removeIf(x-> x%2==0 || x%3 ==0);
		System.out.println(list);
		
		//list ����ҿ� 10�� ���Ѵ�.
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//��� ��Ҹ� key, value �������� ����Ѵ�.
		map.forEach((k,v)-> System.out.print("{"+ k + "," +v +"}"+", "));
		System.out.println();
		
		
		
	}
}

















