package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

//��Ʈ�� �ڸ���
//Stream<T> skip(long n) : �տ��� ���� n�� �ǳʶٱ�
//Stream<T> limit(long maxSize) : maxSize ������ ��Ҵ� �߶�
//
//��Ʈ���� ��� �ɷ�����
//Stream<T> filter(Predicate<? super T> predicate) : ���ǿ� ���� �ʴ� ��� ����
//Stream<T> distinct() : �ߺ� ����
//
//��Ʈ�� �����ϱ�
//Stream<T> sorted() : ��Ʈ���� ����� �⺻���ķ� ����
//Stream<T> sorted(Comparator<? super T> comparator) : ������ Comparator�� ����
//thenComparing : �������� 2���̻��϶� ���


public class Ex14 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 180)
			);
		
		//�ݺ��������� ����, ������ ���������� �����Ѵ�.
		studentStream.sorted(Comparator.comparing(Student::getBan) //�ݺ�����
				.thenComparing(Comparator.naturalOrder())) //�⺻���� (StudentŬ���� compareTo())
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
	
	//���� �������� ����
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
