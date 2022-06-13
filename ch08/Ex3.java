package ch08;

public class Ex3 {

	public static void main(String[] args) {
		//오류종류
		//1. 컴파일에러
		//2. 런타임에러
		//  Error
		//  Exception
		//    Exception과 자손(checked 예외)
		//    RuntimeException과 자손(unchecked 예외)
		//3. 논리적에러
			
		//checked 예외: 컴파일러가 예외 처리 여부 체크함 (Exception과 자손), try-catch 필수
		//unchecked 예외: 컴파일러가 예외 처리 여부 체크안함(RuntimeException과 자손), try-catch 선택,
		//이유는 프로그래머가 자주발생시키는 오류여서 필수로한다면 거의 모든코드에 try-catch문을 써야되므로 선택임
		
		try {
			//예외 발생시키기
			//1. 발생시킬려는 해당 예외를 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체 생성한 다음
			Exception e = new Exception("고의로 예외발생시켰음");
			
			//2. 키워드 throw를 이용해서 예외를 발생시킨다.
			throw e;
			
			//1,2번 하나로 합치기
			//throw new Exception("예외발생 한번에");
			
		//예외타입이 일치하면 실행됨
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("시스템이 정상 종료됨");
	}

}