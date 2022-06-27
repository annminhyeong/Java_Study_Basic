package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//�������̼� �����
//�������̽�ó�� final static�� �����ȴ�.
//����: @interface �ֳ����̼��̸�{
//		Ÿ�� ����̸�(); //�ֳ����̼��� ��Ҹ� �����Ѵ�.
//    }
//
//�������̼��� �޼���� �߻� �޼����̸�, �������̼��� ������ �� ����(����x)
//
//����� ���� �������� ������, ���� �� �ִ� �⺻�� ��������(null����);
//ex) Ÿ�� �޼���� default �⺻��;
//
//��Ұ� �ϳ��̰� �̸��� value�϶��� ����� �̸� ��������
//����� �̸��� Value�϶��� ��������
//
//����� Ÿ���� �迭�� ���, ��ȣ{}�� ����ؾ��Ѵ�.
//
//��� �������̼��� ����
//Annotion�� ��� �������̼��� ���������� ����� �Ұ�
//��� Annotion�� �������̽���.
//
//�������̼� ����� ��Ģ
//1. ����� Ÿ���� �⺻��, String, enum, �������̼�, Class�� ����
//2. ��ȣ()�ȿ� �Ű������� ������ �� ����.
//3. ���ܸ� ������ �� ����.
//4. ��Ҹ� Ÿ�� �Ű������� ������ �� ����.


@Deprecated
@SuppressWarnings("1111") //��ȿ���� �ʴ� �������̼��� ���õȴ�.
@Testinfo(testedBy = "aaa", testTools = {"JUnit", "JUnit5"}, testDate = @DateTime(yymmdd="160101",hhmmss="235959"))
public class Ex13 {
	public static void main(String[] args) {
		//Ex13�� Class��ü�� ��´�.
		Class<Ex13> cls = Ex13.class;
		
		Testinfo anno = cls.getAnnotation(Testinfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()= "+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()= "+anno.testDate().hhmmss());
		
		
		for(String str : anno.testTools()) {
			System.out.println("testTools= "+ str);
		}
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
		
		
	}
}

//����ÿ� ��밡���ϵ��� ����
@Retention(RetentionPolicy.RUNTIME)
@interface Testinfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // ���� �ÿ� ��밡���ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }