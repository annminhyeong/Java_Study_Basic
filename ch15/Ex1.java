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
		
		//byte 타입은 int로 형변환 되기때문에 int로 받음
		int data = 0;
		
		//input 스트림의 있는 byte 배열의 값을 하나씩 읽어옴, -1인경우 읽어올 데이터가 없다는 뜻
		while ((data = input.read()) != -1) {
			output.write(data);
		}
		
		//스트림의 내용을 byte배열로 반환한다.
		outSrc = output.toByteArray();
		
		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
