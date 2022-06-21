package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TreeSet : ����Ž��Ʈ��(binary search tree)�� ����. ���� �ƻ��� ���Ŀ� ����
//���� Ʈ���� ��� ��尡 �ִ� 2���� �ڽ� ��带 ����
//�� ���(node)�� ����(tree)���·� ���� (LinkedList ����)
//
//���� Ž�� Ʈ��(binary search tree)
//�θ𺸴� ���� ���� ���� ū���� �����ʿ� ����
//�����Ͱ� ������ ���� �߰�, ������ �ɸ��� �ð��� ����(��Ƚ�� ����)
//
//������ ���� boolean add(Object o)
//
//TreeSet - �ֿ� �����ڿ� �޼���
//TreeSet() : �⺻ ������
//TreeSet(Collection c) : �־��� �÷����� �����ϴ� TreeSet�� ����
//TreeSet(Comparator comp) : �־��� ���ı������� �����ϴ� TreeSet�� ����
//Object first() : ���ĵ� �������� ù��° ��ü�� ��ȯ�Ѵ�. (���� ������)
//Object last() : ���ĵ� �������� ������ ��ü�� ��ȯ�Ѵ�. (���� ū��)
//Object ceiling(Object o) : ������ ��ü�� ���� ��ü�� ��ȯ ������ ū���� ���� ��ü �߿��� ���� ����� ���� ��ȯ ������ null
//Object floor(Object o) : ������ ��ü�� ���� ��ü�� ��ȯ. ������ ���� ���� ���� ��ü �߿��� ���� ����� ���� ��ȯ ������ null
//Object highter(Object o) : ������ ��ü���� ū ���� ���� ��ü �߿��� ���� ����� ���� ��ü�� ��ȯ ������ null
//Object lower(Object o) : ������ ��ü���� ���� ���� ���� ��ü �߿��� ���� ����� ���� ��ü�� ��ȯ ������ null
//SortedSet subSet(Object fromElement, Object toElement) : �����˻�(fromElement�� toElement ����)�� ����� ��ȯ�Ѵ�. (toElement�� �������� ����)
//SortedSet headSet(Object toElement) : ������ ��ü���� ���� ���� ��ü���� ��ȯ�Ѵ�.
//SortedSet tailSet(Object fromElement) : ������ ��ü����ū ���� ��ü���� ��ȯ�Ѵ�.

public class Ex14 {
	public static void main(String[] args) {
		//Set set = new HashSet(); //������, ���ľȵ�
		//Set set = new TreeSet(); //�����˻�, ���ĵ�
		Set set = new TreeSet(new TestComp()); //�־��� ���ı��ط� �����ϴ� TreeSet ����
		
//		for(int i=0; set.size()<6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//   		//Integer Ŭ�������� ���ı����� �����Ƿ� ���� ���ı����� ���������൵ ��
//			set.add(num); //set.add(new Integer(num); 
//		}
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		
		System.out.println(set);
	}
}

//�񱳱����� ����, Comparator �������̽� �߰��ؾ���
//Comparator �������̽��� �����ϸ� �����ڿ� �񱳱��� ���� �ʿ� ����
class Test{}

class TestComp implements Comparator{

	public int compare(Object o1, Object o2) {
		return -1; //0�̸� ������ü�� �Ǻ�
	}
}





