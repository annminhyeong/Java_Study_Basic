package ch08;
//Exception����: ����ڰ� �߻���Ű�� ����
//RuntimeException: ���α׷��Ӱ� �Ǽ��� �߻���Ű�� ����

//����� ���� ���� ����� (exception or RuntimeException ����)
class MyException extends Exception{
	private final int ERR_CODE;
		
	MyException(String msg, int errCode) {
		super(msg); // ������ ExceptionŬ������ �����ڸ� ȣ���Ѵ�.
		ERR_CODE = errCode;
	}
	
	MyException(String msg) {
		this(msg,100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		try {
			//��������� �����߻���Ű��
			throw new MyException("����� ���� ���ܹ߻�", 200);
		} catch (MyException e) {
			System.out.println("�����ڵ�:"+ e.getErrCode());
		}
	}
}
