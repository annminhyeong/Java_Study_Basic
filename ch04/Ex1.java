package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'D';
		
		Scanner scann = new Scanner(System.in);
		System.out.print("�������Է����ּ���:");
		score = scann.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
//		else
//			grade = 'D';
		
		System.out.println("����� ������" + grade + "�Դϴ�.");
	}

}
