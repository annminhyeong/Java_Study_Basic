package ch11;

import java.util.Stack;

public class Ex5 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage:java Ex5 \"EXPRESSION\"");
			System.out.println("Example:java Ex5 \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		System.out.println("expression: " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				//���°�ȣ�� ���ÿ� �������
				if(ch == '(')
					st.push(ch + "");
				//�ݴ°�ȣ�� ���°�ȣ�� ���ÿ��� ����
				else if (ch == ')')
					st.pop();
			}
			if(st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		}catch (Exception e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
	}
}
