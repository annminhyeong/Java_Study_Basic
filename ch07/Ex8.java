package ch07;

//ĸ��ȭ�� ����������
//���������ڸ� ����ϴ� ����: �ܺη� ���� �����͸� ��ȣ�ϱ� ���ؼ�

class Time{
	private int hour; // 0���� 23�������� ���� ��������
	int minute;
	
	public void setHour(int hour) {
		if(idNotVaildHour(hour)) return;
		this.hour = hour;
	}
	
	//�Ű������� �Ѱ��� hour�� ��ȿ���� üũ
	private boolean idNotVaildHour(int hour) {
		return 0>hour || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}
public class Ex8 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(23); //���� ������� ���ٺҰ���
		t.minute = -100; //���� ������� ���ٰ���
		
		System.out.println(t.getHour());
		System.out.println(t.minute);
	}

}
