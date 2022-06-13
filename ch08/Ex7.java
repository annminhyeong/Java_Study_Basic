package ch08;
//연결된 예외
//한 예외가 다른 예외를 발생시킬수 있다
//예외 A가 예외 B를 발생시키면 A는 B의 원인예외
//
//Throwable initCause() : 지정한 예외를 원인예외로 등록
//Trowable getCause() 원인예외를 반환
//
//이유1 : 여러 예외를 하나로 묶어서 다루기 위해서
//이유2 : checked 예외를 unchecked예외로 변경하려 할 때
class Ex7 {
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	} // main의 끝

	static void install() throws InstallException {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사한다. 
		} catch (SpaceException e)	{
			InstallException ie = new InstallException("설치 중 예외발생"); //예외생성
			ie.initCause(e); //InstallException의 원인예외로 SpaceException 등록
			throw ie; //예외 떠넘기기
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생"); //예외생성
			ie.initCause(me); //InstallException의 원인예외로 MemoryException 등록
			throw ie; //예외 떠넘기기
		} finally { 
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try의 끝
	}

	static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) { 		// 충분한 설치 공간이 없으면...
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		if (!enoughMemory()) {	// 충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	} // startInstall메서드의 끝

	
	
   //테스트 메서드
   static void copyFiles()       { /* 파일들을 복사하는 코드를 적는다.   */ }
   static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/ }
   
   static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
   }
   static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
   }
} //Ex7

//사용자정의예외
class InstallException extends Exception {
	InstallException(String msg) {
	   super(msg);	
   }
} 
class SpaceException extends Exception {
	SpaceException(String msg) {
	   super(msg);	
   }
} 
class MemoryException extends Exception {
	MemoryException(String msg) {
	   super(msg);	
   }
}