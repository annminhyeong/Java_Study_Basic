package ch12;

import java.util.ArrayList;

//Ÿ�� ����
//���׸� Ŭ������ �ۼ��Ҷ�, ObjectŸ�� ��� Ÿ�Ժ���(E)�� �����ؼ� ���
//
//Ÿ�� ������ �����ϱ�
//ex) ArrayList<Integer> i = new ArrayList<Integer>();
//���������� �������� Ÿ���� ��ġ�ؾ���

class Tv{}
class Audio{}
public class Ex2 {
	public static void main(String[] args) {
		
		//ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList list1 = new ArrayList();
		list1.add(new Tv());
		list1.add(new Audio());
		
		//Ÿ���� ������� ������ ����ȯ�ؾ���
		Tv t1 = (Tv) list1.get(0);
		//ArrayList�� Ÿ���� Object�̹Ƿ� ����Ÿ������ ������ ����
		Audio o1 = (Audio) list1.get(1);
		
		
		
		ArrayList<Tv> list2 = new ArrayList<Tv>(); //TvŸ���� ��ü�� ���尡��
		list2.add(new Tv());
		
		//TvŸ�� �ƴϹǷ� �����߻�
		//list2.add(new Audio()); 
		
		//Ÿ���� ��������Ƿ� ��������ȯ���� �ʾƵ� ��
		Tv t2 = list2.get(0);
	}
}
