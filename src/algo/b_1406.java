package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		int L = str.length()+1;
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<L-1; i++) {
			stack1.push(str.charAt(i));
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char ch = st.nextToken().charAt(0);
			
			switch (ch) {
			case 'L' :
				if(!stack1.empty()) {
					stack2.push(stack1.peek());
					stack1.pop();
					System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL;");
					print(stack1); print(stack2);
				}
				break;
			case 'D':
				if(!stack2.empty()) {
					stack1.push(stack2.peek());
					stack2.pop();
				}
				break;
			case 'B':
				if(stack1.size() > 0) stack1.pop();
				break;
			case 'P':
				char ch2 = st.nextToken().charAt(0);
				stack1.push(ch2);
				System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
				print(stack1); print(stack2);
				break;
			default:
				break;
			}
		}
		
		while(!stack2.empty()) {
			stack1.push(stack2.peek());
			stack2.pop();
		}
		
		StringBuilder sb = new StringBuilder();
		System.out.println(stack1.size());
		while(!stack1.empty()) {
			sb.append(stack1.peek());
			stack1.pop();
			System.out.println(sb);
		}
		System.out.println(sb.reverse());
	}
	
	static void print(Stack s) {
		if(!s.empty()) {		
			System.out.print(s.peek() + ", ");
			System.out.print(s.size());
			System.out.println();
		}
	}

}	
