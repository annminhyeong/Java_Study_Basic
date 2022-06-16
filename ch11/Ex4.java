package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//스택과 큐
//스택(LIFO) : 밑이 막힌 상자, 마지막에 저장된 것을 제일 먼저 꺼내게 된다. push(저장) pop(추출)
//스택을 만들때는 주로 배열이 쓰임

//큐(FIFO) : 줄서기, 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다. offer(저장), poll(추출)
//큐를 만들때는 주로 LinkedList를 사용

//스택관련 메서드 (Stack 클래스)
//boolean empty() : Stack이 비어있는지 알려준다

//Object peek() : Stack의 맨 위에 저장된 객체를 반환. pop()과 달리 Stack에서 객체를 꺼내지 않음(비어있을때 EmptyStackException발생)

//Object pop() : Stack의 맨 위에 저장된 객체를 꺼낸다 (비어있을때는 EmptyStackException발생)

//Object push(Object item) : Stack에 저장된 객체(item)을 저장한다.

//int search(Object o) : Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환, 못찾으면 -1을 반환 (배열과 달리 위치는 0이아닌 1부터 시작)

//큐관련 메서드 (Queue 인터페이스)(LinkedList가 큐의 추상메서드를 구현함)
//boolean add(Object o) : 지정된 객체를 Queue에 추가한다. 성공하면 true를 반환. 저장공간이 부족하면 lllegalStateException발생

//Object remove() : Queue에서 객체를 꺼내서 반환, 비어있으면 NoSuchElementException 발생

//Object element() : 삭제없이 요소를 읽어온다. peek와 달리 Queue가 비었을 때 NoSuchElementException발생

//boolean offer(Object o) : Queue에 객체를 저장, 성공하면 true, 실패하면 false를 반환

//Object poll() : Queue에서 객체를 꺼내서 반환 비어있으면 null을 반환

//Object peek() : 삭제없이 요소를 읽어온다. Queue가 비어있으면 null반환

public class Ex4 {
	public static void main(String[] args) {
		Stack st = new Stack();
		//Queue인터페이스의 추상메서드를 LinkedList가 구현했으므로 Queue의 메서드를 이용하고 싶으면 LikedList를 사용해야함
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
