package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//ArrayList
//List인터페이스의 자손이므로 저장순서가 유지되고 중복을 허용한다.
//ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일
//ArrayList와 달리 Vector는 자체적으로 동기화처리가 되어있다.
//데이터의 저장공간으로 배열을 사용한다(배열기반)


//ArrayList의 생성자
//ArrayList() :기본생성자
//ArrayList(Collection c) : 컬랙션까리 변환할때 사용
//ArrayList(int initalCapacity) :배열의 길이 지정


//ArrayList 메서드

//추가
//boolean add(Object o) : 객체 추가
//void add(int index, Object element) : 저장위치 지정
//boolean addAll(Collection c) : 컬랙션이 가지고 있는 요소 추가
//boolean addAll(int index, Collection c) : 컬랙션이 가지고 있는 요소의 저장위치 지정



//삭제
//boolean remove(Object o) : 특정 객체를 가지고 있는 index 삭제
//Object remove(int index) : 특정 위치의 객체 삭제
//boolean removeAll(Collection c) : 컬렉션에 있는 겍체들을 삭제
//void claer() : 전부삭제


//검색
//int indexOf(Object o) : 앞에서부터 특정객체(o)를 가지고 있는 인덱스를 찾기 못찾으면 -1반환
//int lastIndexOf(Object o) : 뒤에서부터 특정객체(o)를 가지고 있는 인덱스 찾기 못찾으면  -1반환
//boolean contains(Object o) : 특정객체(o)를 가지고 있는지 확인
//Object get(int index) : 특정인텍스(index)를 가지고있는 객체 반환
//Object set(int index, Object element) : 특정인덱스(index)의 값을 element로 변경



//List subList(int fromIndex, int toIndex)
//Object[] toArray() : from 부터 to를 추출해서 리스트를 만듦
//Object[] toArray(Object[] a) : ArrayList의 객체배열 반환
//boolean isEmpty() : ArrayList가 비어있는지 확인
//void trimToSize() : ArrayList의 빈공간 제거
//int size() : ArrayList의 객체개수 반환



//ArrayList 저장된 객체의 삭제과정
//1. 삭제할 index 다음 index를 한칸씩 앞으로 복사해서 삭제할 index를 덮어쓴다.
//2. 데이터가 모두 한 칸씩 이동했으므로 마지막 데이터는 null로 변경한다.
//3.데이터가 삭제되어 데이터 개수가 줄었으므로 size의 값을 감소한다.
//#마지막데이터는 배열복사과정이 필요없다. -> 마지막에 배열을 추가하는게 cpu에 부담을 줄여줌

//ArrayList를 지울때는 마지막부터 지우는것이 좋음 (추가도 마찬가지)
//->배열의 복사과정이 없기때문에

public class Ex2 {
	public static void main(String[] args) {
		
		//길이 10인 ArrayList 생성 
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList는 객체만 저장가능
		//기본형 저장가능 -> 기본형을 넣으면 컴파일러가 자동참조형(객체)으로 변환해줌
		//list1.add(5);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//subList(from, to) : from부터 to까지 리스트를 뽑아서 추출한다. to는 포함안됨
		//subList는 읽기만 가능, 내용을 변경할려면 새로운 ArrayList 객체를 생성해야함
		//ArrayList(Collection c) : 컬랙션까리 변환할때 사용
		//List sub = list1.subList(1, 4);
		//ArrayList list2 = new ArrayList(sub);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		
		//Collections 유틸클래스를 이용하여 배열을 오름차순으로 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//list1이 list2의 모든요소를 포함하는지 체크
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B"); //뒤에 추가
		list2.add("C"); //뒤에 추가
		list2.add(3, "A"); //중간에 추가
		print(list1, list2);
	
		list2.set(3, "AA"); //값 바꾸기
		print(list1, list2);
		
		list1.add(0,"1");
		
		//문자열 "1"이 어디있는지 index 반환
		System.out.println("index=" + list1.indexOf("1"));
		System.out.println("list1:" + list1);
		
		//0번 index 삭제
		//앞에는 string이므로 안지워짐
		//remove(Object o)
		list1.remove(new Integer(1));//값이 int 1인 객체가 삭제
		//remove(int index)
		//list1.remove(1); //인덱스가 1인객체가 삭제
		System.out.println("list1:" + list1);
		
		//list1에서 list2와 곂치는 부분만 제외하고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체를 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
