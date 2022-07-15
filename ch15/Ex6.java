package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//버퍼output스트림의 버퍼크기를 5로 설정
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			fos.close(); //파일output스트림을 닫는다
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
