package ch08;
//����� ����
//�� ���ܰ� �ٸ� ���ܸ� �߻���ų�� �ִ�
//���� A�� ���� B�� �߻���Ű�� A�� B�� ���ο���
//
//Throwable initCause() : ������ ���ܸ� ���ο��ܷ� ���
//Trowable getCause() ���ο��ܸ� ��ȯ
//
//����1 : ���� ���ܸ� �ϳ��� ��� �ٷ�� ���ؼ�
//����2 : checked ���ܸ� unchecked���ܷ� �����Ϸ� �� ��
class Ex7 {
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	} // main�� ��

	static void install() throws InstallException {
		try {
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���ϵ��� �����Ѵ�. 
		} catch (SpaceException e)	{
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�"); //���ܻ���
			ie.initCause(e); //InstallException�� ���ο��ܷ� SpaceException ���
			throw ie; //���� ���ѱ��
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�"); //���ܻ���
			ie.initCause(me); //InstallException�� ���ο��ܷ� MemoryException ���
			throw ie; //���� ���ѱ��
		} finally { 
			deleteTempFiles();		// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} // try�� ��
	}

	static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) { 		// ����� ��ġ ������ ������...
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}

		if (!enoughMemory()) {	// ����� �޸𸮰� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
//			throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
		}
	} // startInstall�޼����� ��

	
	
   //�׽�Ʈ �޼���
   static void copyFiles()       { /* ���ϵ��� �����ϴ� �ڵ带 ���´�.   */ }
   static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/ }
   
   static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
   }
   static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
   }
} //Ex7

//��������ǿ���
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