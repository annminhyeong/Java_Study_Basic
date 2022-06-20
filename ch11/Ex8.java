package ch11;

import java.util.Arrays;

//Arrays 클래스 - 배열을 다루기에 편리한 메서드(static) 제공
//toString() : 배열 출력
//
//copyOf(), copyOfRange() : 배열의 복사 (새로운 배열을 생성해서 반환)
//
//fill(), setAll() : 배열 채우기
//
//sort(), binarySearch() : 배열의 정렬과 검색, sort()로 정렬한다음 이진탐색 binarySearch()를 한다.
//
//deepTostring() : 다차원배열 출력
//
//deepEquals() : 다차원배열 비교
//
//asList(Object.. a) : 배열을 List로 변환, asList로 만든 리스트는 변경불가, 변경할려면 List생성자에 넣어줘야함
//
//parallelXXX(), spliterator(), stream() : 람다와 스트림관련

public class Ex8 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //9로 채움
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i]; //i크기의 배열생성
			Arrays.fill(graph, '*'); //i개 크기의 배열를 *로 채우기
			System.out.println(new String(graph)); //배열을 문자열로 바꾸기
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr="+ Arrays.toString(chArr));
		//binarySearch(이진탐색)은 배열이 정렬되어 있어야 제대로 된 값이 나옴
		System.out.println("index of B="+ Arrays.binarySearch(chArr, 'B')); //배열이 정렬되어 있지 않아서 이상한 값이 나옴
		
		System.out.println("= After Sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+ Arrays.toString(chArr));
		System.out.println("index of B="+ Arrays.binarySearch(chArr, 'B'));
		
	}
}
