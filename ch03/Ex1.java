package ch03;

public class Ex1 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		//증감연산자가 단독으로 사용된 경우 전위형과 후위형의 차이가 없다.
		
		//전위형
		//++i
		//j = i
		j = ++i;
		
		//후위형
		//j = i
		//i++;
		j = i++;
		
		
	}

}
