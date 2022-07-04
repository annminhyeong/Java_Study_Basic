package ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex15 {
	public static void main(String[] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")	
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> fileNameStream = fileStream.map(File::getName);
		fileNameStream.forEach(System.out::println);
		System.out.println();
		
		//file ��Ʈ�� �ٽ� ����
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName) //Stream<File>�� Stream<String>���� ��ȯ
		.filter(s -> s.indexOf('.') != -1) //Ȯ���ڰ� ������ ����
		.peek(s -> System.out.printf("fileName=%s%n",s))
		.map(s -> s.substring(s.indexOf('.')+1)) //Ȯ���ڸ� ����
		.peek(s -> System.out.printf("extention=%s%n",s))
		.distinct() //�ߺ�����
		.forEach(System.out::println);
	}
}
