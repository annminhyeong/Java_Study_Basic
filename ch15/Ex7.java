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
		
		//ArrayList 비슷한 클래스 (Thread-safe함)
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		
		//여러개의 입력스트림을 하나의 스트림같이 만들어줌, Vector에 저장한순서대로 출력됨
		SequenceInputStream   input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while ((data = input.read())!= -1) {
				output.write(data);
			}
		} catch (Exception e) {}
		
		//스트림의 내용을 byte배열로 반환한다.
		outSrc = output.toByteArray();
		
		System.out.println("input Source1:" + Arrays.toString(arr1));
		System.out.println("input Source2:" + Arrays.toString(arr2));
		System.out.println("input Source3:" + Arrays.toString(arr3));
		System.out.println("output Source:" + Arrays.toString(outSrc));
		
	}

}
