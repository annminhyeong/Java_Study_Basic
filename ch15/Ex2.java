package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		byte[] inSrc  = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		
		//ByteArrayInputStream 참조변수 생성 (리모콘)
		ByteArrayInputStream  input  = null;
		//ByteArrayOutputStream 참조변수 생성 (리모콘)
		ByteArrayOutputStream output = null;
		
		
		//ByteArrayInputStream 객체 생성
		input = new ByteArrayInputStream(inSrc);
		//ByteArrayOutputStream 객체 생성
		output = new ByteArrayOutputStream();
		
		//0부터 최대 temp.length의 길이만큼 ByteArrayInputStream(inSrc)를 읽어서 temp 배열에 저장한다.
		input.read(temp, 0, temp.length);
		
		//5번째 부터 5개만큼 읽어서 출력소스에 쓴다.
		output.write(temp, 5, 5);
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source :"+ Arrays.toString(inSrc));
		System.out.println("temp         :"+ Arrays.toString(temp));
		System.out.println("output Source:"+ Arrays.toString(outSrc));
		
	}//main
}//class
