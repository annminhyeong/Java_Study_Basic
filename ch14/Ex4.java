package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

//Predicate(���ǽ�)�� ���� 

//and(), or(), negate()���� �� Predicate�� �ϳ��� ����(default �޼���)

//��񱳸� ���� Predicate�� �ۼ����� isEqual()�� ���(static �޼���)


public class Ex4 {
	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> Integer.parseInt(s, 16);
		Function<Integer, String> g1 = i ->Integer.toBinaryString(i);
		
		//andThen : f1�� ������� g1�Լ������ڷ� �ִ´�.
		//funtion(f1�� ����Ÿ��, g1�� ���Ÿ��)
		Function<String, String> h1 = f1.andThen(g1);
		
		//compose (andThen�� �ݴ�) : g1�� ������� f1�� �Լ��� ���ڷ� �ִ´�.
		//funtion(g1�� ����Ÿ��, f1�� ���Ÿ��)
		Function<Integer, Integer> h2 = f1.compose(g1);
		
		//h1�̶�� �͸��Լ��� ���ڿ� "FF" �ֱ�
		System.out.println(h1.apply("FF"));
		//h2�̶�� �͸��Լ��� ���ڿ� "2" �ֱ�
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 = x -> x;
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p1 = i -> i < 100;
		Predicate<Integer> q1 = i -> i < 200;
		Predicate<Integer> r1 = i -> i%2 ==0;
		Predicate<Integer> notP1 = p1.negate(); //not ���ǽ� �ݴ�
		
		Predicate<Integer> all = notP1.and(p1.or(r1));
		
		//all�̶�� �͸��Լ��� ���ڿ� "150" �ֱ�
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1�� str2�� ������ ��ȯ
		Predicate<String> p2 = Predicate.isEqual(str1);
		//boolean result = str1.equals(str2) �� ����
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}
