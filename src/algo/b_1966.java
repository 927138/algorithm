package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1966 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int C = Integer.parseInt(br.readLine());

		
		for (int i = 0; i < C; i++) {
			Queue<Integer> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int count = 0;
			int arr[] = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				int x = Integer.parseInt(st.nextToken());
				arr[j] = x;
				q.offer(j+1);
			}
			
			while(q.size() != 0) {
				int m = q.poll();
				int max = Integer.MIN_VALUE;
				
				// ���� ����ġ ã��
				for(int j=0; j<N; j++) {
					if(max < arr[j]) {
						max = arr[j];
					} 
				}
				
				// queue value�� ����ġ�� max����ġ���� �۴ٸ� queue.offer();
				if(arr[m-1] < max) q.offer(m);
				// queue value�� ����ġ�� ���� �����Ƿ� arr[m-1]�� ���� 0���� ����. count++;
				else {
					count++;
					arr[m-1] = 0;
					if(m-1 == M) break;
				}
				
			}
			System.out.println(count);
		}
		
		
	}

}
