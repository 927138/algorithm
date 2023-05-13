package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			Stack<Integer> stack = new Stack<>();
			
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			
			int max = Integer.MIN_VALUE;
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				if(max < arr[i]) max = arr[i];
			}
			
			int index = 1;
			for(int i=0; i<N; i++) {
				while(true) {
					if(index-1 > N) {
						System.out.println("NO");
						return;
					}
					
					if(!stack.empty() && stack.peek() == arr[i]) {
						stack.pop();
						sb.append("-\n");
						break;
					}else {
						stack.push(index++);
						sb.append("+\n");
					}
					
				}
			}
			System.out.println(sb);
	}

}
