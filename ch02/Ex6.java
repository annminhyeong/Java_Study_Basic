package ch02;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열입력: ");
		String str1 = scanner.nextLine(); //enter 치기전까지 쓴 문자열 리턴
//		String str2 = scanner.next(); //space 치기전까지 쓴 문자열 리턴
		System.out.println(str1);
		
		System.out.println("정수입력: ");
		int i = scanner.nextInt();
		System.out.println(i);
		
		System.out.println("실수입력: ");
		float f = scanner.nextFloat();
		System.out.println(f);
	}

}
