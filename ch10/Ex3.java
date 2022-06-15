package ch10;

import java.util.Calendar;

public class Ex3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"�ð�", "��", "��"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); //10��
		time1.set(Calendar.MINUTE, 20); //20��
		time1.set(Calendar.SECOND, 30); //30��
		
		time2.set(Calendar.HOUR_OF_DAY, 20); //20��
		time2.set(Calendar.MINUTE, 30); //30��
		time2.set(Calendar.SECOND, 10); //10��
		
		System.out.print("time1�� " + time1.get(Calendar.HOUR_OF_DAY)+"�� ");
		System.out.print(time1.get(Calendar.MINUTE)+"�� ");
		System.out.println(time1.get(Calendar.SECOND)+"���Դϴ�.");
		
		System.out.print("time2�� " + time2.get(Calendar.HOUR_OF_DAY)+"�� ");
		System.out.print(time2.get(Calendar.MINUTE)+"�� ");
		System.out.println(time2.get(Calendar.SECOND)+"���Դϴ�.");
		
		//�и������忡�� 1�ʴ� 1000���̹Ƿ� 1�� ������� 100���� ��������
		long different = Math.abs((time1.getTimeInMillis()-time2.getTimeInMillis())/1000);
		System.out.println("time1�� time2�� ���̴� "+ different+"�Դϴ�.");
		
		//�Ž����� ���ϱ�� �����
		//2350/500 = 4 , 500�� 4��, 2350%500 = 350, �Ž����� 350��
		//3600 = 1�ð�, 60 = 1��, 1= 1��
		String tmp = "";
		for(int i=0; i<TIME_UNIT.length; i++) {
			//ū���� ���� ����
			tmp += different/TIME_UNIT[i]+ TIME_UNIT_NAME[i];
			different %= TIME_UNIT[i];//������(�Ž�����)�� ����
		}
		System.out.println("�ú��ʷ� ��ȯ�ϸ� "+ tmp +"�Դϴ�.");
	}
}
