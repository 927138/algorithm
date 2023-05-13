package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			q.offer(i+1);
		}
		
		sb.append("<");
		while(q.size() != 1) {
			for(int i=0; i<M-1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+", ");
		}
		sb.append(q.poll()+">");
		
		System.out.println(sb);
	}

}
