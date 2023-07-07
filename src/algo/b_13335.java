package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_13335 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> b = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			q.offer(a);
		}
		
		for(int i=0; i<W; i++) {
			b.offer(0);
		}
		
		int count = 0;
		int weight = 0;
		
			
		while(!b.isEmpty()) {
			count++;
			weight -= b.poll();
			
			if(!q.isEmpty()) {
				if(weight + q.peek() <= L) {
					weight += q.peek();
					b.offer(q.poll());
				}
				else {
					b.offer(0);	
				}
				
			}
		}
		
		System.out.println(count);
	}

}
