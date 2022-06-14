package ch09;

public class Ex17 {

	public static void main(String[] args) {
		//레퍼 (wrapper) 클래스
		//8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
		
		//Number 클래스
		//모든 숫자 래퍼 클래스의 조상
		
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
