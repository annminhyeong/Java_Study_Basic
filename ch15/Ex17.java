package ch15;

import java.io.File;

public class Ex17 {
	static int deletedFiles = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java Ex17 Extenstion");
			System.exit(0);
		}
		
		//F:\Programming\Java\Study\StudyJavaBasic\java_basic
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		String ext = "." + args[0];
		
		delete(dir, ext);
		System.out.println(deletedFiles +"���� ������ �����Ǿ����ϴ�.");
	}

	public static void delete(File dir, String ext) {
		//�ش� ���͸��� ���ϰ� ������ file�迭�� ����
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			
			//���丮�̸� ���丮 �ϳ��� ���� �ش������� �ִ��� Ȯ��
			if(files[i].isDirectory()) {
				delete(files[i], ext);
			}else {
				//�ش������� ���������θ� ����
				String fileName = files[i].getAbsolutePath();
				
				//���� .�����������̸��� �ִٸ�
				if(fileName.endsWith(ext)) {
					System.out.print(fileName);
					
					//������ ������ �����ϸ� ture, �ƴϸ� false
					if(files[i].delete()) {
						System.out.println("- ��������");
						deletedFiles++;
					}else {
						System.out.println("- ��������");
					}
				}
			}
		}
	}
}
