package ch08;

public class Ex3 {

	public static void main(String[] args) {
		//��������
		//1. �����Ͽ���
		//2. ��Ÿ�ӿ���
		//  Error
		//  Exception
		//    Exception�� �ڼ�(checked ����)
		//    RuntimeException�� �ڼ�(unchecked ����)
		//3. ��������
			
		//checked ����: �����Ϸ��� ���� ó�� ���� üũ�� (Exception�� �ڼ�), try-catch �ʼ�
		//unchecked ����: �����Ϸ��� ���� ó�� ���� üũ����(RuntimeException�� �ڼ�), try-catch ����,
		//������ ���α׷��Ӱ� ���ֹ߻���Ű�� �������� �ʼ����Ѵٸ� ���� ����ڵ忡 try-catch���� ��ߵǹǷ� ������
		
		try {
			//���� �߻���Ű��
			//1. �߻���ų���� �ش� ���ܸ� ������ new�� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü ������ ����
			Exception e = new Exception("���Ƿ� ���ܹ߻�������");
			
			//2. Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��.
			throw e;
			
			//1,2�� �ϳ��� ��ġ��
			//throw new Exception("���ܹ߻� �ѹ���");
			
		//����Ÿ���� ��ġ�ϸ� �����
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�ý����� ���� �����");
	}

}