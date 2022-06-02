package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'D';
		
		Scanner scann = new Scanner(System.in);
		System.out.print("점수를입력해주세요:");
		score = scann.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
//		else
//			grade = 'D';
		
		System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
