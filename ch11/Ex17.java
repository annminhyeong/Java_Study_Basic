package ch11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//HashMap과 HashTable : 순서X, 중복(키X, 값O)
//Map 인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
//HashMap(동기화 X)은 HashTable(동기화 O)의 신버전
//Map 인터페이스를 구현한 대표적인 컬랙션 클래스
//순서를 유지할려면 LinkedHashMap클래스를 사용하면 된다.
//
//해싱(hashing) : 키를 해시함수에 넣으면 해시코드(배열의 index)로 해시테이블에 데이터를 검색, 저장
//해시테이블 : 배열 +링크드리스트
//
//해싱과정
//1. 키로 해시함수를 호출해서 해시코드(배열 index)를 얻는다
//3. 해시코드(배열 index)에 대응하는 링크드리스트(키의 모음)를 배열에서 찾는다 
//3.링크드리스트(키의 모음)에서 키와 일치하는 데이터를 찾는다.
//-해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야한다.
//-서로 다른키라도 같은값의 해시코드를 반환할 수 있다.
//
//LinkedHashMap : 순서가 있는 키와 값의 쌍으로 이루어진 컬렉션 클래스
//TreeMap : 범위 검색과 정렬에 유리한 컬렉션 클래스
//HashMap보다 데이터추가,삭제에 시간이 더 걸림
//해싱(hashing) 기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
//
//HashMap - 주요 메서드
//HashMap() : 생성자
//HashMap(int initalCapacity) : 컬렉션 크기
//HashMap(int initalCapacity, float loadFactor) : 컬랙션 크기, 적재용량
//HashMap(Map m) : 해당 Map(m)으로 Map 컬렉션 생성
//Object put(Object key, Object value) : Map 추가
//void putAll(Map m) : 지정된 Map(m)을 Map에 추가
//Object remove(Object key) : 지정된 키(key)를 Map에서 삭제
//Object replace(Object key, Object Value) : 지정된 키(key)의 값으로 해당값(Value)로 변경
//boolean replace(Object key Object oldValue, Object newValue) : 지정된 키(key)로 기존의값(oldValue)를 새로운값(newValue)로 변경
//Set entrySet() : 키와 값의 쌍의 모음
//Set keySet() : 키값의 모음  
//Collection values() : 값의 모음
//Object get(Object key) : 해당키에 대응하는 값을 가져옴
//Object getOrDefault(Object key, Object defaultValue) : 키가 없을때 지정된 값(defaultValue)을 반환함
//boolean containsKey(Object key) : 해당키가 Map에 있는지 확인
//boolean containsValue(Object value) : 해당 값(value) Map에 있는지 확인
//int size() : Map의 크기
//boolean isEmpty() : 비어잇는지 아닌지 확인
//void clear() : Map의 모든요소 삭제
//Object clone() : Map 복제


public class Ex17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); //키값이 같으면 값이 덮어쓰임
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("id와 pw를 입력하세요.");
			System.out.print("아이디: ");
			String id = s.nextLine().trim();
			
			System.out.print("비밀번호: ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않음");
				continue;
			}
			
			if(!(map.get(id)).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않음");
				continue;
			}else {
				System.out.println("회원인증 성공");
				break;
			}
		}
	}
}













