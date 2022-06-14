package ch09;

public class Ex4 {

	public static void main(String[] args) {
		//String(String s) : 주어진 문자열(s)을 갖는 String 인스턴스를 생성
		String s1 = new String("Hello");
		
		//String(char[] value) : char배열을 문자열로 변환해 string 인스턴스로 생성
		char[] c1 = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c1);

		//String(StringBuffer buf) : StringBuffer과 같은 문자열을 String 인스턴스로 생성
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);

		//char charAt(int index) : 지정된 위치에 있는 문자를 알려줌
		String s4 = "Hello";
		String n1 = "0123456";
		char c = s2.charAt(1);
		char c2 = n1.charAt(1);

		//int compareTo(String str) : 문자열을 사전순서(a,b,c 순)로 비교한다. 같으면 0을, 사전순으로 이전이면 음수, 이후이면 양수를 반환한다. 
		int i1 = "aaa".compareTo("aaa"); //0
		int i2 = "aaa".compareTo("bbb");//-1
		int i3 = "bbb".compareTo("aaa");//1
	}

}
