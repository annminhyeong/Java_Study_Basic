package ch05;

public class Ex1 {

	public static void main(String[] args) {
//		int[] score; //배열 선언(참조변수)
//		score = new int[5]; //배열 생성(생성된 주소값(연속적)을 배열의 참조변수에 넣기)
		
		int[] score = new int[5]; //배열선언,생성을 동시에 하기
		score[3] = 100;
		
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int value = score[3];
		System.out.println(value);
	}

}
