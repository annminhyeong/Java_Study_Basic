package ch07;
class Car2{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive!!");
	}
	
	void stop() {
		System.out.println("skiiikkki");
	}
}

class FireCar2 extends Car2{
	void water() {
		System.out.println("water~~~");
	}
}
public class Ex11 {
	void doWork(Car2 c){
		if(c instanceof FireCar2) {
			//참조변수의 형변환 하는 이유
			//참주변수(리모콘)을 변경함으로써 사용할 수 있는 맴버의 개수를 조절하기 위해서
			FireCar2 fe = (FireCar2)c;
			fe.water();
		}
	}
	
	public static void main(String[] args) {
		//instanceof 연산자
		//참조변수의 형변환 가능여부 확인에 사용 가능하면 true 반환
		//형변환 전에 반드시 instanceof로 확인해야 함
		
		FireCar2 fe = new FireCar2();
		
		//조상타입에 대해서도 참이 나옴
		System.out.println(fe instanceof Object); //true
		System.out.println(fe instanceof Car2); //true
		System.out.println(fe instanceof FireCar2); //true
		
		
	}
}
