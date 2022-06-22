package ch12;

import java.util.ArrayList;
import java.util.List;

//���׸��� ���
//Box<T> : ���׸�Ŭ����. T�� Box �Ǵ� T Box��� ����
//T :  Ÿ�Ժ��� �Ǵ� Ÿ�� �Ű�������� ���� (T�� Ÿ�Թ���)
//Box : ���� Ÿ��(raw type)
//
//���׸� Ŭ�������� �������� ����(Ÿ�Ժ����� ��ġ�Ͼ���)
//ex) ArrayList<Tv> list = new ArrayList<Tv>();
//
//���� �ڼհ����϶��� Ÿ�Ժ����� ��ġ�ؾ���
//ex) List<����> list = new ArrayList<�ڼ�>(); //����
//
//���׸� Ŭ�������� �������� ���� (Ÿ�Ժ����� ��ġ������)
//ex) List<Tv> list = new ArrayList<Tv>();
//
//�Ű������� �������� ����
//ex) ArrayList<����> list = new ArrayList<����>();
//list.add(new ����());
//list.add(new �ڼ�());


class Product2{}
class Tv2 extends Product2{}
class Audio2 extends Product2{}

public class Ex3 {
	public static void main(String[] args) {
		
		//���׸�Ŭ�������� �������� ����
		//List<Product2> plist2 = new ArrayList<Product2>();
		
		//Ÿ�Ժ����� �����ڼ� ����� ���������� �������� Ÿ���� ���ƾ���
		//ArrayList<Product2> pList = new ArrayList<Tv>();

		ArrayList<Product2> pList = new ArrayList<Product2>();
		ArrayList<Tv2> tList = new ArrayList<Tv2>();
		
		pList.add(new Product2()); //public boolean add(Product2 e){ }
		pList.add(new Tv2());
		pList.add(new Audio2());
		
		tList.add(new Tv2()); //public boolean add(Tv2 e){ }
		tList.add(new Tv2());
		
		printAll(pList);
		//printAll(tList); //������ �����߻�
	}
	
	//ArrayList�� Product2Ÿ���� ����Ʈ�� ���� �� ����
	public static void printAll(ArrayList<Product2> pList) {
		for(Product2 p : pList) {
			System.out.println(p);
		}
	}
}










