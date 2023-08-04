package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_14716 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][M];
		boolean visit[][] = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j] > 0 && !visit[i][j]) {
					visit[i][j] = true;
//					System.out.println(i + "-------------- " + j);
					dfs(arr, visit, i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static void dfs(int arr[][], boolean visit[][], int x, int y) {
		
		int dx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
		int dy[] = {-1, 0, 1, 1, 1, 0, -1, -1};
//		System.out.println(x + ", " + y);
		for(int i=0; i<8; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if(xx >= 0 && xx < arr.length && yy >= 0 && yy < arr[0].length) {
				if(!visit[xx][yy] && arr[xx][yy] > 0) {
					visit[xx][yy] = true;
					dfs(arr, visit, xx, yy);
				}
			}
		}
	
		
	}
}
