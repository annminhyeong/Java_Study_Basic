package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//에너테이션 만들기
//인터페이스처럼 final static이 생략된다.
//형태: @interface 애너테이션이름{
//		타입 요소이름(); //애너테이션의 요소를 선언한다.
//    }
//
//에너테이션의 메서드는 추상 메서드이며, 에너테이션을 적용할 때 지정(순서x)
//
//적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정가능(null제외);
//ex) 타입 메서드명 default 기본값;
//
//요소가 하나이고 이름이 value일때는 요소의 이름 생략가능
//요소의 이름이 Value일때는 생략가능
//
//요소의 타입이 배열인 경우, 괄호{}를 사용해야한다.
//
//모든 에너테이션의 조상
//Annotion은 모든 에너테이션의 조상이지만 상속은 불가
//사실 Annotion은 인터페이스다.
//
//에너테이션 만들기 규칙
//1. 요소의 타입은 기본형, String, enum, 에너테이션, Class만 허용됨
//2. 괄호()안에 매개변수를 선언할 수 없다.
//3. 예외를 선언할 수 없다.
//4. 요소를 타입 매개변수로 정의할 수 없다.


@Deprecated
@SuppressWarnings("1111") //유효하지 않는 에너테이션은 무시된다.
@Testinfo(testedBy = "aaa", testTools = {"JUnit", "JUnit5"}, testDate = @DateTime(yymmdd="160101",hhmmss="235959"))
public class Ex13 {
	public static void main(String[] args) {
		//Ex13의 Class객체를 얻는다.
		Class<Ex13> cls = Ex13.class;
		
		Testinfo anno = cls.getAnnotation(Testinfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()= "+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()= "+anno.testDate().hhmmss());
		
		
		for(String str : anno.testTools()) {
			System.out.println("testTools= "+ str);
		}
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
		
		
	}
}

//실행시에 사용가능하도록 지정
@Retention(RetentionPolicy.RUNTIME)
@interface Testinfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }