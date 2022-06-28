package ch13;

import javax.swing.JOptionPane;

//쓰레드의 I/O 블락킹
//입출력시 작업 중단되는 현상

public class Ex4 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요:");
		System.out.println("입력하신값은 "+input +"입니다.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
