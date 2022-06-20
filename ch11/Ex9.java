package ch11;

import java.util.Arrays;
import java.util.Comparator;


//Comparator와 Comparable
//Comparable : 기본 정렬기준을 구현하는데 사용
//Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할때 사용
//
//compare()와 compareTo()는 두객체의 비교결과를 반환하도록 작성, 같으면 0, 오른쪽이 크면 음수(-), 작으면 양수(+)

public class Ex9 {
	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		//Arrays.sort(배열,정렬기준)
		Arrays.sort(strArr); //String 클래스의 Comparable 구현에 의해서 정렬
		System.out.println(Arrays.toString(strArr));
		
		//대소문자 구분 X
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		//역순 정렬
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
	}
}

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			//역순정렬
			return c1.compareTo(o2) * -1; //return c2.compareTo(c1);
		}
		return -1;
	}
	
}
