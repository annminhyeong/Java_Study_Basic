package ch10;

import java.util.Calendar;

public class Ex4 {
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6))-1;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
			
			int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6))-1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
			
			//인스턴스를 생성과 동시에 현재시각이 들어가는데
			//date1과 date2에서 밀리세컨드 시간차이가 발생함
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			
			//clear()는 Calandar객체의 모든필드를 초기화
			//claer(int field)는 calandar 객체의 특정 필드 초기화
			//인스턴스를 생성할때 ms차이가 나므로 claer를 해줘야함
			date1.clear();
			date2.clear();
			
			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);
			
			//System.out.println((date1.getTimeInMillis() - date2.getTimeInMillis())/(24*60*60*1000f));
			diff = (int)(date1.getTimeInMillis() - date2.getTimeInMillis())/(24*60*60*1000);
		} catch (Exception e) {
			diff = 0;
		}
		
		return diff;
	}
	
	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}
}
