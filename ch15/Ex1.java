package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream  input = null;
		ByteArrayOutputStream output = null;
		
		input  = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		//byte Ÿ���� int�� ����ȯ �Ǳ⶧���� int�� ����
		int data = 0;
		
		//input ��Ʈ���� �ִ� byte �迭�� ���� �ϳ��� �о��, -1�ΰ�� �о�� �����Ͱ� ���ٴ� ��
		while ((data = input.read()) != -1) {
			output.write(data);
		}
		
		//��Ʈ���� ������ byte�迭�� ��ȯ�Ѵ�.
		outSrc = output.toByteArray();
		
		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
