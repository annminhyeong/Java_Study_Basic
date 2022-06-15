package ch10;

import java.util.Calendar;

public class Ex3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); //10시
		time1.set(Calendar.MINUTE, 20); //20분
		time1.set(Calendar.SECOND, 30); //30초
		
		time2.set(Calendar.HOUR_OF_DAY, 20); //20시
		time2.set(Calendar.MINUTE, 30); //30분
		time2.set(Calendar.SECOND, 10); //10초
		
		System.out.print("time1는 " + time1.get(Calendar.HOUR_OF_DAY)+"시 ");
		System.out.print(time1.get(Calendar.MINUTE)+"분 ");
		System.out.println(time1.get(Calendar.SECOND)+"초입니다.");
		
		System.out.print("time2는 " + time2.get(Calendar.HOUR_OF_DAY)+"시 ");
		System.out.print(time2.get(Calendar.MINUTE)+"분 ");
		System.out.println(time2.get(Calendar.SECOND)+"초입니다.");
		
		//밀리세컨드에서 1초는 1000초이므로 1로 만들려면 100으로 나눠야함
		long different = Math.abs((time1.getTimeInMillis()-time2.getTimeInMillis())/1000);
		System.out.println("time1과 time2의 차이는 "+ different+"입니다.");
		
		//거스름돈 구하기와 비슷함
		//2350/500 = 4 , 500원 4개, 2350%500 = 350, 거스름돈 350원
		//3600 = 1시간, 60 = 1분, 1= 1초
		String tmp = "";
		for(int i=0; i<TIME_UNIT.length; i++) {
			//큰단위 부터 나눔
			tmp += different/TIME_UNIT[i]+ TIME_UNIT_NAME[i];
			different %= TIME_UNIT[i];//나머지(거스름돈)을 저장
		}
		System.out.println("시분초로 변환하면 "+ tmp +"입니다.");
	}
}
