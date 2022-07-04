package ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex15 {
	public static void main(String[] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")	
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> fileNameStream = fileStream.map(File::getName);
		fileNameStream.forEach(System.out::println);
		System.out.println();
		
		//file 스트림 다시 생성
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName) //Stream<File>을 Stream<String>으로 변환
		.filter(s -> s.indexOf('.') != -1) //확장자가 없으면 제거
		.peek(s -> System.out.printf("fileName=%s%n",s))
		.map(s -> s.substring(s.indexOf('.')+1)) //확장자만 추출
		.peek(s -> System.out.printf("extention=%s%n",s))
		.distinct() //중복제거
		.forEach(System.out::println);
	}
}
