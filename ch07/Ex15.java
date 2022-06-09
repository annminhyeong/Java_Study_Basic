package ch07;
//�߻�Ŭ������ �ۼ�
//����Ŭ������ ���������� ���� �� �ִ� �߻�Ŭ������ �ٷ� �ۼ��ϰų�
//����Ŭ������ ���� �κ��� �̾Ƽ� �߻�Ŭ������ �����.

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {	};
}

class Marine extends Unit{
	void move(int x, int y) {System.out.printf("Marine[x=%d,y=%d]%n",x ,y);}
	void steamPack() {System.out.println("������ ���");}
}

class Tank extends Unit{
	void move(int x, int y) {System.out.printf("Tank[x=%d,y=%d]%n",x ,y);}
	void changeMode() {System.out.println("���ݸ�� ��ȯ");}
}

class Dropship extends Unit{
	void move(int x, int y) {System.out.printf("Dropship[x=%d,y=%d]%n",x ,y);}
	void load() {System.out.println("��� �¿��");}
	void unload() {System.out.println("��� ������");}
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
