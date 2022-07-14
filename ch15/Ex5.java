package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		try {
			//������ �ش� ����� ������ �о ����� FileInputStream ���� 
			FileInputStream  fis = new FileInputStream(args[0]);
			//������ �ش� ����� ������ ������ ����� FileOutputStream ����
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			
			while ((data = fis.read())!= -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
