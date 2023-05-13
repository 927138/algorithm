package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr1[][] = new int[N][N];
		int arr2[][] = new int[N][N];
		boolean visit[][] = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				char ch = str.charAt(j);
				if(ch == 'R') {
					arr1[i][j] = 2;
					arr2[i][j] = 2;
				} else if(ch == 'B') {
					arr1[i][j] = 1;
					arr2[i][j] = 1;
				} else if(ch == 'G') {
					arr1[i][j] = 0;
					arr2[i][j] = 2;
				}
			}
		}
		
		int color = 0, non_color = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visit[i][j]) {
					dfs(arr1, visit, i, j);
					color++;
				}
			}
		}
		visit = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visit[i][j]) {
					dfs(arr2, visit, i, j);
					non_color++;
				}
			}
		}
		System.out.println(color + " " + non_color);
		
	}
	
	static void dfs(int arr[][], boolean visit[][], int x, int y) {
		int dx[] = {0, 0, -1, 1};
		int dy[] = {-1, 1, 0, 0};
//		System.out.println(x + ", " + y);
		
		if(visit[x][y]) return;
		
		visit[x][y] = true;
		for(int i=0; i<4; i++) {
			int x_x = x + dx[i];
			int y_y = y + dy[i];
			
			if(x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr.length) {
				if(arr[x][y] == arr[x_x][y_y] && !visit[x_x][y_y]) {
					dfs(arr, visit, x_x, y_y);
				}
			}
		}
	}
	
}
