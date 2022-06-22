package ch12;

import java.util.ArrayList;
import java.util.List;

//지네릭스 용어
//Box<T> : 지네릭클래스. T의 Box 또는 T Box라고 읽음
//T :  타입변수 또는 타입 매개변수라고 읽음 (T는 타입문자)
//Box : 원시 타입(raw type)
//
//지네릭 클래스간의 다형성은 성립(타입변수는 일치하야함)
//ex) ArrayList<Tv> list = new ArrayList<Tv>();
//
//조상 자손관계일때도 타입변수는 일치해야함
//ex) List<조상> list = new ArrayList<자손>(); //에러
//
//지네릭 클래스간의 다형성도 성립 (타입변수는 일치해햐함)
//ex) List<Tv> list = new ArrayList<Tv>();
//
//매개변수의 다형성도 성립
//ex) ArrayList<조상> list = new ArrayList<조상>();
//list.add(new 조상());
//list.add(new 자손());


class Product2{}
class Tv2 extends Product2{}
class Audio2 extends Product2{}

public class Ex3 {
	public static void main(String[] args) {
		
		//지네릭클래스간의 다형성은 가능
		//List<Product2> plist2 = new ArrayList<Product2>();
		
		//타입변수가 조상자손 관계라도 참조변수와 생성자의 타입은 같아야함
		//ArrayList<Product2> pList = new ArrayList<Tv>();

		ArrayList<Product2> pList = new ArrayList<Product2>();
		ArrayList<Tv2> tList = new ArrayList<Tv2>();
		
		pList.add(new Product2()); //public boolean add(Product2 e){ }
		pList.add(new Tv2());
		pList.add(new Audio2());
		
		tList.add(new Tv2()); //public boolean add(Tv2 e){ }
		tList.add(new Tv2());
		
		printAll(pList);
		//printAll(tList); //컴파일 에러발생
	}
	
	//ArrayList의 Product2타입의 리스트만 들어올 수 있음
	public static void printAll(ArrayList<Product2> pList) {
		for(Product2 p : pList) {
			System.out.println(p);
		}
	}
}










