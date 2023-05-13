package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b_1715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> p_q = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			p_q.offer(Integer.parseInt(br.readLine()));
		}
		
//		for(int i=0; i<N; i++) {
//			System.out.println(p_q.poll());
//		}
		
		int sum = 0;
		while(p_q.size() > 1) {
			int hap = p_q.poll() + p_q.poll();
			sum += hap;
			p_q.offer(hap);
		}
		System.out.println(sum);
	}	

}
