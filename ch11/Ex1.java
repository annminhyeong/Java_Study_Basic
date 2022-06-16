package ch11;

public class Ex1 {
	//컬랙션: 여러 객체(데이터)를 모아 놓은 것
	//프레임워크: 표준화 정형화된 체계적인 프로그래밍 방식
	//
	//컬렉션 프레임워크 : 컬렉션(다수의 객체)를 다루기 위한 표준화된 프로그래밍 방식
	//
	//
	//컬렉션 프레임워크의 핵심 인터페이스
	//List : 순서가 있고 중복을 허용하는 데이터집합
	//Set : 순서가 없음 중복을 허용안하는 데이터집합
	//Map : 키와 값이 쌍으로 이루어진 데이터집합 키는 중복을 허용하지 않고 값은 중복을 허용함
	//
	//Collection 인터페이스: List + set
	//boolean add(Object o)
	//boolean add(Collection c) : 저정된 객체 또는 Collection(c)의 객체들을 Collection에 추가한다.
	//
	//void clear() : Collection의 모든 객체를 삭제한다.
	//
	//boolean contains(Object o)
	//boolean contains(Collection c) : 지정된객체(o) 또는 Collection(c)의 객체들이 Collection에 포함되어있는지 확인한다.
	//
	//boolean equals(Object o) : 동일한 Collection인지 비교한다.
	//
	//int hashCode() : Collection의 hash code를 반환한다.
	//
	//boolean isEmpty() : Collection이 비어있는지 확인한다.
	//
	//Iterator iterator() : Collection의 Iterator를 얻어서 반환한다.
	//
	//boolean remove(Object o) : 지정된 객체를 삭제한다.
	//boolean removeAll(Collection c) : 지정된 Collection에 포함된 객체들을 삭제한다.
	//
	//boolean retainAll(Collection) : 지정된 Collection에 포한된 객체만 남기고 다른 객체들은 Collection에서 삭제한다. 이작업으로 인해 Collection에 변화가 있으면 ture, 없으면 false를 반환한다.
	//
	//int size() : Collection에 지정된 객체의 개수를 반환한다.
	//
	//Object[] toArray() : Collection에 저장된 객체를 객체배열(Object [])로 반환한다.
	//
	//Object[] toArray(Object[] a) : 지정된 배열에 Collection에 객체를 저장해서 반환한다.
	
	
	
	
	
	

	//List 인터페이스
	//void add(int index, Object element) : 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을 추가한다.
	//
	//Object get(int index) : 지정된 위치(index)에 있는 객체를 반환한다.
	//
	//int indexOf(Object o) : 지정된 객체의 위치(index)를 앞에서 부터 찾아서 반환한다.
	//
	//int lastIndexOf(Object o) : 지정된 객체의 위치(index)를 뒤에서 부터 찾아서 반환한다.
	//
	//ListIterator()
	//ListIterator(int index) : List의 객체에 접근할 수 있는 ListIterator를 반환한다.
	//
	//Object remove(int index) : 지정된 위치(index)에 있는 객체를 삭제하고 삭제된 객체를 반환한다.
	//
	//Object set(int index, Object element) : 지정된 위치(index)에 객체 (element)를 저장한다.
	//
	//void sort(Comparator c) 지정된 비교자(comparator)로 List를 정렬한다.
	//List subList(int fromIndex, int toIndex) : 지정된 범위(fromIndex 부터 toIndex)에 있는 객체를 반환한다.
	
	
	
	
	

	//set 인터페이스
	//Set 인터페이스의 메서드는 Collection 인터페이스와 동일
	//boolean addAll(Collection c) : 지정된 Collection(c)의 객체들을 추가한다. (합집합)
	//
	//boolean containsAll(Collection c) : 지정된 Collection(c)의 객체들이 Collection에 포함되어 있는지 확인한다 (부분집합)
	//
	//boolean removeAll(Collection c) : 지정된 Collection에 포함된 객체들을 삭제한다 (차집합)
	//
	//boolean retainAll(Collection c) : 지정된 Collection에 포함된 객체만 남기고 나머지는 Collection에서 삭제한다 (교집합)
	
	
	
	
	
	

	//Map 인터페이스
	//void clear() : Map의 모든객체를 삭제한다.
	//
	//boolean containsKey(Object key) : 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.
	//
	//boolean containsValue(Object value) : 지정된 value객체와 일치하는 Map의 Value 객체가 있는지 확인한다.
	//
	//Set entrySet() : Map에 저장되어 있는 key-value쌍을 Map.Entry 타입의 객체로 저장한 Set으로 반환한다.
	//
	//boolean equals(Object o) : 동일한 Map인지 비교한다.
	//
	//Object get(Object key) : 지정된 key객체에 대응하는 value를 찾아서 반환한다.
	//
	//int hashCode() : 해시코드를 반환한다
	//
	//boolean isEmpty() : Map이 비어있는지 확인한다.
	//
	//Set keySet() : Map에 저장되어있는 key객체를 반환한다.
	//
	//Object put(Object key , Object value) : Map에 value객체를 key객체에 연결하여 저장한다.
	//
	//void putAll(Map t) : 지정된 Map의 모든 key-value쌍을 추가한다.
	//
	//Object remove(Object key) : 지정된 key 객체와 일치하는 key-value객체를 삭제한다.
	//
	//int size() : Map에 저장된 key-value쌍의 개수를 반환한다.
	//
	//Collection values() : Map에 저장된 모든 value객체를 반환한다.


}
