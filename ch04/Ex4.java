package ch04;

public class Ex4 {
	public static void main(String[] args) {
		//중첩 for문 
		// i: 세로
		// j: 가로
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
