package ch15;

import java.io.File;
import java.io.IOException;

public class Ex15 {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\Programming\\Java\\Study\\StudyJavaBasic\\java_basic\\src\\ch15\\Ex15.java");
		String fileName = f.getName();
		//Ȯ���� ����
		int pos = fileName.lastIndexOf(".");
		System.out.println(pos);
		
		System.out.println("��θ� ������ �����̸� - " + f.getName());
		System.out.println("Ȯ���ڸ� ������ �����̸� - " + fileName.substring(0, pos));
		System.out.println("Ȯ���� - " + fileName.substring(pos+1)); 
		
		System.out.println("��θ� ������ �����̸� - " + f.getPath());
		System.out.println("������ ������ - " + f.getAbsolutePath());
		System.out.println("������ ���԰�� - " + f.getCanonicalPath());
		System.out.println("������ �����ִ� ���丮 - " + f.getParent());
		System.out.println();
		
		System.out.println("OS���� ����ϴ� ��� ������ - " + File.pathSeparator);
		System.out.println("OS���� ����ϴ� ��� ������ - " + File.pathSeparatorChar);
		
		System.out.println("OS���� ����ϴ� �̸� ������ - " + File.separator);
		System.out.println("OS���� ����ϴ� �̸� ������ - " + File.separatorChar);
		System.out.println();
		
		System.out.println("user.dir= " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path= " + System.getProperty("sun.boot.class.path")); //???
		
		
	}
}
