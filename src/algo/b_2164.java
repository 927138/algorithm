package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b_2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		
		// 1~N까지 Queue에 저장
		for(int i=1; i<N+1; i++) {
			q.offer(i);
		}
		
		while(true) {
			// Queue에 남이있는 값이 한갠라면 출력.
			if(q.size() <= 1) {
				System.out.println(q.peek());
				break;
			}
			
			// 두개의 값을 버림과 동시에 두번째 버린값은 queue에서 추가.
			q.poll();
			int q_num = q.poll();
			q.offer(q_num);
		}
		
		
		
	}

}
