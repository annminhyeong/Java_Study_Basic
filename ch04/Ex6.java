package ch04;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int input= 0, answer =0;
		answer = (int)(Math.random()*100)+1;
		System.out.println(answer);
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("0���� 100���� ���� �Է�");
			input =  scanner.nextInt();
			
			if(input < answer) {
				System.out.println("ū �� �Է�");
			}else {
				System.out.println("�۰ų� ���� �� �Է�");
			}
		} while (input != answer);
		System.out.println("�����Դϴ�.");
	}
}
