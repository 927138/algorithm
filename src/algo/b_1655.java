package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class b_1655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(pq1.size() == pq2.size()) {
				pq2.offer(a);
				
				if(!pq1.isEmpty() && pq1.peek() < pq2.peek()) {
					pq1.offer(pq2.poll());
					pq2.offer(pq1.poll());
				}
			}else {
				pq1.offer(a);
				
				if(pq1.peek() < pq2.peek()) {
					pq1.offer(pq2.poll());
					pq2.offer(pq1.poll());
				}
			}
			sb.append(pq2.peek() + "\n");

		}System.out.println(sb);
	}

}
