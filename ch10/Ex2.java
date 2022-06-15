package ch10;

import java.util.Calendar;

public class Ex2 {
	public static void main(String[] args) {
		//Calendar.DAY_OF_WEEK가 1부터시작하므로 0번째는 공백
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2= Calendar.getInstance();
		
		//Month는 0부터 시작하기때문에 주의
		//date1.set(2020, Calendar.FEBRUARY, 2); 와 같이 할수 있음
		date1.set(2020, 1, 2); //2020년 2월 2일로 날짜를 설정한다.
		System.out.print("date1는 " + toString(date1));
		System.out.println(DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "요일 입니다.");
		System.out.print("오늘은(date2)는 " + toString(date2));
		System.out.println(DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+ "요일 입니다.");
		
		//밀리세컨드에서 1초가 1000이므로 1로 만들려면 1000으로 나누어야함
		long different = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그날(date1)부터 지금(date2)까지"+different+"초가 지났습니다.");
		//1일 = 24시간 * 60분 * 60초
		System.out.println("일(day)로 계산하면"+ different/(24*60*60)+"일입니다.");
	}

	static String toString(Calendar date) {
		StringBuffer yearMonthday = new StringBuffer(date.get(Calendar.YEAR)+"년 ");
		yearMonthday.append(date.get(Calendar.MONTH)+1+"월 ");
		yearMonthday.append(date.get(Calendar.DATE)+"일 ");	
		return yearMonthday.toString();
	}
}
