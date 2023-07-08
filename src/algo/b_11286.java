package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class b_11286 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if(Math.abs(a) == Math.abs(b)) return a - b;
				return Math.abs(a) - Math.abs(b);
			}
		});
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				if(pq.isEmpty()) sb.append(0 + "\n");
				else sb.append(pq.poll() + "\n");
			}else {
				pq.offer(a);
			}
		}
		System.out.println(sb);
	}
	
	

}
