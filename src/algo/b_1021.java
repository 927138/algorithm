package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			q.offer(i+1);
		}
		
	
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken());
			int index_num = 0;
			int cnt = 0;
			while(num != index_num) {
				index_num = q.peek();
				
				if(num != index_num) {
					cnt++;
					q.offer(index_num);
				}else count += Math.min(cnt, q.size()-cnt); 
				q.poll();
			}			
		}
		System.out.println(count);
	}

}
