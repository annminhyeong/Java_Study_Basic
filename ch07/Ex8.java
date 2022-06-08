package ch07;

//캡슐화와 접근제어자
//접근제어자를 사용하는 이유: 외부로 부터 데이터를 보호하기 위해서

class Time{
	private int hour; // 0부터 23값사이의 값을 가져야함
	int minute;
	
	public void setHour(int hour) {
		if(idNotVaildHour(hour)) return;
		this.hour = hour;
	}
	
	//매개변수로 넘겨진 hour가 유효한지 체크
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
		t.setHour(23); //값에 마음대로 접근불가능
		t.minute = -100; //값에 마음대로 접근가능
		
		System.out.println(t.getHour());
		System.out.println(t.minute);
	}

}
