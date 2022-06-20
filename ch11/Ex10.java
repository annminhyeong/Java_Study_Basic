package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet(교집합) - 순서x, 중복 x
//set 인터페이스를 구현한 대표적인 컬렉션 클래스
//순서를 유지하려면 LinkedHashSet 클래스를 사용하면 된다
//
//HashSet 주요 메서드
//HashSet() : 기본생성자
//HashSet(Collection c) : 지정된 컬랙션을 포함하는 생성자
//HashSet(int initalCapacity) : 생성자 크기 지정
//HashSet(int initalCapacity, float loadFactor) : 생성자 크기(initalCapacity)를 지정, 얼마나 찼는지(loadFactor) 지정
//boolean add(Object o) : 객체 추가
//boolean addAll(Collection c) : 지정 커렉션 추가  (합집합)
//boolean remove(Object o) : 객체 삭제 
//boolean removeAll(Collection c) : 해당 컬렉션을 포함하는 객체 삭제 (차집합)
//boolean retainAll(Collection c) : 해당 컬랙션만 있는 것을 남기고 전부 삭제 (교집합)
//void clear() : 객체 전부 삭제
//boolean contains(Object o) : 해당 객체가 포함되면 true 없으면 false
//boolean containAll(Collection c) : 해당 컬랙션이 포함되면 true, 없으면 false
//Iterator iterator() : 컬렉션의 요소를 읽어옴
//isEmpty() : 컬랙션이 비어있는지 확인
//int size() : 저장된 객체의 개수 반환
//Object[] toArray() : set에 저장된 객체를 객체배열로 반환
//Object[] toArray(Object[] a) : set에 저장된 객체를 객체배열로 반환
//
//TreeSet
//범위 검색과 정렬에 유리한 컬렉션 클래스
//HashSet보다 데이터 추가, 삭제에 시간이 더 걸림


public class Ex10 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
