package ch10;

import java.util.Calendar;

//Clalendar Ŭ����
//get() �ʵ� ������
//set() �ʵ� ����
//claer() �ʵ� �ʱ�ȭ
//add()�� Ư���ʵ��� ���� ���� �Ǵ� ����(�ٸ��ʵ忡 ����O)
//roll()�� Ư���ʵ��� ���� ���� �Ǵ� ����(�ٸ��ʵ忡 ����X)

//1. Calendar�� date�� ��ȯ
//Calendar cal = Calendar.getInstance();
//Date d = new Date(cal.getTimeInMillis());
//
//2. Date�� Calendar�� ��ȯ
//Date d = new Date();
//Calendar cal = Calendar.getInstance();
//cal.setTime(d);

public class Ex5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31); //2019�� 8�� 31��
		
		System.out.println(toString(date));
		System.out.println("= 1���� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6���� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		//add�� �޸� �ٸ��ʵ忡 ������ ���� ����
		System.out.println("= 31���� =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31���� =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		String year = date.get(Calendar.YEAR)+"�� ";
		String month = date.get(Calendar.MONTH)+1 +"�� ";
		String day = date.get(Calendar.DATE)+"��";
		
		return year + month + day;
	}
}
