package ch13;

import javax.swing.JOptionPane;

//�������� I/O ���ŷ
//����½� �۾� �ߴܵǴ� ����

public class Ex4 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���:");
		System.out.println("�Է��ϽŰ��� "+input +"�Դϴ�.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
