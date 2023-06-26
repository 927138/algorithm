package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_2493 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<int []> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
//		int index = 0;
		
		st = new StringTokenizer(br.readLine());
		int before = 0;
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(st.nextToken());

			if(stack.size() == 0) {
				sb.append(0 + " ");
				
			}else{
				if(before > value) {
					sb.append(i + " ");
				}else {
					if(max <= value) {max = value; sb.append(0 + " ");}
					else {
						int arr[] = new int[2];
						while(!stack.isEmpty() && value >= stack.peek()[0]) {
							stack.pop();
						}
						
//						System.out.println(stack.peek()[0] + ", " + stack.peek()[1]);
						sb.append(stack.peek()[1] + " ");
					}
		
				}
				
			}
//			System.out.println(stack.peek()[1]);
			before = value;
			stack.push(new int[] {value, i+1});
			if(value > max) {
				max = value;
			}
		}
		System.out.println(sb);
	}
//	0 1 0 3 0 5 5 7 5 0
}
