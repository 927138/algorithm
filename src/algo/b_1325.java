package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1325 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[y].add(x);
		}
		
		int[] arr = new int[N+1];
		for(int i=1; i<N+1; i++) {
			arr[i] = bfs(list, i);
			arr[0] = Math.max(arr[0], arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<N+1; i++) {
			if(arr[0] == arr[i]) sb.append(i + " ");
		}System.out.println(sb);
	}
	
	static int bfs(List<Integer>[] list, int i) {
		boolean visit[] = new boolean[list.length];
		Queue<Integer> dq = new LinkedList<>();
		
		int cnt = 0;
		dq.offer(i);
		visit[i] = true;
		
		while(!dq.isEmpty()) {
			int idx = dq.poll();
			cnt++;
			
			for(int value : list[idx]) {
				if(!visit[value]) {
					dq.offer(value);
					visit[value] = true;
				}
			}
		}
		
		return cnt;
	}

}
