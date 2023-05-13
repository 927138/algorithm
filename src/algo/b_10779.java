package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_10779 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}else if(ch == ')') {
				System.out.print(stack.size() + " ");
				stack.pop();
				System.out.println(stack.size() + " ");
				
				if(str.charAt(i-1) == '(') sum += stack.size();
				else sum += 1;
			}
		}
		System.out.println(sum);
	}

}
