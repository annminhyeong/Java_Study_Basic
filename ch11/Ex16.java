package ch11;

import java.util.TreeSet;

public class Ex16 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //TreeSet에서만 사용하는 메서드 사용시, 다형성 X
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i : score) set.add(new Integer(i));
		
		System.out.println("50보다 작은 값: "+set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: "+set.tailSet(new Integer(50)));
		System.out.println("40~ 80사이 값: "+set.subSet(new Integer(40), new Integer(80)));
	}
}
