package ch02;

public class Ex7 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)); //���ڿ� -> ����
		System.out.println('3' - '0'); //���� - '0' -> ����
		System.out.println(Integer.parseInt("3")); // ���ڿ� -> ����
		System.out.println("3" + 1); //���ڿ� + ���� -> ���ڿ� 
		System.out.println((char)(3  + '0')); // 0�� ���ڷ� 48
	}

}
