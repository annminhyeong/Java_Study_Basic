package ch06;

public class Ex2 {

	public static void main(String[] args) {
		//��ü�迭 �����
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		Tv t; //��ü �������� ����
		t = new Tv(); //��ü ���������� ��ü�޸��ּ�(������) ���� (�ν��Ͻ� ����)
		
		t.channel = 7; //Tv �ν��Ͻ� �ɹ������� �� ����
		t.channelDown(); //Tv �ν��Ͻ� �޼��� ȣ��
		
		System.out.println("����ä����" + t.channel + "�Դϴ�."); //Tv �ν��Ͻ� �ɹ����� ���
	}

}

class Tv{	
	//Tv�� �Ӽ�(�ɹ� ����)
	String color;   //����
	boolean power;  //��������
	int channel;    //ä��
	
	//Tv�� ���(�޼���)
	void power(){ power = !power; };  //ä�� on/off
	void channelUp(){ ++channel; };   //ä�� �ø���
	void channelDown(){ --channel; }; //ä�� ������
}
