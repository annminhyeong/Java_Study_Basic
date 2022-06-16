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
				
				//여는괄호면 스택에 집어넣음
				if(ch == '(')
					st.push(ch + "");
				//닫는괄호면 여는괄호를 스택에서 꺼냄
				else if (ch == ')')
					st.pop();
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		}catch (Exception e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
	}
}
