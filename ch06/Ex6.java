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
	
	//d�� �������� �ּҰ� �Ķ���Ϳ� �����, d�� �Ķ���� ���� ������ �ּҰ��� ����Ŵ
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("chage x:"+ d.x); // 1000
	}

}
