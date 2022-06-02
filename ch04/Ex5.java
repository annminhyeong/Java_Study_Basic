package ch04;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int num =0, sum =0;
		System.out.print("숫자를 입력:");
		Scanner scann = new Scanner(System.in);
		num = scann.nextInt();
		while(num != 0) {
			sum = sum + (num % 10);
			num = num /10;
		}
		System.out.println("각자리수 합:"+ sum);
	}
}
