package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_5567 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list[] = new ArrayList[N+1];
		int visit[] = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		System.out.println(bfs(list, visit));
	}
	
	static int bfs(ArrayList<Integer> list[], int visit[]) {
//		int arr[] = new int[2];
//		Deque<int[]> dq = new LinkedList<>();
		Deque<Integer> dq = new LinkedList<>();
		visit[1] = 1;
//		dq.offer(new int[] {1, 0});
		dq.offer(1);
		
		int count = 0;
		while(!dq.isEmpty()) {
			int x = dq.poll();
			if(visit[x] > 3) continue;
			
			count++;
			for(int i : list[x]) {
				if(visit[i] > 0) continue;
				
				dq.offer(i);
				visit[i] = visit[x] + 1;
			}
//			System.out.println(x);
		}
		
		return count-1;
	}
}
