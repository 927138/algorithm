package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_7576 {
	
	private static Queue<int []> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[M][N];
		boolean visit[][] = new boolean[M][N];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1 && !visit[i][j]) {
					q.offer(new int[] {i, j});
				}
			}
		}
		
		bfs(arr, visit);
		
	}
	
	static void bfs(int arr[][], boolean visit[][]) {
		
		int dx[] = {0, 0,- 1, 1};
		int dy[] = {1, -1, 0, 0};
		int x = 0;
		int y = 0;
		
		
		while(!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			q.poll();
			
			for(int i=0; i<4; i++) {
				int x_x = x + dx[i];
				int y_y = y + dy[i];
				
				if(x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr[0].length) {
					if(arr[x_x][y_y] == 0 && !visit[x_x][y_y]) {
						arr[x_x][y_y] = arr[x][y] + 1;
						q.offer(new int[] {x_x, y_y});
						visit[x_x][y_y] = true;
						
					}
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(arr[x][y] - 1);
	}
	
}
