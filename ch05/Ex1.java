package ch05;

public class Ex1 {

	public static void main(String[] args) {
//		int[] score; //�迭 ����(��������)
//		score = new int[5]; //�迭 ����(������ �ּҰ�(������)�� �迭�� ���������� �ֱ�)
		
		int[] score = new int[5]; //�迭����,������ ���ÿ� �ϱ�
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
