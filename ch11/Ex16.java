package ch11;

import java.util.TreeSet;

public class Ex16 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //TreeSet������ ����ϴ� �޼��� ����, ������ X
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i : score) set.add(new Integer(i));
		
		System.out.println("50���� ���� ��: "+set.headSet(new Integer(50)));
		System.out.println("50���� ū ��: "+set.tailSet(new Integer(50)));
		System.out.println("40~ 80���� ��: "+set.subSet(new Integer(40), new Integer(80)));
	}
}
