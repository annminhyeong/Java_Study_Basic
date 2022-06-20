package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet(������) - ����x, �ߺ� x
//set �������̽��� ������ ��ǥ���� �÷��� Ŭ����
//������ �����Ϸ��� LinkedHashSet Ŭ������ ����ϸ� �ȴ�
//
//HashSet �ֿ� �޼���
//HashSet() : �⺻������
//HashSet(Collection c) : ������ �÷����� �����ϴ� ������
//HashSet(int initalCapacity) : ������ ũ�� ����
//HashSet(int initalCapacity, float loadFactor) : ������ ũ��(initalCapacity)�� ����, �󸶳� á����(loadFactor) ����
//boolean add(Object o) : ��ü �߰�
//boolean addAll(Collection c) : ���� Ŀ���� �߰�  (������)
//boolean remove(Object o) : ��ü ���� 
//boolean removeAll(Collection c) : �ش� �÷����� �����ϴ� ��ü ���� (������)
//boolean retainAll(Collection c) : �ش� �÷��Ǹ� �ִ� ���� ����� ���� ���� (������)
//void clear() : ��ü ���� ����
//boolean contains(Object o) : �ش� ��ü�� ���ԵǸ� true ������ false
//boolean containAll(Collection c) : �ش� �÷����� ���ԵǸ� true, ������ false
//Iterator iterator() : �÷����� ��Ҹ� �о��
//isEmpty() : �÷����� ����ִ��� Ȯ��
//int size() : ����� ��ü�� ���� ��ȯ
//Object[] toArray() : set�� ����� ��ü�� ��ü�迭�� ��ȯ
//Object[] toArray(Object[] a) : set�� ����� ��ü�� ��ü�迭�� ��ȯ
//
//TreeSet
//���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
//HashSet���� ������ �߰�, ������ �ð��� �� �ɸ�


public class Ex10 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
