package ch14;

import java.util.function.Function;

//�޼��� ����
//���ٽ��� �� ������ �� ��
//�ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� �޼��� ������ ������ �� �� �ִ�.

//���ٽ� (x) -> ClassName.method(x) ��
//static �޼��� ������ ClassName::method �ٲ�

//���ٽ� (obj, x) -> obj.method(x) �� 
//�ν��Ͻ� �޼��� ������ ClassName::method �ٲ�

//���ٽ� (x) -> obj.method(x) �� 
//Ư�� ��ü �ν��Ͻ� �޼��� ����(���� �Ⱦ�) obj::method�� �ٲ�


public class Ex6 {
	public static void main(String[] args) {
		
		//���ٽ�
		Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
		
		//�޼��� ���� : ���ٽ��� �� ������ �� ��
		Function<String, Integer> f2 = Integer::parseInt;
		
		System.out.println(f1.apply("123") + 321);
		System.out.println(f2.apply("123") + 321);
	}
}
