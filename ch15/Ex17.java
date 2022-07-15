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
		System.out.println(deletedFiles +"개의 파일이 삭제되었습니다.");
	}

	public static void delete(File dir, String ext) {
		//해당 디렉터리의 파일과 폴더를 file배열로 만듦
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			
			//디렉토리이면 디렉토리 하나씩 전부 해당파일이 있는지 확인
			if(files[i].isDirectory()) {
				delete(files[i], ext);
			}else {
				//해당폴더의 파일절대경로를 저장
				String fileName = files[i].getAbsolutePath();
				
				//만약 .삭제할파일이름이 있다면
				if(fileName.endsWith(ext)) {
					System.out.print(fileName);
					
					//파일을 삭제를 성공하면 ture, 아니면 false
					if(files[i].delete()) {
						System.out.println("- 삭제성공");
						deletedFiles++;
					}else {
						System.out.println("- 삭제실패");
					}
				}
			}
		}
	}
}
