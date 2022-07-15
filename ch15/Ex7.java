package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex7 {

	public static void main(String[] args) {
		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		byte[] outSrc = null;
		
		//ArrayList ����� Ŭ���� (Thread-safe��)
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		
		//�������� �Է½�Ʈ���� �ϳ��� ��Ʈ������ �������, Vector�� �����Ѽ������ ��µ�
		SequenceInputStream   input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while ((data = input.read())!= -1) {
				output.write(data);
			}
		} catch (Exception e) {}
		
		//��Ʈ���� ������ byte�迭�� ��ȯ�Ѵ�.
		outSrc = output.toByteArray();
		
		System.out.println("input Source1:" + Arrays.toString(arr1));
		System.out.println("input Source2:" + Arrays.toString(arr2));
		System.out.println("input Source3:" + Arrays.toString(arr3));
		System.out.println("output Source:" + Arrays.toString(outSrc));
		
	}

}
