package ch07;

//�߻�޼��带 1���̻� ������ ������ abstract ���̱�
abstract class Player{
	//�߻�Ŭ���� (�ν��Ͻ� ���� �Ұ�)
	//����: abstract Ŭ�����̸�();
	//�̿ϼ� �޼��带 1���̻� ������ �ִ� Ŭ����
	//�ٸ�Ŭ���� �ۼ��� ������ �ֱ� ���� ��. 
	//����� ���� �߻� �޼��带 �ϼ��ؾ� �ν��Ͻ� ���� ����

	
	//�߻� �޼���
	//����: abstract ����Ÿ�� �޼����̸�();
	//������(����,{})�� ���� �޼���
	//�߻� �޼��� ȣ�Ⱑ��(ȣ���Ҷ��� ����θ� �ʿ�)
	
	
	//�߻�޼���
	abstract void play(int pos);
	//�߻�޼���
	abstract void stop();
}

//�߻�޼���� ����� ���� �ϼ��ؾ� ��밡��
class AudioPlayer extends Player{
	void play(int pos) { System.out.println(pos + "��ġ���� �����մϴ�."); }
	void stop() { System.out.println("�������"); }	
	
	//�߻�Ŭ������ ��ӹް� ���� �߻�޼��带 �� �����ؾߵǴ°��� �ƴ�
	//�����ϰ� ���������� Ŭ�����տ� abstarct�� ���̸� ��
	//��� �ν��Ͻ� �����Ұ�
}
public class Ex14 {

	public static void main(String[] args) {
		//�߻�Ŭ������ �ν��Ͻ� �����Ұ�
		//Player p = new Player();
		
		//�ν��Ͻ��� �����ɶ� AudioPlayer�� �����Ǳ⶧���� play(), stop()�� �����Ǿ� ����,
		//Player Ŭ������ �߻�޼���� play(), stop() �����������Ƿ� PlayerŸ�Ե� ����
		AudioPlayer a = new AudioPlayer(); //������
		a.play(100);
		a.stop();
		
	}

}
