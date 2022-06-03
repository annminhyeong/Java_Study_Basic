package ch05;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		int[] iArr = {100, 90, 80, 70, 60};
		// [ : 배열이라는 뜻
		// I : int 이라는 뜻
		// @다음 : 메모리 주소값?
		// char 배열만 저장된 문자를 출력해줌
		System.out.println(iArr); 

		//배열 전부 출력하기
		System.out.println(Arrays.toString(iArr));
		
	}

}
