package ch04;

public class Ex3 {

	public static void main(String[] args) {
		// Math.random(): ��ȯ����
		// 0.0 <= Math.random() < 1.0
		
		//1~3 ������ ���� ���
		// �� ���� 3�� ���ϱ�
		// 0.0 <= Math.random() * 3 < 3.0
		// ����ȯ �ϱ�
		// (int)0 <= (int)Math.random() * 3 < (int)3
		// �� ���� 1�� ���ϱ�
		// (int)1 <= (int)Math.random() * 3 + 1 < (int)4
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6)+ 1);
		
		// -5 ~ 5 ���� ���ϱ�
		// -5,-4,-3,-2,-1,0,1,2,3,4,5 : 11��
		System.out.println((int)(Math.random()* 11)); // 0 ~10
		System.out.println((int)(Math.random()* 11)-5); // -5 ~ 5

		
		
	}

}
