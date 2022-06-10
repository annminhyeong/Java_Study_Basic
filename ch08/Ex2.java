package ch08;
//try-catch��
//try�� ������ ���ܰ� �߻��� ���
//try������ ���ܰ� �߻��� ���������� ������� �ʰ� ���ܿ� �´� catch���� ã�� ����ó���� �Ѵ�.
//exception�� ����� catch����� �������� �ۼ��Ѵ�.
//
//try�� ������ ���ܰ� �߻����� ���� ���
//try���� �����ѵ� catch���� �������� �ʴ´�.


public class Ex2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			//����ó��
			//1. ���ܰ� �߻��ϸ� �ش� ���ܿ� ���� ��ü�� �������
			//2. ������� ��ü���� �߻��� ���ܿ� ���� ������ ����(printStackTrace(), getMessage(), ����� ��ü�� �����)
			//3.catch������ �ش翹�ܰ�ü��Ÿ�԰� catch����� ����Ÿ�� ���������� ��ġ�ϴ� catch����� ã�� ����ó���� �Ѵ�.
			
			System.out.println(3);
			System.out.println(0/0); //���� ��ü ����
			System.out.println(4); //���ܰ��߻��ϸ� ������� ����
			
			
			//������ ���ܰ�ü ���������� cath �� �Ű������� Ÿ���� ���ѵ� ������ �ش� catch����� ������
			//��Ƽ catch ��
			//������ ���� catch����� �ϳ��� ��ģ ��(JDK 1.7����)
			//�ΰ��� exception�� �θ� �ڽ� ����� �ȵ�
			//�ΰ��� exception�� �������� ������ �ִ� �ɹ��� ��밡��
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException)
				//printStackTrace() : ���ܹ߻� ����� ȣ�⽺�ÿ� �ִ� �޼��������� ���� �޼����� ȭ�鿡 ����Ѵ�.
				e.printStackTrace();
			//getMessage() : �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޼����� ���� �� �ִ�.
			System.out.println("���ܸ޼���:"+ e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception");
		}
		//���� catch��Ͽ��� ����ó���� ���� ���ϸ� �̹����� ������� ����
		System.out.println(5);
	}

}
