package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) throws IOException {
		//�ش����ϰ�ο� �ִ� ���������� �о ����� FileInputStream ���� 
		FileInputStream fis = new FileInputStream("F:\\Programming\\Java\\Study\\StudyJavaBasic\\java_basic\\src\\ch15\\Ex4.java");
		
		int data = 0;
		
		//input��Ʈ���� ���� byte������ �о -1�� �ƴҶ����� �ݺ�
		while ((data = fis.read())!= -1) {
			//int�� char�� ����ȯ
			char c = (char)data;
			System.out.print(c);
		}
		
		fis.close();
	}
}
