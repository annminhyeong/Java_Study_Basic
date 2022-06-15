package ch10;

import java.text.DecimalFormat;

//형식화 클래스
//java.text패키지의 DecimalFormat(10진수 숫자), SimpleDateFormat(날짜)
//숫자와 날짜를 원하는 형식으로 쉽게 출력가능 (숫자,날짜 -> 형식 문자열)

//형식문자열에서 숫자와 날짜를 뽑하내는 기능(형식 문자열 -> 숫자,날짜)

//DecimalFormat
//숫자를 형식화 할때 사용 (숫자 -> 형식문자열)
//주로 숫자에 ,가있을때 제거할때 활용됨

//parse : 문자열 -> 숫자
//format : 숫자 -> 문자열

public class Ex6 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("0,000,0E0");
		
		try {
			Number num = df1.parse("1,234,567,89");
			System.out.print("1,234,567,89"+ " -> ");
			
			double d = num.doubleValue();
			System.out.print(d +" -> ");
			
			System.out.print(df2.format(num));
		} catch (Exception e) {
		}
	}
}
