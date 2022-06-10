package ch08;
//try-catch문
//try블럭 내에서 예외가 발생한 경우
//try문에서 예외가 발생한 다음문장은 실행되지 않고 예외에 맞는 catch블럭을 찾아 예외처리를 한다.
//exception이 선언된 catch블록은 마지막에 작성한다.
//
//try블럭 내에서 예외가 발생하지 않은 경우
//try문을 실행한뒤 catch블럭을 실행하지 않는다.


public class Ex2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			//예외처리
			//1. 예외가 발생하면 해당 예외에 대한 객체가 만들어짐
			//2. 만들어진 객체에는 발생한 예외에 대한 정보가 있음(printStackTrace(), getMessage(), 등등이 객체에 저장됨)
			//3.catch블럭에서 해당예외객체의타입과 catch블록의 예외타입 참조변수가 일치하는 catch블록을 찾아 예외처리를 한다.
			
			System.out.println(3);
			System.out.println(0/0); //예외 객체 생성
			System.out.println(4); //예외가발생하면 실행되지 않음
			
			
			//생성된 예외객체 참조변수와 cath 블럭 매개변수의 타입을 비교한뒤 같으면 해당 catch블록을 실행함
			//멀티 catch 블럭
			//내용이 같은 catch블록을 하나로 합친 것(JDK 1.7부터)
			//두개의 exception이 부모 자식 관계면 안됨
			//두개의 exception이 공통으로 가지고 있는 맴버만 사용가능
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException)
				//printStackTrace() : 예외발생 당시의 호출스택에 있던 메서드정보와 예외 메세지를 화면에 출력한다.
				e.printStackTrace();
			//getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
			System.out.println("예외메세지:"+ e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception");
		}
		//만약 catch블록에서 예외처리를 하지 못하면 이문장은 실행되지 못함
		System.out.println(5);
	}

}
