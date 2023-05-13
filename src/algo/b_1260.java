package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1260 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		boolean arr[][] = new boolean[N+1][N+1];
		boolean visit[] = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = true;
			arr[y][x] = true;
		}
		
		dfs(V, arr, visit, sb);
		sb.append("\n"); visit = new boolean[N+1];
		
		bfs(V, arr, visit, sb);
		System.out.println(sb);
		
	}
	
	// 재귀로 구현
	static void dfs(int V, boolean arr[][], boolean visit[], StringBuilder sb) {
		if(!visit[V]) {
			visit[V] = true;
			sb.append(V + " ");
			for(int i=1; i<visit.length; i++) {				
				if(arr[V][i] && !visit[i]) {
					dfs(i, arr, visit, sb);
				}
			}
		}else return;
	}

	// Quque사용
	static void bfs(int V, boolean arr[][], boolean visit[], StringBuilder sb) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(V);
		visit[V] = true;
		while(!q.isEmpty()) {
			int v = q.poll();
			sb.append(v + " ");
			for(int i=1;i<visit.length; i++) {
				if(arr[v][i] && !visit[i]) {
					visit[i] = true;
					q.offer(i);
				}
			}
		}
	}
}
