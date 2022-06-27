package ch12;
//메타 애너테이션
//에너테이션을 만들때 사용
//메타 애너테이션은 java.lang.annotation패키지에 포함
//
//@Target : 애너테이션이 적용가능한 대상을 지정하는데 사용한다.
//ANNOTATION_TYPE : 에너테이션
//CONSTRUCTOR : 생성자
//FIELD : 필드(맴버변수(iv, cv), enum상수)
//LOCAL_VARIABLE : 지역변수
//METHOD : 메서드
//PACKAGE : 패키지
//PARAMETER : 매개변수
//TYPE : 타입(클래스, 인터페이스, enum)
//TYPE_PARAMETER : 타입 매개변수
//TYPE_USE : 타입이 사용되는 모든곳
//
//@Retention : 애너테이션이 유지되는 범위를 지정하는데 사용한다.
//SOURCE : 소스파일에만 존재. 클래스파일에는 존재하지 않음 (컴파일하면 사라짐)
//CLASS : 클래스파일에 존재. 실행시에 사용불가. 기본값
//(잘 사용안함)
//RUNTIME : 클래스 파일에 존재. 실행시에 사용가능 (컴파일이후에도 유지)
//
//@Documented : 애너테이션 정보가 javadoc으로 작성된 문서에 포함된다.
//
//@Inherited : 애너테이션을 자손 클래스에게 상속되도록 할때 사용한다.
//
//@Repeatable : 에너테이션을 반복해서 적용할 수 있게 한다. 반복되는 애너테이션을 하나로 묶을 컨테이너 애너테이션도 정의해야함

public class Ex12 {

}
