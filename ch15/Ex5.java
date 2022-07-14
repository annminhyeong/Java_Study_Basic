package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		try {
			//지정된 해당 경로의 파일을 읽어서 연결된 FileInputStream 생성 
			FileInputStream  fis = new FileInputStream(args[0]);
			//지정된 해당 경로의 파일을 생성해 연결된 FileOutputStream 생성
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
