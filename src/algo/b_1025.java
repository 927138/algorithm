package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1025 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result[][] = new int[N][M];
		int arr[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j) - '0';
				result[i][j] = -1;
			}
		}
		
		int max = -1;
//		int dx[] = {0, 1, 1, 1, 0 ,-1, -1, -1};
//		int dy[] = {1, 1, 0, -1, -1, -1, 0, 1};
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(Math.sqrt(arr[i][j]) % 1 == 0) result[i][j] = arr[i][j];
//				for(int z=0; z<8; z++) {
					dfs(arr, result, i, j);
//				}
				
				if(max < result[i][j]) max = result[i][j];
			}
		}
		System.out.println(max);
	}
	
	static void dfs(int arr[][], int result[][], int x, int y) {
		for(int i=-x; i<arr.length; i++) {
			for(int j=-y; j<arr[0].length; j++) {
				if(i == 0 && j == 0) continue;
				
				int num = 0;
				int index = 1;
				int x_x = x;
				int y_y = y;
				while (x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr[0].length) {
					num += arr[x_x][y_y] * index; 
//					System.out.println(num +",  "+ x + y);
					index *= 10;
					x_x = x_x + i;
					y_y = y_y + j;
					if(Math.sqrt(num) % 1 == 0) {
						if(result[x][y] < num) result[x][y] = num;
					}
				}
			}
		}
//		int x_x = x;
//		int y_y = y;
//		
//		int num = 0;
//		int i = 1;
//		while (x_x >= 0 && x_x < arr.length && y_y >= 0 && y_y < arr[0].length) {
//			num += arr[x_x][y_y] * i; i *= 10;
//			x_x = x_x + dx;
//			y_y = y_y + dy;
//			if(Math.sqrt(num) % 1 == 0) {
//				if(result[x][y] < num) result[x][y] = num;
//			}
//		}
	}

}
