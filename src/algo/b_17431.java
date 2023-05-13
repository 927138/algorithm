package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_17431 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<>();
		
		String str = br.readLine();
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '<') flag = true;
			else if(str.charAt(i) == '>') {
				flag = false;
				sb.append(str.charAt(i));
				continue;
			}

			if(!flag) {
				if(str.charAt(i) == ' ') {
					stack_print(s, sb);
					sb.append(str.charAt(i));
				}else s.push(str.charAt(i));
				
				if(i == str.length()-1 && !s.empty()) stack_print(s, sb);
			}
			else {
				if(!s.empty()) stack_print(s, sb);
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}
	
	static void stack_print(Stack s, StringBuilder sb) {
		while(!s.empty()) {
			sb.append(s.peek());
			s.pop();
		}
	}

}
