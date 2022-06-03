package ch05;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수: " + args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(i + "번째 매개변수: " + args[i]);
		}
	}

}
