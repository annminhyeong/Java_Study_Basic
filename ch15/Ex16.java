package ch15;

import java.io.File;

public class Ex16 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java Ex16 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		//������ �������� �ʰų�, ���丮�� ������
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		//���͸��� ����,�����丮�� file �迭�� ����
		File[] files = f.listFiles();
		
		//������ ������ ���Ե� ���ϰ� ���丮 ����� ������
		for(int i=0; i<files.length;i++) {
			
			String fileName = files[i].getName();
			//���͸��̸� [filename], �����̸� filename
			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
		}
	}
}
