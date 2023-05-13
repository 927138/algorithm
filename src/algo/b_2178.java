package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2178 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N][M];
		boolean visit[][] = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				if(str.charAt(j) == '1') {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
		}
		
		bfs(arr, visit);
		System.out.println(arr[N-1][M-1]);
		
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
	}
	
	static void bfs(int arr[][], boolean visit[][]) {
		
		// 인접해있는 칸으로 이동
		int x_arr[] = {0, 0, -1, 1};
		int y_arr[] = {1, -1, 0, 0};
		
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {0, 0});		
		
		while(!q.isEmpty()) {
			int x = q.peek()[0];
			int y = q.peek()[1];
			q.poll();
			
			
			visit[x][y] = true;
			for(int i=0; i<4; i++) {
				int x_x = x + x_arr[i];
				int y_y = y + y_arr[i];
				
				if(x_x<0 || y_y<0 || x_x>arr.length-1 || y_y>arr[0].length-1) continue;
				else if(!visit[x_x][y_y] && arr[x_x][y_y] > 0){
					
					q.offer(new int[] {x_x, y_y});
					arr[x_x][y_y] = arr[x][y] + 1;
					visit[x_x][y_y] = true;	
				}
				if(x_x == arr.length-1 && y_y == arr[0].length) return;
			}
		}
	}
}
