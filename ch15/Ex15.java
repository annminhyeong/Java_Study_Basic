package ch15;

import java.io.File;
import java.io.IOException;

public class Ex15 {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\Programming\\Java\\Study\\StudyJavaBasic\\java_basic\\src\\ch15\\Ex15.java");
		String fileName = f.getName();
		//확장자 길이
		int pos = fileName.lastIndexOf(".");
		System.out.println(pos);
		
		System.out.println("경로를 제외한 파일이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos));
		System.out.println("확장자 - " + fileName.substring(pos+1)); 
		
		System.out.println("경로를 포함한 파일이름 - " + f.getPath());
		System.out.println("파일의 절대경로 - " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 - " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 - " + f.getParent());
		System.out.println();
		
		System.out.println("OS에서 사용하는 경로 구분자 - " + File.pathSeparator);
		System.out.println("OS에서 사용하는 경로 구분자 - " + File.pathSeparatorChar);
		
		System.out.println("OS에서 사용하는 이름 구분자 - " + File.separator);
		System.out.println("OS에서 사용하는 이름 구분자 - " + File.separatorChar);
		System.out.println();
		
		System.out.println("user.dir= " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path= " + System.getProperty("sun.boot.class.path")); //???
		
		
	}
}
