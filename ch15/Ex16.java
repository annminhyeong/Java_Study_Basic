package ch15;

import java.io.File;

public class Ex16 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java Ex16 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		//파일이 존재하지 않거나, 디렉토리가 없으면
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		//디렉터리의 폴더,리렉토리를 file 배열로 만듦
		File[] files = f.listFiles();
		
		//지정한 폴더에 포함된 파일과 디렉토리 목록을 보여줌
		for(int i=0; i<files.length;i++) {
			
			String fileName = files[i].getName();
			//디렉터리이면 [filename], 파일이면 filename
			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
		}
	}
}
