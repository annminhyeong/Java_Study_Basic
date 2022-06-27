package ch12;
//열거형
//관련된 상수들을 같이 묶어 놓은 것. Java는 타입에 안전한 열거형을 제공
//형태: enum 열거형이름{상수명1, 상수명2, ...}
//열거형 상수에 비교연산자 사용불가
//CompareTo() 같으면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수
//
//열거형의 조상 - java.lang.Enum
//모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다.
//Class<E> getDeclaringClass() : 열거형의 Class객체를 반환
//String name() : 열거형 상수의 이름을 문자열로 반환
//int ordinal() : 열거형 상수가 정의된 순서를 반환
//T valueOf(Class<T> enumType, String name) : 지정된 열거형에서 name과 일치하는 열거형 상수를 반환
//
//values(), valueOf()는 컴파일러가 자동으로 추가


//열거형 각각 객체임
//              0      1      2     3
enum Direction{EAST, SOUTH, WEST, NORTH}

public class Ex9 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		
		//열거형 상수에 비교연산자 사용불가, 단 등가비교연산자는 가능
		//System.out.println("d1>d3 ?"+(d1>d3));
		
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		
		
		switch (d1) {
		case EAST:
			System.out.println("The direaction is EAST");
			break;
		case SOUTH:
			System.out.println("The direaction is SOUTH");
			break;
		case WEST:
			System.out.println("The direaction is WEST");
			break;
		case NORTH:
			System.out.println("The direaction is NORTH");
			break;
		}
		
		Direction[] dArr = Direction.values(); //열거형의 모든 상수를 배열로 반환
		
		for(Direction d : dArr) {
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		}
		
	}
}


















