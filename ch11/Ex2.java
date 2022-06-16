package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//ArrayList
//List�������̽��� �ڼ��̹Ƿ� ��������� �����ǰ� �ߺ��� ����Ѵ�.
//ArrayList�� ������ Vector�� ������ ������ ���������� ��������� ����
//ArrayList�� �޸� Vector�� ��ü������ ����ȭó���� �Ǿ��ִ�.
//�������� ����������� �迭�� ����Ѵ�(�迭���)


//ArrayList�� ������
//ArrayList() :�⺻������
//ArrayList(Collection c) : �÷��Ǳ ��ȯ�Ҷ� ���
//ArrayList(int initalCapacity) :�迭�� ���� ����


//ArrayList �޼���

//�߰�
//boolean add(Object o) : ��ü �߰�
//void add(int index, Object element) : ������ġ ����
//boolean addAll(Collection c) : �÷����� ������ �ִ� ��� �߰�
//boolean addAll(int index, Collection c) : �÷����� ������ �ִ� ����� ������ġ ����



//����
//boolean remove(Object o) : Ư�� ��ü�� ������ �ִ� index ����
//Object remove(int index) : Ư�� ��ġ�� ��ü ����
//boolean removeAll(Collection c) : �÷��ǿ� �ִ� ��ü���� ����
//void claer() : ���λ���


//�˻�
//int indexOf(Object o) : �տ������� Ư����ü(o)�� ������ �ִ� �ε����� ã�� ��ã���� -1��ȯ
//int lastIndexOf(Object o) : �ڿ������� Ư����ü(o)�� ������ �ִ� �ε��� ã�� ��ã����  -1��ȯ
//boolean contains(Object o) : Ư����ü(o)�� ������ �ִ��� Ȯ��
//Object get(int index) : Ư�����ؽ�(index)�� �������ִ� ��ü ��ȯ
//Object set(int index, Object element) : Ư���ε���(index)�� ���� element�� ����



//List subList(int fromIndex, int toIndex)
//Object[] toArray() : from ���� to�� �����ؼ� ����Ʈ�� ����
//Object[] toArray(Object[] a) : ArrayList�� ��ü�迭 ��ȯ
//boolean isEmpty() : ArrayList�� ����ִ��� Ȯ��
//void trimToSize() : ArrayList�� ����� ����
//int size() : ArrayList�� ��ü���� ��ȯ



//ArrayList ����� ��ü�� ��������
//1. ������ index ���� index�� ��ĭ�� ������ �����ؼ� ������ index�� �����.
//2. �����Ͱ� ��� �� ĭ�� �̵������Ƿ� ������ �����ʹ� null�� �����Ѵ�.
//3.�����Ͱ� �����Ǿ� ������ ������ �پ����Ƿ� size�� ���� �����Ѵ�.
//#�����������ʹ� �迭��������� �ʿ����. -> �������� �迭�� �߰��ϴ°� cpu�� �δ��� �ٿ���

//ArrayList�� ���ﶧ�� ���������� ����°��� ���� (�߰��� ��������)
//->�迭�� ��������� ���⶧����

public class Ex2 {
	public static void main(String[] args) {
		
		//���� 10�� ArrayList ���� 
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList�� ��ü�� ���尡��
		//�⺻�� ���尡�� -> �⺻���� ������ �����Ϸ��� �ڵ�������(��ü)���� ��ȯ����
		//list1.add(5);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//subList(from, to) : from���� to���� ����Ʈ�� �̾Ƽ� �����Ѵ�. to�� ���Ծȵ�
		//subList�� �б⸸ ����, ������ �����ҷ��� ���ο� ArrayList ��ü�� �����ؾ���
		//ArrayList(Collection c) : �÷��Ǳ ��ȯ�Ҷ� ���
		//List sub = list1.subList(1, 4);
		//ArrayList list2 = new ArrayList(sub);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		
		//Collections ��ƿŬ������ �̿��Ͽ� �迭�� ������������ ����
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//list1�� list2�� ����Ҹ� �����ϴ��� üũ
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B"); //�ڿ� �߰�
		list2.add("C"); //�ڿ� �߰�
		list2.add(3, "A"); //�߰��� �߰�
		print(list1, list2);
	
		list2.set(3, "AA"); //�� �ٲٱ�
		print(list1, list2);
		
		list1.add(0,"1");
		
		//���ڿ� "1"�� ����ִ��� index ��ȯ
		System.out.println("index=" + list1.indexOf("1"));
		System.out.println("list1:" + list1);
		
		//0�� index ����
		//�տ��� string�̹Ƿ� ��������
		//remove(Object o)
		list1.remove(new Integer(1));//���� int 1�� ��ü�� ����
		//remove(int index)
		//list1.remove(1); //�ε����� 1�ΰ�ü�� ����
		System.out.println("list1:" + list1);
		
		//list1���� list2�� ��ġ�� �κи� �����ϰ� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);
		
		//list2���� list1�� ���Ե� ��ü�� �����Ѵ�.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
