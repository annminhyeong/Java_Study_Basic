package ch07.Ex7.pkg2;

import ch07.Ex7.pkg1.MyParent1;

class MyChild extends MyParent1{
	public void printMembers() {
		//���� Ŭ������ �ƴ�
		//System.out.println(prv); //���� 
		//���� ��Ű���� �ƴ�
		//System.out.println(dft); //����
		//���� ��Ű���� �ƴ����� �ڼ��̹Ƿ� ����
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

public class MyParent2 {

	public static void main(String[] args) {
		MyChild p = new MyChild();
		//���� Ŭ������ �ƴ�
		//System.out.println(p.prv); //����
		//���� ��Ű���� �ƴ�
		//System.out.println(p.dft); //����
		//�ڼ� �ƴϹǷ� �Ұ���(extend Ŭ���� �� �ƴϹǷ�)
		//System.out.println(p.prt); //����
		System.out.println(p.pub); //OK
	}

}
