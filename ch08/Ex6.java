package ch08;

public class Ex6 {
	//���� �Ǵ�����(exception re-throwing)
	//�ַ� �д�ó���Ҷ� ����
	//���ܸ� ó���� �Ŀ� �ٽ� ���ܸ� �߻���Ű�� ��
	//ȣ���� �޼���� ȣ��� �޼��� ���� ��ο��� ���� ó���ϴ� ��
	
	//try-catch���� 2���� : �� ���ʿ��� ����ó��
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main �޼��� ����ó�� �Ϸ�");
		}
	}

	static void method1() throws Exception{
		try {
			throw new Exception("���� �Ǵ�����");
		} catch (Exception e) {
			System.out.println("method1 ����ó�� �Ϸ�");
			throw e; //���� ���ѱ��
		}
	}

}
