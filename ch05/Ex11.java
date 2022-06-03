package ch05;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		//오름차순 정렬
		int[] arr = {5,2,4,3,1};
		Arrays.sort(arr);
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		int[][] arr2D2 = {{11,12},{21,22}};
		
		//1차원 배열 출력
		System.out.println(Arrays.toString(arr1));
		//다차원 배열 출력
		System.out.println(Arrays.deepToString(arr2D1));
		
		//1차원 배열 비교
		System.out.println(Arrays.equals(arr1, arr2));
		//다차원 배열 비교
		System.out.println(Arrays.deepEquals(arr2D1, arr2D2));

		//copyOf(배열, to): 처음부터 to까지 배열복사 (to는 포함 안됨)
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		
		//copyOfRange(배열, from, to): from부터 to까지 배열복사(to는 포함 안됨)
		int[] arr4 = Arrays.copyOfRange(arr1, 3, 5);
		
		
	}

}
