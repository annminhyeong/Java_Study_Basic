package ch04;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int input= 0, answer =0;
		answer = (int)(Math.random()*100)+1;
		System.out.println(answer);
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("0부터 100사이 정수 입력");
			input =  scanner.nextInt();
			
			if(input < answer) {
				System.out.println("큰 수 입력");
			}else {
				System.out.println("작거나 같은 수 입력");
			}
		} while (input != answer);
		System.out.println("정답입니다.");
	}
}
