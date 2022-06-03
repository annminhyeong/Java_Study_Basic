package ch05;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		//�������� ����
		int[] arr = {5,2,4,3,1};
		Arrays.sort(arr);
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		int[][] arr2D2 = {{11,12},{21,22}};
		
		//1���� �迭 ���
		System.out.println(Arrays.toString(arr1));
		//������ �迭 ���
		System.out.println(Arrays.deepToString(arr2D1));
		
		//1���� �迭 ��
		System.out.println(Arrays.equals(arr1, arr2));
		//������ �迭 ��
		System.out.println(Arrays.deepEquals(arr2D1, arr2D2));

		//copyOf(�迭, to): ó������ to���� �迭���� (to�� ���� �ȵ�)
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		
		//copyOfRange(�迭, from, to): from���� to���� �迭����(to�� ���� �ȵ�)
		int[] arr4 = Arrays.copyOfRange(arr1, 3, 5);
		
		
	}

}
