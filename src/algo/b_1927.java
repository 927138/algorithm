package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b_1927 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
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
	}

}
