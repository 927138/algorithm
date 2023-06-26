package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2644 {

	static int result = -1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][N+1];
		boolean visit[][] = new boolean[N+1][N+1];
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		int count = 1;
		for(int i=1; i<arr.length; i++) {
			if(!visit[a][i] && arr[a][i] > 0) {
				dfs(arr, visit, a, i, b, count);
			}
		}
		System.out.println(result);
		
	}
	static void dfs(int arr[][], boolean visit[][], int x, int y, int z, int count) {
		
		if(y == z) result = count;
		
		
//		System.out.println(x + ", " +y + ", " + z + ", "+ count);
		count++;
		visit[x][y] = true;
		visit[y][x] = true;
		
		for(int i=1; i<arr.length; i++) {
			if(!visit[y][i] && arr[y][i] > 0) {
				dfs(arr, visit, y, i, z, count);
			}
		}
	}
}
