package ch04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.print("������� �Է����ּ��� :");
		int month = scann.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("�����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("�����Դϴ�.");
				break;
			default:
				System.out.println("�ܿ��Դϴ�.");
		}
	}

}
