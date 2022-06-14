package ch09;

public class Ex18 {
	public static void main(String[] args) {
		
		//문자열을 숫자로 변환하는 다양한 방법
		int i1 = new Integer("100").intValue();
		int i2 = Integer.parseInt("100"); //10진수
		int i3 = Integer.parseInt("100", 2); //2진수
		int i4 = Integer.parseInt("100", 8); //8진수
		int i5 = Integer.parseInt("100", 16); //16진수
		Integer i6 = Integer.valueOf("100");
		
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

	}
}
