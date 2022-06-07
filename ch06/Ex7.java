package ch06;

class Data3{int x;};
public class Ex7 {
	
	//같은 클래스에서 static 붙은 메스드의 참조변수 생략가능
	//Ex7 e = new Ex7(); // 참조변수 생략가능
	//static 메서드는 객체 생성없이 호출 가능
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x =10;
		
		//copy의 참조변수 주소를 받아서 d2에 저장
		Data3 d2 = copy(d);
		System.out.println("d.x:" + d.x);
		System.out.println("d2.x:" + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		//tmp 참조변수 주소을 반환
		return tmp;
	}

}
