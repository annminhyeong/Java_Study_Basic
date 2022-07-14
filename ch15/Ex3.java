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
		
		//ByteArrayInputStream 입력 참조변수 생성
		ByteArrayInputStream  input  = null;
		//ByteArrayOutputStream 출력 참조변수 생성
		ByteArrayOutputStream output = null;
		
		//ByteArrayInputStream 객체를 생성과 동시에 inSrc를 입력
		input = new ByteArrayInputStream(inSrc);
		//ByteArrayOutputStream 객체를 생성
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source  :"+ Arrays.toString(inSrc));
		
		try {
			//available() : 스트림으로 부터 읽어 올 수 있는 데이터 크기
			while (input.available() > 0) {
				//input의 내용을 temp의 크기만큼 읽어서 저장
				input.read(temp);
				//temp배열의 저장된 값을 output에 쓰기
				//기존배열의 값을 덮어쓰는 형식이므로 배열의 값이 배열크기보다 작은경우 뒤에 이전배열의 값이 남아 있을 수 있음
				//이를 해결하기 위해서는 배열을 읽어올 위치를 지정하면 된다.
				output.write(temp);
				
				//스트림의 내용을 배열로 변환
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
