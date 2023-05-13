package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_4963 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		while(N != 0) {
			int arr[][] = new int[M][N];
			boolean visit[][] = new boolean[M][N];
			
			for(int i=0; i<M; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][j] == 1 && !visit[i][j]) {
						System.out.println("c"+count + ", dff" + i + ", " + j);
						dfs(arr, visit, i, j); 
						count++;
					}
				}
			}
			System.out.println(count);
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
		}
		
	}
	
	static void dfs(int[][] arr, boolean visit[][], int x, int y) {
		int dx[] = {0, 0, 1, -1, -1, 1, -1, 1};
		int dy[] = {1, -1, 0, 0, -1, 1, 1, -1};
		
		if(visit[x][y]) return;
		
//		System.out.println(arr.length + "," + arr[0].length +x +", "+y);
		visit[x][y] = true;
		for(int i=0; i<8; i++) {
			int x_x = x + dx[i];
			int y_y = y + dy[i];
//			System.out.println(x_x +",sdddd "+y_y);
			if(x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr[0].length) {
				if(arr[x_x][y_y] == 1 && !visit[x_x][y_y]) {
					System.out.println(x_x + ", " + y_y);
					dfs(arr, visit, x_x, y_y);
				}
			}
		}
		
	}
}
