package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		//ByteArrayInputStream �Է� �������� ����
		ByteArrayInputStream  input  = null;
		//ByteArrayOutputStream ��� �������� ����
		ByteArrayOutputStream output = null;
		
		//ByteArrayInputStream ��ü�� ������ ���ÿ� inSrc�� �Է�
		input = new ByteArrayInputStream(inSrc);
		//ByteArrayOutputStream ��ü�� ����
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source  :"+ Arrays.toString(inSrc));
		
		try {
			//available() : ��Ʈ������ ���� �о� �� �� �ִ� ������ ũ��
			while (input.available() > 0) {
				//input�� ������ temp�� ũ�⸸ŭ �о ����
				input.read(temp);
				//temp�迭�� ����� ���� output�� ����
				//�����迭�� ���� ����� �����̹Ƿ� �迭�� ���� �迭ũ�⺸�� ������� �ڿ� �����迭�� ���� ���� ���� �� ����
				//�̸� �ذ��ϱ� ���ؼ��� �迭�� �о�� ��ġ�� �����ϸ� �ȴ�.
				output.write(temp);
				
				//��Ʈ���� ������ �迭�� ��ȯ
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch (IOException e) {}
	}

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          :"+ Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
