package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\Programming\\Java\\Study\\StudyJavaBasic\\java_basic\\src\\ch15\\Ex11.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i=1; (line = br.readLine())!= null; i++) {
				
				// ";" 포한한 라인을 출력
				if(line.indexOf(";")!= -1)
					System.out.println(i + ":" + line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
