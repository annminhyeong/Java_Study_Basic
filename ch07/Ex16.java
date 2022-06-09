package ch07;
//�������̽�: �߻� �޼��� ����
//������ ���� ���� ���� ���赵 ������ (��� ����� public)
//��� �޼��尡 �߻�޼�����
//����Ʈ�޼���, static �޼���, ���, �߻�޼��常 ��밡��

//�������̽��� ������ �������̽��� ����
//���߻���� �����ϴ�
//����: ������ �޼��� �����ΰ� ���⶧���� ����� �ٸ����� ���� ���ʿ� ����� �����Ƿ�

//�������̽��� ����
//�������̽��� ���ǵ� �߻� �޼��带 �ϼ�(���� { })�ϴ� ��
//�Ϻθ� �����ϴ� ���, Ŭ���� �տ� abstract�� �ٿ��� ��

//�׻� public static final Ÿ�� ����� �����̴�.
//�׻� �׷� �����̱⶧���� public static final ��������
//�ɹ��޼���� �׻� public abstract Ÿ�� �޼����() �����̴�.
//�׻� �׷� �����̱⶧���� public abstract ��������

//�߻�Ŭ������ �������̽� ������
//�������̽��� iv, im, �����ڸ� ������ ����.


//�������̽��� �̿��� ������
//�������̽��� ���� Ŭ������ �θ�� ����� ����� ��(���� ����)
//ex) �������̽� i = new Ŭ������();

//�������̽� Ÿ�� �Ű������� �������̽��� ������ Ŭ������ ��ü�� ����
//�������̽��� �޼����� ��ȯŸ�� �������̽��� ��ȯŸ�Ե� �������̽��� ������ ��ü�� ��ȯ�ؾ��Ѵ�.
//�޼��带 ȣ�����ʿ����� Ÿ���� �������̽��� �޾ƾ� ��
abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����"); }
}

interface Fightable{
	void move(int x, int y); //public abstarct�� ������
	void attack(Fightable f); //public abstarct�� ������
}

class Fighter extends Unit2 implements Fightable{
	//�������̵� ��Ģ: ������ ���������ں��� ������ ������ �ȵȴ�.
	//����� ���� �������̽��� public�� �پ� �����Ƿ� default ���������� ���� public�� ����ؾ���
	public void move(int x, int y) {System.out.printf("move[x=%d,y=%d]%n", x, y);}
	public void attack(Fightable f) {System.out.println(f + "�� ����");}
	
	
	//Ÿ���� �������̽��ΰ�� implements�� ��ӹ��� ��ü�� ��ȯ�ؾ��Ѵ�.
	Fightable getFightable() {
		Fighter f = new Fighter();
		
		//Fighter ��ü ��ȯ
		return f; // (Fightable) f ����ȯ�� �����Ǿ�����
	}
}

public class Ex16 {

	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		Fightable f2 = new Fighter();
		Unit2 f3 = new Fighter(); 
		
		Fightable f = f1.getFightable();
		System.out.println(f);
		
		f1.move(0, 10);
		f1.attack(f1);
		f1.stop();
		
		f2.move(100, 200);
		f2.attack(f2);
		//f2.stop(); //FightableŸ�Կ��� stop()�� ��� ���ٺҰ�
		
		f3.move(0, 0);
		//f3.attack(f3); //Unit2Ÿ�Կ��� attack()�� ��� ���ٺҰ�
		f3.stop();
	}

}
