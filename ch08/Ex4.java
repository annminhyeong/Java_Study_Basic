package ch08;

import java.io.File;

public class Ex4 {
	//예외처리하는 방법
	//1. try-catch (예외 직접처리)
	//2. 예외 선언하기(예외 떠넘기기), checked 예외만 선언
	//ex) 타입 메서드명() throws 예외1, 예외2
	//3. 은폐(덮기) 빈 catch
	
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+" 파일이 생성되었습니다.");
		
		//try문 자체에서 에러가 발생하거나 createFile 메서드에서 Exception 에러가 발생하면 main메서드에서 에러를 처리함
		//(main 메서드에서 createFile메서드를 호출하고 있기때문에)
		}catch (Exception e) {
			System.out.println(e.getMessage()+" 다시입력해주세요");
			
		//finally 블럭: 예외 발생여부와 관계없이 수행되는 블록
		}finally {
			System.out.println("예외발생여부와 관계업이 실행되는 코드");
		}
	}

	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			//try-catch문이 없으므로 발생한 예외를 createFile를 호출한 main로 떠넘김
			throw new Exception("파일이 유효하지 않음");
		
		//파일클래스 객체생성
		File f = new File(fileName);
		
		//파일객체의 createNewFile메서드를 이용해서 실제파일 생성
		f.createNewFile();
		return f;
	}

}
