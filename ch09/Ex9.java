package ch09;

public class Ex9 {
	public static void main(String[] args) {
		//join()과 StringJoiner
		//join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		String str = String.join("-", arr); //배열의 문자열을 "-"로 구분자로 결합
		System.out.println(str);
		
		//문자열과 기본형 간의 변환
		int i = 100;
		String str1 = i+"";
		String str3 = Integer.toString(100);
		String str2 = String.valueOf(i);

		//문자열을 숫자로 바꾸는 방법 2가지
		int i1 = Integer.parseInt("100");
		int i2 = Integer.valueOf("100");
		Integer i3 = Integer.valueOf("100");

	}
}
