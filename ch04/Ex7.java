package ch04;

public class Ex7 {
	public static void main(String[] args) {
		//for���� Loop1�̶�� �̸��� ����
		Loop1 : for(int i=0; i<10; i++) {
			System.out.println("for 1");
			for(int j=0; j<10; j++) {
				if(j==5) {
					break Loop1; // Loop1 for�� ��������
				}
				System.out.println("for 2");
			}
		}
	}
}
