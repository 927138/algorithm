package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_16208 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Long> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			stack.push(Long.parseLong(st.nextToken()));
		}
		
		long sum = 0;
		
		while(stack.size()>1) {
			long x = stack.pop();
			long y = stack.pop();
			
			stack.push(x+y);
			sum += x*y;
		}
		
		
		System.out.println(sum);
	}
		
}
