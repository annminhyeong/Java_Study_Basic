package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//����output��Ʈ���� ����ũ�⸦ 5�� ����
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			fos.close(); //����output��Ʈ���� �ݴ´�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
