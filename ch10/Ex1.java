package ch10;

import java.util.Calendar;

public class Ex1 {
	public static void main(String[] args) {
		//��¥�� �ð�
		//Calenar ,Date��Ű�� : ��¥�� �ð��� ���� �ٷ� (�������)
		//time��Ű�� : Calenar, Date�� ������ ������ ��Ű��

		//Calendar Ŭ����
		//�߻�Ŭ�����̹Ƿ� �ν��Ͻ��� ������ �� ����
		//Calendar cal = Calendar.getInstance();

		//Calendar�� ���ǵ� �ʵ�

		//��¥���� �ʵ�
		//YEAR : ��
		//MONTH : �� (0���� ����)
		//WEEK_OF_YEAR : ������ ���° ��
		//WEEK_OF_MONTH : �״��� ���° ��
		//DATE : ��
		//DAY_OF_MONTH : �״��� ���°��
		//DAY_OF_YEAR : ������ ���°��
		//DAY_OF_WEEK : ����
		//DAY_OF_WEEK_IN_MONTH : �״��� ���° ����

		//�ð����� �ʵ�
		//HOUR : �ð�(0~11)
		//HOUR_OF_DAY : �ð�(0~23)
		//MINUTE : �� (0~59)
		//SECOND : �� (0~59)
		//MILLISECOND : õ���� ����
		//ZONE_OFFSET : GMT���� ����(õ���� ���� ����)
		//AM_PM : ����/����
		
		//�߻�޼����̹Ƿ� �ν��Ͻ������Ұ�
		//�⺻������ ���糯¥�� �ð����� �����ȴ�.
		Calendar cal = Calendar.getInstance();
		
		System.out.print(cal.get(Calendar.YEAR)+":");
		System.out.print(cal.get(Calendar.MONTH)+1+":");
		System.out.print(cal.get(Calendar.DATE)+":");
		System.out.print(cal.get(Calendar.HOUR)+":");
		System.out.print(cal.get(Calendar.MINUTE)+":");
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("�̴��� ������:" + cal.getActualMaximum(Calendar.DATE));
		

	}
}
