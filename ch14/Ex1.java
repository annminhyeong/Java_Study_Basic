package ch14;

import javax.naming.spi.DirStateFactory.Result;

//람다식 (함수형언어)
//함수(메서드)를 간단한 식으로 표현한 방법

//익명 함수(이름이 없는 함수)

//함수와 메서드와 차이
//근본적으로 동일. 함수는 일반적인 용어, 메서드는 객체지향개념 용어, 함수는 클래스에 독립적, 메서드는 클래스에 종속적


//생략 규칙
//1. 메서드의 이름과 반환타입을 제거하고 화살표를 블록{} 앞에 추가한다
//
//2. 반환값이 있는 경우, 식이나 값만 적고 return문 생략가능(끝에 ; 안붙임)
//
//3. 매개변수의 타입이 추론가능하면 생략가능(대부분의 경우 생략 가능)
//
//4. 매개변수가 하나인 경우, 괄호 생략가능(타입이 없을때만)
//
//5. 블록안의 문장이 하나뿐 일 때, 괄호{} 생략가능 (끝에 ; 안붙임)
//단, 하나뿐인 문장이 return문이면 괄호{} 생략불가



//람다식은 익명함수가 아니라 익명 객체다
//ex) (a,b) -> a>b? a:b는
//new Object(){
//    int max(int a, int b){
//         return a>b? a:b;
//    }
//} 와 비슷
//문제점 : Object 리모콘으로는 max함수를 가리킬 수 없기 때문에
//형변환해줘야하는데 형변환을 할수가 없음


//람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수 타입은? 함수형 인터페이스
//함수형 인터페이스
//단 하나의 추상 메서드만 선언된 인터페이스, @FuntionalInterface 붙임
//함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음. (단 함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환타입이 일치해야함)

public class Ex1 {
	public static void main(String[] args) {
		
		//함수형 인터페이스 구현
		MyFuntion f1 = new MyFuntion() {
			
			//오버라이딩 - 접근제어자의 범위를 좁게 못 바꿈
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		int value1 = f1.max(1, 2);
		System.out.println("value1=" + value1);
		
		
		
		//람다식으로 축약
		//람다식(익명객체)을 다루기 위한 참조변수 타입은 함수형 인터페이스 타입으로 한다.
		MyFuntion f2 = (a , b) -> a > b ? a : b;
		int value2 = f2.max(5, 4);
		System.out.println("value2="+ value2);
		
		
		
		
	}
}

//함수형 인터페이스는 단 하나의 추상메서드만 가질 수 있음
@FunctionalInterface
interface MyFuntion{
	//모든 인터페이스는 public abstract를 가지고 있음
	public abstract int max(int a, int b);
}















