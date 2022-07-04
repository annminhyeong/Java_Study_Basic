package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

//스트림 자르기
//Stream<T> skip(long n) : 앞에서 부터 n개 건너뛰기
//Stream<T> limit(long maxSize) : maxSize 이후의 요소는 잘라냄
//
//스트림의 요소 걸러내기
//Stream<T> filter(Predicate<? super T> predicate) : 조건에 맞지 않는 요소 제거
//Stream<T> distinct() : 중복 제거
//
//스트림 정렬하기
//Stream<T> sorted() : 스트림의 요소의 기본정렬로 정렬
//Stream<T> sorted(Comparator<? super T> comparator) : 지정된 Comparator로 정렬
//thenComparing : 정렬조건 2개이상일때 사용


public class Ex14 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
			);
		
		//반별로정렬한 다음, 총점이 높은순으로 정렬한다.
		studentStream.sorted(Comparator.comparing(Student::getBan) //반별정렬
				.thenComparing(Comparator.naturalOrder())) //기본정렬 (Student클래스 compareTo())
				.forEach(System.out::println);
	}
}

class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore){
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	//총점 내림차순 정렬
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
}
