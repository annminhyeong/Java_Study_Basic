package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

//Iterator, ListIterator, Enumeration
//�÷��ǿ� ����� �����͸� �о�ö� ����ϴ� �������̽�
//
//Iterator �������̽�
//boolean hasNext() : �о�� ��Ұ� �����ִ��� Ȯ���Ѵ�.
//������ true, ������ false�� ��ȯ�Ѵ�.
//
//Object next() : ���� ��Ҹ� �о� �´�. next()�� ȣ���ϱ� ���� hasNext()�� ȣ���ؼ� �о� �� ��Ұ� �ִ��� Ȯ���ϴ� ���� �����Ѵ�.
//
//void remove() : next()�� �о� �� ��Ҹ� �����Ѵ�. next()�� ȣ���� ������ remove()�� ȣ���ؾ��Ѵ�. (������ ���)
//
//void forEachRemaining(Consumer<? super E> action) : �÷��ǿ� �����ִ� ��ҵ鿡 ���� ������ �۾�(action)�� �����Ѵ�. ���ٽ��� ����ϴ� ����Ʈ �޼��� (JDK 1.8���� �߰�)
//
//Enumeration �������̽�
//boolean hasMoreElements() : �о�� ��Ұ� �����ִ��� Ȯ���Ѵ�. ������ true, ������ false�� ��ȯ�Ѵ�.
//
//Object nextElement() : ���� ��Ҹ� �о� �´�. nextElement()�� ȣ���ϱ� ���� hasMoreElements()�� ȣ���ؼ� �о� �� ��Ұ� �ִ��� Ȯ���ϴ� ���� �����Ѵ�.
//
//ListIterator �������̽� : List�������̽��� ������ Ŭ���������� ��밡�� previous() �޼��尡 ������


//Map�� Iterator
//Collection�� �ڼ�(List, set)�� Map�� �����Ƿ� Map���� iterator()�� ����.
//Map���� Iterator�� ����ҷ��� keySet(), entrySet(), values()�� ȣ���ؾ��Ѵ�.
//
//ex) Set eset = map.entrySet();
//Iterator it = eSet.iterator();
//Iterator it = map.entrySet().iterator();

public class Ex7 {
	public static void main(String[] args) {
		//�÷��� �����ӿ�ũ�� ��ü�� ���尡��
		//Collection�� �θ��̹Ƿ� �ڼ��� ���� �޼���(�θ� ������)�� ������ �����Ƿ�
		//Collection�� ���� ���� Ŭ������ �����Ӱ� �ٲܼ� ����
		Collection c = new HashSet();
		//Collection c = new TreeSet();
		c.add("1"); //list.add(new String("1")�� ���� 
		c.add("2"); //"2"�� ��ü�� �����Ϸ��� �ڵ����� ��ȯ����
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator(); //1ȸ��
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//�̹� hasNext�� Ŀ���� �������̹Ƿ� false�� ����
		//�ٽ� ����Ʈ�� ��Ҹ� �������� Iterator�� �ٽ� �����ؾ���
		//it = list.iterator(); //���ο� Iterator ��ü�� ��´�.
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//Iterator��� for������ �ٲٱ�
		//���� �ٸ��÷������� �ٲٸ� ���Ұ�
		//for(int i=0; i<list.size(); i++) {
		//	System.out.println(list.get(i)); 
		//}
	}
}
