package ch07;
//추상클래스의 작성
//여러클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
//기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다.

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {	};
}

class Marine extends Unit{
	void move(int x, int y) {System.out.printf("Marine[x=%d,y=%d]%n",x ,y);}
	void steamPack() {System.out.println("스팀팩 사용");}
}

class Tank extends Unit{
	void move(int x, int y) {System.out.printf("Tank[x=%d,y=%d]%n",x ,y);}
	void changeMode() {System.out.println("공격모드 변환");}
}

class Dropship extends Unit{
	void move(int x, int y) {System.out.printf("Dropship[x=%d,y=%d]%n",x ,y);}
	void load() {System.out.println("사람 태우기");}
	void unload() {System.out.println("사람 내리기");}
}

public class Ex15 {
	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for(int i=0; i<group.length; i++)
			group[i].move(100, 200);
	}
}
