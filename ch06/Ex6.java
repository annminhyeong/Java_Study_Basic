package ch06;
class Data2{int x;}

public class Ex6 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		
		System.out.println("main x:" + d.x); // 10
		change(d);
		
		System.out.println("after main x:" + d.x); //1000
	}
	
	//d의 참조변수 주소가 파라미터에 복사됨, d와 파라미터 값이 동일한 주소값을 가리킴
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("chage x:"+ d.x); // 1000
	}

}
