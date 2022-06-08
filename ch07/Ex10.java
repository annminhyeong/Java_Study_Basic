package ch07;
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive!!");
	}
	
	void stop() {
		System.out.println("skiiikkki");
	}
}

class FireCar extends Car{
	void water() {
		System.out.println("water~~~");
	}
}
public class Ex10 {
	//참조변수의 형변환
	//사용할 수 있는 맴버의 갯수를 조절하는 것
	//조상 자손 관계의 참조변수는 서로 형변환 가능
	//형제 관계인 경우는 형변환 불가능

	public static void main(String[] args) {
		
		//형변환 할때는 실제 인스턴스가 무엇인지가 중요함
		
		FireCar f1 = new FireCar();
		//자손을 조상으로 형변환 (타입 생략가능)
		//조상으로 타입을 바꿀경우 조상의 변수, 메서드만 사용가능
		Car c1 = (Car) f1; // water()을 쓸 수 없음
		
		//조상을 자손으로 형변환 (타입 생략불가능)
		//자손으로 타입을 바꿀경우 조상의 변수, 메서드와 자손의 변수, 메서드 사용가능
		FireCar f2 = (FireCar)c1; //water()을 쓸 수있음
		f2.water();
		
		
		Car c2 = new Car();
		
		//형변환 에러발생 (중요)
		//c2가 인스턴스를 생성할때 Car클래스로 인스턴스를 생성했기 때문에 water()가 없음
		//water()함수가 메모리에 존재하지 않으므로 형변환할때 에러가 발생함
		//FireCar f3 = (FireCar) c2;
		//f3.drive();
	}

}
