package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_17298 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int result[] = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int idx = N-1;
		while(true) {
			if(idx < 0) break;
			
			while(!stack.isEmpty() && stack.peek() <= arr[idx]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				result[idx] = -1;
			}else {
				result[idx] = stack.peek();
			}
			stack.push(arr[idx--]);
//			System.out.println(stack);
		}
		for(int i=0; i<N; i++) {
			sb.append(result[i] +" ");
		}System.out.println(sb);
	}	

}
