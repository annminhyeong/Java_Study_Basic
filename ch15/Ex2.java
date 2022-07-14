package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		byte[] inSrc  = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		
		//ByteArrayInputStream �������� ���� (������)
		ByteArrayInputStream  input  = null;
		//ByteArrayOutputStream �������� ���� (������)
		ByteArrayOutputStream output = null;
		
		
		//ByteArrayInputStream ��ü ����
		input = new ByteArrayInputStream(inSrc);
		//ByteArrayOutputStream ��ü ����
		output = new ByteArrayOutputStream();
		
		//0���� �ִ� temp.length�� ���̸�ŭ ByteArrayInputStream(inSrc)�� �о temp �迭�� �����Ѵ�.
		input.read(temp, 0, temp.length);
		
		//5��° ���� 5����ŭ �о ��¼ҽ��� ����.
		output.write(temp, 5, 5);
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source :"+ Arrays.toString(inSrc));
		System.out.println("temp         :"+ Arrays.toString(temp));
		System.out.println("output Source:"+ Arrays.toString(outSrc));
		
	}//main
}//class
