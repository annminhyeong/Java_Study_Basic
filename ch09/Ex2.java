package ch09;

import java.util.Objects;

//hashCode()
//��ü�� �ؽ��ڵ带 ��ȯ�ϴ� �޼��� (��ü�� ����)
//Object Ŭ������ hashCode()�� ��ü�� �ּҸ� int�� ��ȯ�ؼ� ��ȯ
//
//equals()�� ����� true�� �� ��ü�� �ؽ��ڵ�� ���ƾ��ϱ⶧���� equals()�� �������̵��ϸ�, hashCode()�� �������̵��ؾ��Ѵ�.
//
//System.identityHashCode(Object obj)�� ObjectŬ������ hashCode()�� ����
//
//
//toString()
//��ü�� ���ڿ����� ��ȯ�ϴ� �޼���
//getClass(): ���赵 ��ü
//getName():Ŭ���� �̸�
//@ : at ��ġ
//
//��ü = iv �����̹Ƿ�
//��ü�� ���ڿ��� ��ȯ�Ѵٴ� ���� iv�� ���� ���ڿ��� ��ȯ�Ѵٴ� �Ͱ� ����.
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//Object toString() �޼��带 �������̵� 
	public String toString() {
		return "kind: " + kind + ", number: " + number;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		Card c = (Card)obj;
		return kind.equals(c.kind) && this.number == c.number; //kind�� c1��ü�̰� c.kind�� c2��ü��
	}
	
	//equals �������̵��ϸ� hashCode�� �������̵��ؾ���
	//int hash(Object... value)
	//Objects Ŭ������ ��ü ���õ� ������ �޼��带 �����ϴ� ��ƿ Ŭ����
	//�Ű������� ��������(Object..)�� ȣ��� �����ϴ� ���� ������ ���������� �ʴ�.
	public int hashCode() {
		return Objects.hash(kind, number);
		
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
