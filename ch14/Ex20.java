package ch14;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import java.util.stream.Stream;
import static java.util.Comparator.*;

//collect() : Collector를 매개변수로 하는 스트림 최종연산
//
//Collector는 수집(collect)에 필요한 메서드를 정의해 놓은 인터페이스
//첫번째 매개변수 : 누적할 곳
//두번째 매개변수 : 누적방법
//셋번째 매개변수 : 결합방법(병렬,순차)
//넷번째 매개변수 : 최종연산
//
//Collectors클래스는 다양한 기능의 컬렉터(Collector를 구현한 클래스)를 제공
//
//collect() : 최종연산
//Collector : 인터페이스
//Collectors : 클래스
//
//스트림을 컬렉션, 배열로 변환
//스트림을 컬렉션으로 변환 : toList(), toSet(), toMap(), toCollection()
//
//스트림을 배열로 변환 : toArray()
//
//스트림의 통계
//스트림의 그룹별 통계정보 제공 : counting(), summingInt(), maxBy(), minBy(), ... 등등
//
//reducing() : 스트림을 그룹별 리듀싱, reduce()와 비슷
//
//joining() : 문자열 스트림의 요소를 모두 연결


//스트림의 그룹화와 분할
//partitioningBy() : 스트림을 2분할한다.
//groupingBy() : 스트림을 n분할 한다.


class Student2{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() { return name; }

	public boolean getIsMale() {	return isMale; }

	public int getHak() { return hak; }

	public int getBan() { return ban; }

	public int getScore() { return score; }
	
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]",
				name, isMale ? "남" : "여", hak, ban, score);
	}
	
	enum Level{HIGH, MID, LOW}
}



public class Ex20 {
	public static void main(String[] args) {
		Student2[] stuArr = {
			new Student2("나자바", true,  1, 1, 300),	
			new Student2("김지미", false, 1, 1, 250),	
			new Student2("김자바", true,  1, 1, 200),	
			new Student2("이지미", false, 1, 2, 150),	
			new Student2("남자바", true,  1, 2, 100),	
			new Student2("안지미", false, 1, 2,  50),	
			new Student2("황지미", false, 1, 3, 100),	
			new Student2("강지미", false, 1, 3, 150),	
			new Student2("이자바", true,  1, 3, 200),	
			new Student2("나자바", true,  2, 1, 300),	
			new Student2("김지미", false, 2, 1, 250),	
			new Student2("김자바", true,  2, 1, 200),	
			new Student2("이지미", false, 2, 2, 150),	
			new Student2("남자바", true,  2, 2, 100),	
			new Student2("안지미", false, 2, 2,  50),	
			new Student2("황지미", false, 2, 3, 100),	
			new Student2("강지미", false, 2, 3, 150),	
			new Student2("이자바", true,  2, 3, 200)	
		};
		
		System.out.printf("1. 단순분할(성별로 분할)%n");
		Map<Boolean, List<Student2>> stuBySex =  Stream.of(stuArr)
				.collect(partitioningBy(Student2::getIsMale));
		
		List<Student2> maleStudent = stuBySex.get(true);
		List<Student2> femaleStudent = stuBySex.get(false);
		
		for(Student2 s : maleStudent) System.out.println(s);
		for(Student2 s : femaleStudent) System.out.println(s);
		
		
		System.out.printf("%n2. 단순분할 통계(성별, 학생수)%n");
		Map<Boolean, Long> stuNumbySex = Stream.of(stuArr)
				.collect(partitioningBy(Student2::getIsMale, counting()));
		
		System.out.println("남학생수: " + stuNumbySex.get(true));
		System.out.println("여학생수: " + stuNumbySex.get(false));
		
		
		System.out.printf("%n3. 단순분할 통계(성별1등)%n");
		Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student2::getIsMale,
						maxBy(comparingInt(Student2::getScore))));
		
		System.out.println("남학생 일등: " + topScoreBySex.get(true));
		System.out.println("여학생 일등: " + topScoreBySex.get(false));
		
		
		
		Map<Boolean, Student2> topScoreBySex2 = Stream.of(stuArr)
				.collect(partitioningBy(Student2::getIsMale, 
					collectingAndThen(
						maxBy(comparingInt(Student2::getScore)), Optional::get
					)
				));
		
		System.out.println("남학생 일등: " + topScoreBySex2.get(true));
		System.out.println("여학생 일등: " + topScoreBySex2.get(false));
		
		
		System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");
		
		Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = 
				Stream.of(stuArr).collect(partitioningBy(Student2::getIsMale, 
					partitioningBy(s -> s.getScore() <= 100))
				); 
		
		List<Student2> failedMaleStu   = failedStuBySex.get(true).get(true);
		List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);

		for(Student2 s : failedMaleStu)   System.out.println(s);
		for(Student2 s : failedFemaleStu) System.out.println(s);
	}
}























