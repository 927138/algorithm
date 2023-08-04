package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_28278 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			
			switch(x) {
			case 1: 
				int value = Integer.parseInt(st.nextToken());
				s.add(value);
				break;
			case 2:
				if(!s.isEmpty()) sb.append(s.pop() + "\n");
				else sb.append(-1 + "\n");
				break;
			case 3:
				sb.append(s.size()+ "\n");
				break;
			case 4:
				if(!s.isEmpty()) sb.append(0 + "\n");
				else sb.append(1 + "\n");
				break;
			case 5:
				if(!s.isEmpty()) sb.append(s.peek()+ "\n");
				else sb.append(-1+ "\n");
				break;
			
			}
		}
		System.out.println(sb);
	}

}
