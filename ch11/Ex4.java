package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//���ð� ť
//����(LIFO) : ���� ���� ����, �������� ����� ���� ���� ���� ������ �ȴ�. push(����) pop(����)
//������ ���鶧�� �ַ� �迭�� ����

//ť(FIFO) : �ټ���, ���� ���� ������ ���� ���� ���� ������ �ȴ�. offer(����), poll(����)
//ť�� ���鶧�� �ַ� LinkedList�� ���

//���ð��� �޼��� (Stack Ŭ����)
//boolean empty() : Stack�� ����ִ��� �˷��ش�

//Object peek() : Stack�� �� ���� ����� ��ü�� ��ȯ. pop()�� �޸� Stack���� ��ü�� ������ ����(��������� EmptyStackException�߻�)

//Object pop() : Stack�� �� ���� ����� ��ü�� ������ (����������� EmptyStackException�߻�)

//Object push(Object item) : Stack�� ����� ��ü(item)�� �����Ѵ�.

//int search(Object o) : Stack���� �־��� ��ü(o)�� ã�Ƽ� �� ��ġ�� ��ȯ, ��ã���� -1�� ��ȯ (�迭�� �޸� ��ġ�� 0�̾ƴ� 1���� ����)

//ť���� �޼��� (Queue �������̽�)(LinkedList�� ť�� �߻�޼��带 ������)
//boolean add(Object o) : ������ ��ü�� Queue�� �߰��Ѵ�. �����ϸ� true�� ��ȯ. ��������� �����ϸ� lllegalStateException�߻�

//Object remove() : Queue���� ��ü�� ������ ��ȯ, ��������� NoSuchElementException �߻�

//Object element() : �������� ��Ҹ� �о�´�. peek�� �޸� Queue�� ����� �� NoSuchElementException�߻�

//boolean offer(Object o) : Queue�� ��ü�� ����, �����ϸ� true, �����ϸ� false�� ��ȯ

//Object poll() : Queue���� ��ü�� ������ ��ȯ ��������� null�� ��ȯ

//Object peek() : �������� ��Ҹ� �о�´�. Queue�� ��������� null��ȯ

public class Ex4 {
	public static void main(String[] args) {
		Stack st = new Stack();
		//Queue�������̽��� �߻�޼��带 LinkedList�� ���������Ƿ� Queue�� �޼��带 �̿��ϰ� ������ LikedList�� ����ؾ���
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("== Stack ==");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("== Queue ==");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
