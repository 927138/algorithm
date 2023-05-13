package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_24444 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][N+1];
		boolean visit[] = new boolean[N+1];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			arr[u][v] = 1;
		}
		
		
		
	}
	static void bfs(int arr[][], boolean visit[], int u, int v) {
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {u, v});
		
		while(!q.isEmpty()) {
			int x = q.poll()[0];
			int y = q.poll()[1];
		}
	}

}
