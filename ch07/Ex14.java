package ch07;

//추상메서드를 1개이상 가지고 있을때 abstract 붙이기
abstract class Player{
	//추상클래스 (인스턴스 생성 불가)
	//형식: abstract 클래스이름();
	//미완성 메서드를 1개이상 가지고 있는 클래스
	//다른클래스 작성에 도움을 주기 위한 것. 
	//상속을 통해 추상 메서드를 완성해야 인스턴스 생성 가능

	
	//추상 메서드
	//형식: abstract 리턴타입 메서드이름();
	//구현부(몸통,{})이 없는 메서드
	//추상 메서드 호출가능(호출할때는 선언부만 필요)
	
	
	//추상메서드
	abstract void play(int pos);
	//추상메서드
	abstract void stop();
}

//추상메서드는 상속을 통해 완성해야 사용가능
class AudioPlayer extends Player{
	void play(int pos) { System.out.println(pos + "위치부터 시작합니다."); }
	void stop() { System.out.println("재생중지"); }	
	
	//추상클래스를 상속받고 나서 추상메서드를 꼭 구현해야되는것은 아님
	//구현하고 싶지않으면 클래스앞에 abstarct를 붙이면 됨
	//대신 인스턴스 생성불가
}
public class Ex14 {

	public static void main(String[] args) {
		//추상클래스는 인스턴스 생성불가
		//Player p = new Player();
		
		//인스턴스가 생성될때 AudioPlayer로 생성되기때문에 play(), stop()가 구현되어 있음,
		//Player 클래스가 추상메서드로 play(), stop() 가지고있으므로 Player타입도 가능
		AudioPlayer a = new AudioPlayer(); //다형성
		a.play(100);
		a.stop();
		
	}

}
