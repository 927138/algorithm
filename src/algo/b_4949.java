package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		
		String str = "";
		while (true) {
			str = br.readLine();
			if(str.equals(".")) break;
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(ch == '(' || ch == '[') stack.push(ch);
				else if(ch == ')') {
					if(!stack.empty() && stack.peek() == '(') stack.pop();
					else stack.push(ch);
				}
				else if(ch == ']') {
					if(!stack.empty() && stack.peek() == '[') stack.pop();
					else stack.push(ch);
				}
				
			}
			
			if(stack.empty()) System.out.println("yes");
			else System.out.println("no");
 			stack.clear();
		}
		
	}

}
