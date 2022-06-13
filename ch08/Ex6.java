package ch08;

public class Ex6 {
	//예외 되던지기(exception re-throwing)
	//주로 분담처리할때 쓰임
	//예외를 처리한 후에 다시 예외를 발생시키는 것
	//호출한 메서드와 호출된 메서드 양쪽 모두에서 예외 처리하는 것
	
	//try-catch문이 2개임 : 즉 양쪽에서 예외처리
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드 예외처리 완료");
		}
	}

	static void method1() throws Exception{
		try {
			throw new Exception("예외 되던지기");
		} catch (Exception e) {
			System.out.println("method1 예외처리 완료");
			throw e; //예외 떠넘기기
		}
	}

}
