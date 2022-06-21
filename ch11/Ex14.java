package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TreeSet : 이진탐색트리(binary search tree)로 구현. 범위 탬색과 정렬에 유리
//이진 트리는 모든 노드가 최대 2개의 자식 노드를 가짐
//각 요소(node)가 나무(tree)행태로 연결 (LinkedList 변형)
//
//이진 탐색 트리(binary search tree)
//부모보다 작은 값은 왼쪽 큰값은 오른쪽에 저장
//데이터가 많아질 수록 추가, 삭제에 걸리는 시간이 증가(비교횟수 증가)
//
//데이터 저장 boolean add(Object o)
//
//TreeSet - 주요 생성자와 메서드
//TreeSet() : 기본 생성자
//TreeSet(Collection c) : 주어진 컬렉션을 저장하는 TreeSet을 생성
//TreeSet(Comparator comp) : 주어진 정렬기준으로 정렬하는 TreeSet을 생성
//Object first() : 정렬된 순서에서 첫번째 객체를 반환한다. (제일 작은거)
//Object last() : 정렬된 순서에세 마직막 객체를 반환한다. (제일 큰거)
//Object ceiling(Object o) : 지정된 객체와 같은 객체를 반환 없으면 큰값을 가진 객체 중에서 제일 가까운 값을 반환 없으면 null
//Object floor(Object o) : 지정된 객체와 같은 객체를 반환. 없으면 작은 값을 가진 객체 중에서 제일 가까운 값을 반환 없으면 null
//Object highter(Object o) : 지정된 객체보다 큰 값을 가진 객체 중에서 제일 가까운 값의 객체를 반환 없으면 null
//Object lower(Object o) : 지정된 객체보다 작은 값을 가진 객체 중에서 제일 가까운 값의 객체를 반환 없으면 null
//SortedSet subSet(Object fromElement, Object toElement) : 범위검색(fromElement와 toElement 사이)의 결과를 반환한다. (toElement는 포함하지 않음)
//SortedSet headSet(Object toElement) : 지정된 객체보다 작은 값의 객체들을 반환한다.
//SortedSet tailSet(Object fromElement) : 지정된 객체보다큰 값의 객체들을 반환한다.

public class Ex14 {
	public static void main(String[] args) {
		//Set set = new HashSet(); //교집합, 정렬안됨
		//Set set = new TreeSet(); //범위검색, 정렬됨
		Set set = new TreeSet(new TestComp()); //주어진 정렬기준로 정렬하는 TreeSet 생성
		
//		for(int i=0; set.size()<6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//   		//Integer 클래스에는 정렬기준이 있으므로 따로 정렬기준을 설정안해줘도 됨
//			set.add(num); //set.add(new Integer(num); 
//		}
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		
		System.out.println(set);
	}
}

//비교기준이 없음, Comparator 인터페이스 추가해야함
//Comparator 인터페이스를 구현하면 생성자에 비교기준 넣을 필요 없음
class Test{}

class TestComp implements Comparator{

	public int compare(Object o1, Object o2) {
		return -1; //0이면 같은객체로 판별
	}
}





