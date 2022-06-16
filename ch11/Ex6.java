package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex6 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while (true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�. ");
					System.out.println(" q or Q - ���α׷��� �����մϴ�. ");
					System.out.println(" history - �ֱ��Է��� ��ɾ" + MAX_SIZE + "�� �����ݴϴ�.");
				}else if (input.equalsIgnoreCase("history")) {
					save(input);
					LinkedList list = (LinkedList)q;
					//�ݸ��� ���� size�� ������ �����Ƿ� final�� ����
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				}else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}

	public static void save(String input) {
		if (!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size() >MAX_SIZE) {
			q.remove();
		}
	}

}
