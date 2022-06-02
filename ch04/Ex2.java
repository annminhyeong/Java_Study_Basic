package ch04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.print("현재월을 입력해주세요 :");
		int month = scann.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("가을입니다.");
				break;
			default:
				System.out.println("겨울입니다.");
		}
	}

}
