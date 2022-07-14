package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) throws IOException {
		//해당파일경로에 있는 실제파일을 읽어서 연결된 FileInputStream 생성 
		FileInputStream fis = new FileInputStream("F:\\Programming\\Java\\Study\\StudyJavaBasic\\java_basic\\src\\ch15\\Ex4.java");
		
		int data = 0;
		
		//input스트림의 값을 byte단위로 읽어서 -1이 아닐때까지 반복
		while ((data = fis.read())!= -1) {
			//int을 char로 형변환
			char c = (char)data;
			System.out.print(c);
		}
		
		fis.close();
	}
}
