package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_2667 {
	private static int count = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][N];
		int count_value[] = new int[2525];
		boolean visit[][] = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		
		int total_count = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == 1 && !visit[i][j]) {
					dfs(arr, visit, i, j);
					count_value[i*100 + j] = count;
					sb.append(count + "\n");
					total_count++;
					count = 0;
				}
			}
		}
		System.out.println(total_count);
		
		Arrays.sort(count_value);
		for(int i=2525-total_count; i<2525; i++) {
			System.out.println(count_value[i]);
		}
	}
	
	static void dfs(int arr[][], boolean visit[][], int a, int b) {
		int x[] = {0, 0, -1, 1};
		int y[] = {1, -1, 0, 0};
		count++;
		
//		System.out.println(a + ", " + b);
		if(!visit[a][b]) {
			visit[a][b] = true;
			for(int i=0; i<4; i++) {
				int x_x = a - x[i];
				int y_y = b - y[i];
				if(x_x >= 0 && x_x <arr.length && y_y >= 0 && y_y < arr.length) {
					if(arr[x_x][y_y] == 1 && !visit[x_x][y_y]) {
						dfs(arr, visit, x_x, y_y);
						visit[x_x][y_y] = true;
//						System.out.println(x_x + ", " + y_y);
					}
//					System.out.println("df");
				}
			}
		}else return;
	}
}
