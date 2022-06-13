package ch08;
//Exception에러: 사용자가 발생시키는 에러
//RuntimeException: 프로그래머가 실수로 발생시키는 에러

//사용자 정의 예외 만들기 (exception or RuntimeException 선택)
class MyException extends Exception{
	private final int ERR_CODE;
		
	MyException(String msg, int errCode) {
		super(msg); // 조상인 Exception클래스의 생성자를 호출한다.
		ERR_CODE = errCode;
	}
	
	MyException(String msg) {
		this(msg,100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		try {
			//사용자정의 에러발생시키기
			throw new MyException("사용자 정의 예외발생", 200);
		} catch (MyException e) {
			System.out.println("에러코드:"+ e.getErrCode());
		}
	}
}
