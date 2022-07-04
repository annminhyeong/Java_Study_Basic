package ch14;

import java.util.Optional;

//Optional<T> : TŸ�� ��ü�� ����Ŭ����
//null�� ���̱� ���� ����
//1. null�� ���� �ٷ�� ���� ���� (NullPointException)
//2. null üũ : if�� �ʼ�, �ڵ尡 ����������
//�� �ذ��ϱ� ���� ����

public class Ex17 {
	public static void main(String[] args) {
		//null�� �ʱ�ȭ�ϴ°��� �ٶ��� ���� ����
		//int[] arr = null;
		
		int[] arr = new int[0];
		System.out.println("arr.length:"+arr.length);
		
		//null�� �ʱ�ȭ�ϴ°��� �ٶ������� ����
		//Optional<String> opt = null;
		
		////��ü ����
		Optional<String> opt = Optional.empty();
		
		//abc�� �ʱ�ȭ
		//Optional<String> opt = Optional.of("abc");
		
		System.out.println("opt:" + opt);
		
		String str = "";
		
		//optional ���������� get(), get()�� null�� �������� �ϸ� NullpointException �߻�
		try {
			str = opt.get();
		} catch (Exception e) {
			str = "";
		}
		System.out.println("opt.get:" + str);
		
		//Nulló�� ���ϰ� ������
		System.out.println("opt.orElse:"+ opt.orElse(""));
		
		//���ٽ� ����ϰ� ������
		System.out.println("opt.orElseGet:"+ opt.orElseGet(String::new));
	}
}
