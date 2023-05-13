package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class b_11279 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(heap.isEmpty()) sb.append(x + "\n");
				else{					
					sb.append(heap.peek() + "\n");
					heap.poll();
				}
			}else heap.offer(x);	
			
		}
		System.out.println(sb);
	}
	

}
