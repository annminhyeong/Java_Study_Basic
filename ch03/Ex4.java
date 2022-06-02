package ch03;

public class Ex4 {

	public static void main(String[] args) {
		int x = 1, y = 2;
		int result;
		result = x > y ? x : y;
		
		x += 10 + y; // x = x + (10 + y) 
		System.out.println(x);
	}

}
