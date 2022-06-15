package ch10;

import java.util.Calendar;

public class Ex1 {
	public static void main(String[] args) {
		//날짜와 시간
		//Calenar ,Date패키지 : 날짜와 시간을 같이 다룸 (권장안함)
		//time패키지 : Calenar, Date의 단점을 보완한 패키지

		//Calendar 클래스
		//추상클래스이므로 인스턴스를 생성할 수 없다
		//Calendar cal = Calendar.getInstance();

		//Calendar에 정의된 필드

		//날짜관련 필드
		//YEAR : 년
		//MONTH : 월 (0부터 시작)
		//WEEK_OF_YEAR : 그해의 몇번째 주
		//WEEK_OF_MONTH : 그달의 몇번째 주
		//DATE : 일
		//DAY_OF_MONTH : 그달의 몇번째일
		//DAY_OF_YEAR : 그해의 몇번째일
		//DAY_OF_WEEK : 요일
		//DAY_OF_WEEK_IN_MONTH : 그달의 몇번째 요일

		//시간관련 필드
		//HOUR : 시간(0~11)
		//HOUR_OF_DAY : 시간(0~23)
		//MINUTE : 분 (0~59)
		//SECOND : 초 (0~59)
		//MILLISECOND : 천분의 일초
		//ZONE_OFFSET : GMT기준 시차(천분의 일초 단위)
		//AM_PM : 오전/오후
		
		//추상메서드이므로 인스턴스생성불가
		//기본적으로 현재날짜와 시간으로 설정된다.
		Calendar cal = Calendar.getInstance();
		
		System.out.print(cal.get(Calendar.YEAR)+":");
		System.out.print(cal.get(Calendar.MONTH)+1+":");
		System.out.print(cal.get(Calendar.DATE)+":");
		System.out.print(cal.get(Calendar.HOUR)+":");
		System.out.print(cal.get(Calendar.MINUTE)+":");
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("이달의 마지막:" + cal.getActualMaximum(Calendar.DATE));
		

	}
}
