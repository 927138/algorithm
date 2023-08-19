package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1987 {

	private static int max = 0;
	private static int dx[] = {0, 0, -1, 1};
	private static int dy[] = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[R][C];
		boolean visit[] =new boolean[27];
		
//		System.out.println((int)'A'-64);
		
		for(int i=0; i<R; i++) {
			String str = br.readLine();
			for(int j=0; j<C; j++) {
				arr[i][j] = str.charAt(j) - 64;
			}
		}
		
		visit[arr[0][0]] = true;
		dfs(arr, visit, 0, 0, 1);
		System.out.println(max);
	}
	
	static void dfs(int arr[][], boolean visit[], int x, int y, int depth) {
//		System.out.println(arr[x][y] + " " + x + ", " + y + ", " + depth);
//		if(visit[arr[x][y]]) {
//			System.out.println("retunr if");
//			System.out.println(arr[x][y]);
//			return;
//		}
		
		max = Math.max(max, depth);
		
		for(int i=0; i<4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if(xx < 0 || xx >= arr.length || yy < 0 || yy >= arr[0].length) continue;
			
			int value = arr[xx][yy];
			if(!visit[value]) {
				visit[value] = true;
				dfs(arr, visit, xx, yy, depth+1);
				visit[value] = false;
			}
			
		}
	}
}
