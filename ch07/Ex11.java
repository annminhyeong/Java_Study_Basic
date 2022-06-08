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
			//���������� ����ȯ �ϴ� ����
			//���ֺ���(������)�� ���������ν� ����� �� �ִ� �ɹ��� ������ �����ϱ� ���ؼ�
			FireCar2 fe = (FireCar2)c;
			fe.water();
		}
	}
	
	public static void main(String[] args) {
		//instanceof ������
		//���������� ����ȯ ���ɿ��� Ȯ�ο� ��� �����ϸ� true ��ȯ
		//����ȯ ���� �ݵ�� instanceof�� Ȯ���ؾ� ��
		
		FireCar2 fe = new FireCar2();
		
		//����Ÿ�Կ� ���ؼ��� ���� ����
		System.out.println(fe instanceof Object); //true
		System.out.println(fe instanceof Car2); //true
		System.out.println(fe instanceof FireCar2); //true
		
		
	}
}
