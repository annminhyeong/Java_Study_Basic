package ch08;

import java.io.File;

public class Ex4 {
	//����ó���ϴ� ���
	//1. try-catch (���� ����ó��)
	//2. ���� �����ϱ�(���� ���ѱ��), checked ���ܸ� ����
	//ex) Ÿ�� �޼����() throws ����1, ����2
	//3. ����(����) �� catch
	
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+" ������ �����Ǿ����ϴ�.");
		
		//try�� ��ü���� ������ �߻��ϰų� createFile �޼��忡�� Exception ������ �߻��ϸ� main�޼��忡�� ������ ó����
		//(main �޼��忡�� createFile�޼��带 ȣ���ϰ� �ֱ⶧����)
		}catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ��Է����ּ���");
			
		//finally ��: ���� �߻����ο� ������� ����Ǵ� ���
		}finally {
			System.out.println("���ܹ߻����ο� ������� ����Ǵ� �ڵ�");
		}
	}

	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			//try-catch���� �����Ƿ� �߻��� ���ܸ� createFile�� ȣ���� main�� ���ѱ�
			throw new Exception("������ ��ȿ���� ����");
		
		//����Ŭ���� ��ü����
		File f = new File(fileName);
		
		//���ϰ�ü�� createNewFile�޼��带 �̿��ؼ� �������� ����
		f.createNewFile();
		return f;
	}

}
