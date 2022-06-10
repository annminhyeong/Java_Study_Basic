package ch08;

//프로그램 오류
//1. 컴파일 에러: 컴파일 할 때 발생하는 에러
// 컴파일러 기능
// 1.구문체크
// 2.번역
// 3.최적화
// 4.생략된코드 추가

//2. 런타임 에러: 실행 할 때 발생하는 에러
// java의 런타임 에러
// 에러(error): 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
// 예외(exception) 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류,
// 프로그램 실행시 발생할 수 있는 예외의 발새에 대비한 코드를 작성하는 것
// 예외(exception)종류
// 1. Exception클래스들 + 자손클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
// 2. RuntimeException클래스들 : 프로그래머의 실수로 발생하는 예외

//3. 논리적 에러: 작성 의도와 다르게 동작

public class Ex1 {
	
	public static void main(String[] args) {
		
		//컴파일에러
		//system.out.println(args[0]);
		
		//런타임에러
		System.out.println(args[0]);
		
	}

}
