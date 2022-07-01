package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//컬랙션 프레임워크와 함수형 인터페이스
//Collection
//boolean removeIf(Predicate<E> filter) : 조건에 맞는 요소를 삭제
//
//List
//void replaceAll(UnaryOperator<E> operator) : 모든 요소를 변환하여 대체
//
//Iterable 
//void forEach(Consumer<T> action) : 모든요소에 작업 action을 수행
//
//Map
//V compute(K key, BiFuntion(<K, V, V> f) : 지정된 키의 값에 작업 f 수행
//
//V computeIfAbsent(K key, Funtion<K, V> f) : 키가없으면 작업 f 수행후 추가
//
//V computeIfPresent(K key, BiFuntion<K, V, V> f) : 지정된 키가 있을 때 작업 f 수행
//
//V merge(K key, V value, BiFuntion<K, V, V> f) 모든 요소에 병합작업 f를 수행
//
//void forEach(BiConsumer<K, V> action) : 모든 요소에 작업 action을 수행
//
//void replaceAll(BiFuntion<K,V,V> f) : 모든 요소에 치환작업 f를 수행


public class Ex5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) list.add(i);
		
		//list의 모든요소 출력
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();
		
		//list에서 2의배수, 3의배수 제거
		list.removeIf(x-> x%2==0 || x%3 ==0);
		System.out.println(list);
		
		//list 각요소에 10을 곱한다.
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//모든 요소를 key, value 형식으로 출력한다.
		map.forEach((k,v)-> System.out.print("{"+ k + "," +v +"}"+", "));
		System.out.println();
		
		
		
	}
}

















