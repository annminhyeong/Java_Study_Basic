package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

//Iterator, ListIterator, Enumeration
//컬렉션에 저장된 데이터를 읽어올때 사용하는 인터페이스
//
//Iterator 인터페이스
//boolean hasNext() : 읽어올 요소가 남아있는지 확인한다.
//있으면 true, 없으면 false를 반환한다.
//
//Object next() : 다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전한다.
//
//void remove() : next()로 읽어 온 요소를 삭제한다. next()를 호출한 다음에 remove()를 호출해야한다. (선택적 기능)
//
//void forEachRemaining(Consumer<? super E> action) : 컬랙션에 남아있는 요소들에 대해 지정된 작업(action)을 수행한다. 람다식을 사용하는 디폴트 메서드 (JDK 1.8부터 추가)
//
//Enumeration 인터페이스
//boolean hasMoreElements() : 읽어올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.
//
//Object nextElement() : 다음 요소를 읽어 온다. nextElement()를 호출하기 전에 hasMoreElements()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전한다.
//
//ListIterator 인터페이스 : List인터페이스를 구현한 클래스에서만 사용가능 previous() 메서드가 존재함


//Map과 Iterator
//Collection의 자손(List, set)에 Map이 없으므로 Map에는 iterator()가 없다.
//Map에서 Iterator를 사용할려면 keySet(), entrySet(), values()를 호출해야한다.
//
//ex) Set eset = map.entrySet();
//Iterator it = eSet.iterator();
//Iterator it = map.entrySet().iterator();

public class Ex7 {
	public static void main(String[] args) {
		//컬렉션 프레임워크는 객체만 저장가능
		//Collection이 부모이므로 자손의 공통 메서드(부모 리모콘)를 가지고 있으므로
		//Collection를 쓰면 구현 클래스를 자유롭게 바꿀수 있음
		Collection c = new HashSet();
		//Collection c = new TreeSet();
		c.add("1"); //list.add(new String("1")랑 같음 
		c.add("2"); //"2"를 객체로 컴파일러가 자동으로 변환해줌
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator(); //1회용
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//이미 hasNext가 커서가 마지막이므로 false가 나옴
		//다시 리스트의 요소를 읽을려면 Iterator를 다시 생성해야함
		//it = list.iterator(); //새로운 Iterator 객체를 얻는다.
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//Iterator대신 for문으로 바꾸기
		//단점 다른컬렉션으로 바꾸면 사용불가
		//for(int i=0; i<list.size(); i++) {
		//	System.out.println(list.get(i)); 
		//}
	}
}
