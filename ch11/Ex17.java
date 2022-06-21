package ch11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//HashMap�� HashTable : ����X, �ߺ�(ŰX, ��O)
//Map �������̽��� ����. �����͸� Ű�� ���� ������ ����
//HashMap(����ȭ X)�� HashTable(����ȭ O)�� �Ź���
//Map �������̽��� ������ ��ǥ���� �÷��� Ŭ����
//������ �����ҷ��� LinkedHashMapŬ������ ����ϸ� �ȴ�.
//
//�ؽ�(hashing) : Ű�� �ؽ��Լ��� ������ �ؽ��ڵ�(�迭�� index)�� �ؽ����̺� �����͸� �˻�, ����
//�ؽ����̺� : �迭 +��ũ�帮��Ʈ
//
//�ؽ̰���
//1. Ű�� �ؽ��Լ��� ȣ���ؼ� �ؽ��ڵ�(�迭 index)�� ��´�
//3. �ؽ��ڵ�(�迭 index)�� �����ϴ� ��ũ�帮��Ʈ(Ű�� ����)�� �迭���� ã�´� 
//3.��ũ�帮��Ʈ(Ű�� ����)���� Ű�� ��ġ�ϴ� �����͸� ã�´�.
//-�ؽ��Լ��� ���� Ű�� ���� �׻� ���� �ؽ��ڵ带 ��ȯ�ؾ��Ѵ�.
//-���� �ٸ�Ű�� �������� �ؽ��ڵ带 ��ȯ�� �� �ִ�.
//
//LinkedHashMap : ������ �ִ� Ű�� ���� ������ �̷���� �÷��� Ŭ����
//TreeMap : ���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
//HashMap���� �������߰�,������ �ð��� �� �ɸ�
//�ؽ�(hashing) ������� �����͸� ����. �����Ͱ� ���Ƶ� �˻��� ������.
//
//HashMap - �ֿ� �޼���
//HashMap() : ������
//HashMap(int initalCapacity) : �÷��� ũ��
//HashMap(int initalCapacity, float loadFactor) : �÷��� ũ��, ����뷮
//HashMap(Map m) : �ش� Map(m)���� Map �÷��� ����
//Object put(Object key, Object value) : Map �߰�
//void putAll(Map m) : ������ Map(m)�� Map�� �߰�
//Object remove(Object key) : ������ Ű(key)�� Map���� ����
//Object replace(Object key, Object Value) : ������ Ű(key)�� ������ �ش簪(Value)�� ����
//boolean replace(Object key Object oldValue, Object newValue) : ������ Ű(key)�� �����ǰ�(oldValue)�� ���ο(newValue)�� ����
//Set entrySet() : Ű�� ���� ���� ����
//Set keySet() : Ű���� ����  
//Collection values() : ���� ����
//Object get(Object key) : �ش�Ű�� �����ϴ� ���� ������
//Object getOrDefault(Object key, Object defaultValue) : Ű�� ������ ������ ��(defaultValue)�� ��ȯ��
//boolean containsKey(Object key) : �ش�Ű�� Map�� �ִ��� Ȯ��
//boolean containsValue(Object value) : �ش� ��(value) Map�� �ִ��� Ȯ��
//int size() : Map�� ũ��
//boolean isEmpty() : ����մ��� �ƴ��� Ȯ��
//void clear() : Map�� ����� ����
//Object clone() : Map ����


public class Ex17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); //Ű���� ������ ���� �����
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("id�� pw�� �Է��ϼ���.");
			System.out.print("���̵�: ");
			String id = s.nextLine().trim();
			
			System.out.print("��й�ȣ: ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("���̵� �������� ����");
				continue;
			}
			
			if(!(map.get(id)).equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ���� ����");
				continue;
			}else {
				System.out.println("ȸ������ ����");
				break;
			}
		}
	}
}













