package ch10;

import java.util.Calendar;

//Clalendar 클래스
//get() 필드 얻어오기
//set() 필드 변경
//claer() 필드 초기화
//add()는 특정필드의 값을 증가 또는 감소(다른필드에 영향O)
//roll()은 특정필드의 값을 증가 또는 감소(다른필드에 영향X)

//1. Calendar를 date로 변환
//Calendar cal = Calendar.getInstance();
//Date d = new Date(cal.getTimeInMillis());
//
//2. Date를 Calendar로 변환
//Date d = new Date();
//Calendar cal = Calendar.getInstance();
//cal.setTime(d);

public class Ex5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31); //2019년 8월 31일
		
		System.out.println(toString(date));
		System.out.println("= 1일후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		//add와 달리 다른필드에 영향을 주지 않음
		System.out.println("= 31일후 =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31일후 =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		String year = date.get(Calendar.YEAR)+"년 ";
		String month = date.get(Calendar.MONTH)+1 +"월 ";
		String day = date.get(Calendar.DATE)+"일";
		
		return year + month + day;
	}
}
