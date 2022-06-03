package ch05;

public class Ex5 {

	public static void main(String[] args) {
		int[] score = {95, 34, 54, 23, 53, 75, 86};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) max = score[i];
			else if(score[i] < min) min = score[i];
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
