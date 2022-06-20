package ch11;

import java.util.Arrays;

//Arrays Ŭ���� - �迭�� �ٷ�⿡ ���� �޼���(static) ����
//toString() : �迭 ���
//
//copyOf(), copyOfRange() : �迭�� ���� (���ο� �迭�� �����ؼ� ��ȯ)
//
//fill(), setAll() : �迭 ä���
//
//sort(), binarySearch() : �迭�� ���İ� �˻�, sort()�� �����Ѵ��� ����Ž�� binarySearch()�� �Ѵ�.
//
//deepTostring() : �������迭 ���
//
//deepEquals() : �������迭 ��
//
//asList(Object.. a) : �迭�� List�� ��ȯ, asList�� ���� ����Ʈ�� ����Ұ�, �����ҷ��� List�����ڿ� �־������
//
//parallelXXX(), spliterator(), stream() : ���ٿ� ��Ʈ������

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
		Arrays.fill(arr7, 9); //9�� ä��
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i]; //iũ���� �迭����
			Arrays.fill(graph, '*'); //i�� ũ���� �迭�� *�� ä���
			System.out.println(new String(graph)); //�迭�� ���ڿ��� �ٲٱ�
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr="+ Arrays.toString(chArr));
		//binarySearch(����Ž��)�� �迭�� ���ĵǾ� �־�� ����� �� ���� ����
		System.out.println("index of B="+ Arrays.binarySearch(chArr, 'B')); //�迭�� ���ĵǾ� ���� �ʾƼ� �̻��� ���� ����
		
		System.out.println("= After Sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+ Arrays.toString(chArr));
		System.out.println("index of B="+ Arrays.binarySearch(chArr, 'B'));
		
	}
}
