package ch09;

public class Ex7 {

	public static void main(String[] args) {
		//String[] split(String regex) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String animals1 = "dog,cat,bear";
		String[] arr1 = animals1.split(",");

		//String[] split(String regex, int limit) : 
		//문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다. 단 문자열 전체를 지정된 수(limit)로 자른다.
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(",", 2);

		//boolean startsWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
		String s1 = "java.lang.Object";
		boolean b1 =s1.startsWith("java");
		boolean b2 =s1.startsWith("lang");

		//String substring(int begin)
		//String substring(int begin, int end) 
		//: 주어진 시작위치(begin)부터 끝위치(end) 범위에 포함된 문자열을 얻는다 시작위치의 문자열은 포함되지만 끝 위치의 문자는 포함되지 않는다.
		//(begin <= x < end)
		String s2 = "java.lang.Object";
		String c = s2.substring(10);
		String p = s2.substring(5,9);

	}

}
