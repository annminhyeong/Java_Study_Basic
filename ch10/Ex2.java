package ch10;

import java.util.Calendar;

public class Ex2 {
	public static void main(String[] args) {
		//Calendar.DAY_OF_WEEK�� 1���ͽ����ϹǷ� 0��°�� ����
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2= Calendar.getInstance();
		
		//Month�� 0���� �����ϱ⶧���� ����
		//date1.set(2020, Calendar.FEBRUARY, 2); �� ���� �Ҽ� ����
		date1.set(2020, 1, 2); //2020�� 2�� 2�Ϸ� ��¥�� �����Ѵ�.
		System.out.print("date1�� " + toString(date1));
		System.out.println(DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "���� �Դϴ�.");
		System.out.print("������(date2)�� " + toString(date2));
		System.out.println(DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+ "���� �Դϴ�.");
		
		//�и������忡�� 1�ʰ� 1000�̹Ƿ� 1�� ������� 1000���� ���������
		long different = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("�׳�(date1)���� ����(date2)����"+different+"�ʰ� �������ϴ�.");
		//1�� = 24�ð� * 60�� * 60��
		System.out.println("��(day)�� ����ϸ�"+ different/(24*60*60)+"���Դϴ�.");
	}

	static String toString(Calendar date) {
		StringBuffer yearMonthday = new StringBuffer(date.get(Calendar.YEAR)+"�� ");
		yearMonthday.append(date.get(Calendar.MONTH)+1+"�� ");
		yearMonthday.append(date.get(Calendar.DATE)+"�� ");	
		return yearMonthday.toString();
	}
}
