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
	//���������� ����ȯ
	//����� �� �ִ� �ɹ��� ������ �����ϴ� ��
	//���� �ڼ� ������ ���������� ���� ����ȯ ����
	//���� ������ ���� ����ȯ �Ұ���

	public static void main(String[] args) {
		
		//����ȯ �Ҷ��� ���� �ν��Ͻ��� ���������� �߿���
		
		FireCar f1 = new FireCar();
		//�ڼ��� �������� ����ȯ (Ÿ�� ��������)
		//�������� Ÿ���� �ٲܰ�� ������ ����, �޼��常 ��밡��
		Car c1 = (Car) f1; // water()�� �� �� ����
		
		//������ �ڼ����� ����ȯ (Ÿ�� �����Ұ���)
		//�ڼ����� Ÿ���� �ٲܰ�� ������ ����, �޼���� �ڼ��� ����, �޼��� ��밡��
		FireCar f2 = (FireCar)c1; //water()�� �� ������
		f2.water();
		
		
		Car c2 = new Car();
		
		//����ȯ �����߻� (�߿�)
		//c2�� �ν��Ͻ��� �����Ҷ� CarŬ������ �ν��Ͻ��� �����߱� ������ water()�� ����
		//water()�Լ��� �޸𸮿� �������� �����Ƿ� ����ȯ�Ҷ� ������ �߻���
		//FireCar f3 = (FireCar) c2;
		//f3.drive();
	}

}
