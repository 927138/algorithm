package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int count = 0;
			
			boolean arr[][] = new boolean[N][M];
			boolean check[][] = new boolean[N][M];
			
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				arr[x][y] = true;
			}
			
			for(int j=0; j<N; j++) {
				for(int z=0; z<M; z++) {
					if(arr[j][z] && !check[j][z]) {
//						System.out.println("dfdf" +j+", "+z);
//						dfs(arr, check, j, z);
						bfs(arr, check, j, z);
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
		
	}
	static void dfs(boolean arr[][], boolean check[][], int j, int z) {
		int x[] = {0, 0, -1, 1};
		int y[] = {1, -1, 0, 0};
		
		check[j][z] = true;
		
		for(int i=0; i<x.length; i++) {
			int x_x = j + x[i];
			int y_y = z + y[i];
//			System.out.println("before j,z"+x_x + ", "+ y_y);
			if(x_x>=0 && y_y>=0 && x_x<arr.length && y_y<arr[0].length) {
//				System.out.println("after j, z"+x_x + ", "+ y_y);
				if(arr[x_x][y_y] && !check[x_x][y_y]) {
					dfs(arr, check, x_x, y_y);
				}
			}
		}
	}
	
	static void bfs(boolean arr[][], boolean check[][], int j, int z) {
		int x[] = {0, 0, -1, 1};
		int y[] = {1, -1, 0, 0};
		
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {j, z});
		
		while(!q.isEmpty()) {
			int x_x = q.peek()[0];
			int y_y = q.peek()[1];
			check[x_x][y_y] = true;
//			System.out.println("before j,z"+x_x + ", "+ y_y);
			q.poll();
			
			for(int i=0; i<4; i++) {
				int a = x_x + x[i];
				int b = y_y + y[i];
				
				if(a>=0 && b>=0 && a<arr.length && b<arr[0].length) {
					if(arr[a][b] && !check[a][b]) {
						check[a][b] = true;
						q.offer(new int[] {a, b});
					} 
					
				}
					
				
			}
//			System.out.println("after j, z"+x_x + ", "+ y_y);
		}
	}

}
