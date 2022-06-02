package ch04;

public class Ex3 {

	public static void main(String[] args) {
		// Math.random(): 반환범위
		// 0.0 <= Math.random() < 1.0
		
		//1~3 사이의 난수 얻기
		// 각 변에 3을 곱하기
		// 0.0 <= Math.random() * 3 < 3.0
		// 형변환 하기
		// (int)0 <= (int)Math.random() * 3 < (int)3
		// 각 변에 1을 더하기
		// (int)1 <= (int)Math.random() * 3 + 1 < (int)4
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6)+ 1);
		
		// -5 ~ 5 난수 구하기
		// -5,-4,-3,-2,-1,0,1,2,3,4,5 : 11개
		System.out.println((int)(Math.random()* 11)); // 0 ~10
		System.out.println((int)(Math.random()* 11)-5); // -5 ~ 5

		
		
	}

}
