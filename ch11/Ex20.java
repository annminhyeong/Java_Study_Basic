package ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; //Collections 생략가능
//Collections -컬렉션을 위한 메서드(static)를 제공
//file() : 컬렉션 채우기
//copy() : 컬렉션 복사
//sort() : 컬렉션 정렬
//binarySearch() : 검색
//synchronizedXXX() : 컬렉션의 동기화
//unmodifiableXXX() : 컬렉션 변경불가
//singletonXXX() : 싱글톤 컬렉션(객체 1개만 저장)
//checkedXXX() : 한종류의 객체만 저장하는 컬렉션
public class Ex20 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5); //요소추고
		System.out.println(list);
		
		rotate(list, 2); //오른쪽으로 2번이동
		System.out.println(list);
		
		swap(list,0,2); //첫번째와 3번째요소 위치변경
		System.out.println(list);
		
		shuffle(list); //저장된 요소를 랜덤변경
		System.out.println(list);
		
		sort(list, reverseOrder()); //내림차순 정렬, reverse(list);와 같음
		System.out.println(list);
		
		sort(list); //오름차순 정렬
		System.out.println(list);
		
		int idx = binarySearch(list,3); //이진검색
		System.out.println("index of 3 : "+ idx);
		
		System.out.println("max=" + max(list)); //최대값
		System.out.println("min=" + min(list)); //최소값
		System.out.println("min=" + max(list, reverseOrder())); //최소값
		
		fill(list, 9); //list를 9로 채운다
		System.out.println("list=" + list);
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다, 결과변경 불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList="+ newList);
		
		//공통요소가 없으면 true 없으면 false
		System.out.println(disjoint(list, newList)); 
		
		//list의 요소를 newList에 복사한다.
		copy(list, newList);
		System.out.println("list="+ list);
		System.out.println("newList="+ newList);
		
		//리스트의 요소가 2인 값을 1로 변경
		replaceAll(list, 2, 1);
		System.out.println("list="+ list);
		
		//Iterator과 비슷함
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2="+ list2);
	}
}








