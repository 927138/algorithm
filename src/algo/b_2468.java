package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2468 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N][N];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] < min) min = arr[i][j];
				if(arr[i][j] > max) max = arr[i][j];
			}
		}
		
		int area = Integer.MIN_VALUE;
		for(int i=min; i<max; i++) {
			boolean visit[][] = new boolean[N][N];
			int count = 0;
			
			for(int j=0; j<N; j++) {
				for(int z=0; z<N; z++) {
					if(!visit[j][z] && arr[j][z] >= i) {
						bfs(arr, visit, j, z, i);
						count++;
					}
				}
			}
			
			if(area < count) area = count;
		}
		
		System.out.println(area);
	}
	
	static void bfs(int arr[][], boolean visit[][], int x, int y, int len) {
		int dx[] = {0, 0, 1, -1};
		int dy[] = {1, -1, 0, 0};
		
		Queue<int[]> q = new LinkedList<>();
		
		visit[x][y] = true;
		q.offer(new int[] {x, y});
		
		while(!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			q.poll();
			
			for(int i=0; i<4; i++) {
				int x_x = x + dx[i];
				int y_y = y + dy[i];

				if(x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr[0].length) {
					if(len <= arr[x_x][y_y] && !visit[x_x][y_y]) {
						q.offer(new int[] {x_x, y_y});
						visit[x_x][y_y] = true;
					}
				}
			}
		}
	}
}
