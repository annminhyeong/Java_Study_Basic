package ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; //Collections ��������
//Collections -�÷����� ���� �޼���(static)�� ����
//file() : �÷��� ä���
//copy() : �÷��� ����
//sort() : �÷��� ����
//binarySearch() : �˻�
//synchronizedXXX() : �÷����� ����ȭ
//unmodifiableXXX() : �÷��� ����Ұ�
//singletonXXX() : �̱��� �÷���(��ü 1���� ����)
//checkedXXX() : �������� ��ü�� �����ϴ� �÷���
public class Ex20 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5); //����߰�
		System.out.println(list);
		
		rotate(list, 2); //���������� 2���̵�
		System.out.println(list);
		
		swap(list,0,2); //ù��°�� 3��°��� ��ġ����
		System.out.println(list);
		
		shuffle(list); //����� ��Ҹ� ��������
		System.out.println(list);
		
		sort(list, reverseOrder()); //�������� ����, reverse(list);�� ����
		System.out.println(list);
		
		sort(list); //�������� ����
		System.out.println(list);
		
		int idx = binarySearch(list,3); //�����˻�
		System.out.println("index of 3 : "+ idx);
		
		System.out.println("max=" + max(list)); //�ִ밪
		System.out.println("min=" + min(list)); //�ּҰ�
		System.out.println("min=" + max(list, reverseOrder())); //�ּҰ�
		
		fill(list, 9); //list�� 9�� ä���
		System.out.println("list=" + list);
		
		//list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���, ������� �Ұ�
		List newList = nCopies(list.size(), 2);
		System.out.println("newList="+ newList);
		
		//�����Ұ� ������ true ������ false
		System.out.println(disjoint(list, newList)); 
		
		//list�� ��Ҹ� newList�� �����Ѵ�.
		copy(list, newList);
		System.out.println("list="+ list);
		System.out.println("newList="+ newList);
		
		//����Ʈ�� ��Ұ� 2�� ���� 1�� ����
		replaceAll(list, 2, 1);
		System.out.println("list="+ list);
		
		//Iterator�� �����
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2="+ list2);
	}
}








