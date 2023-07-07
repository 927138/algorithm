package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_16234 {
	
	static private int dx[] = {1, -1, 0, 0};
	static private int dy[] = {0, 0, 1, -1};
	static boolean ch[][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int arr[][]	= new int[N+1][N+1];
		boolean visit[][];
		
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<N+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		int count = 0;
		
		while(true) {
			visit = new boolean[N+1][N+1];
			boolean flag = true;
			
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<N+1; j++) {
					for(int z=0; z<4; z++) {
						int x_x = i + dx[z];
						int y_y = j + dy[z];
						
						if(x_x<1 || x_x>arr.length-1 || y_y<1 || y_y>arr.length-1) continue;
						if(visit[x_x][y_y] || visit[i][j]) continue;
						
						int sub = Math.abs(arr[i][j] - arr[x_x][y_y]);
						if(sub <= R && sub >= L) {
							ch = new boolean[N+1][N+1];
							int value = bfs(arr, visit, i, j, L, R);
							flag = false;
							change(arr, value);
						}
					}
				}
			}
			
//			for(int i=1; i<N+1; i++) {
//				for(int j=1; j<N+1; j++) {
//					System.out.print(arr[i][j] + " ");
//				}System.out.println();
//			}
			
			if(flag) break;
			else count++;
			
		}
		
		System.out.println(count);
	}
	
	static int bfs(int arr[][], boolean visit[][], int x, int y, int L, int R) {
		
		Queue<int []> q = new LinkedList<>();
		
		q.offer(new int[] {x, y});
		visit[x][y] = true;
		ch[x][y] = true;
		
		int total_day = 0;
		int count_day = 0;
		
		while(!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			q.poll();
			
			total_day += arr[x][y];
			count_day++;
			
//			System.out.println("bfs  " +x + ", " + y + ",  " + visit[x][y]);
			for(int i=0; i<4; i++) {
				int x_x = x + dx[i];
				int y_y = y + dy[i];
				
				if(x_x<1 || x_x>arr.length-1 || y_y<1 || y_y>arr.length-1) continue;
				if(visit[x_x][y_y]) continue;
				
				int sub = Math.abs(arr[x][y] - arr[x_x][y_y]);
				if(sub <= R && sub >= L) {
					q.offer(new int[] {x_x, y_y});
					visit[x_x][y_y] = true;
					ch[x_x][y_y] = true;
				}
			}
		}
		return total_day/count_day; 
	}
	

	
	static void change(int arr[][], int value) {
		for(int i=1; i<ch.length; i++) {
			for(int j=1; j<ch.length; j++) {
				if(ch[i][j]) {
					arr[i][j] = value;
				}
			}
		}
	}
	
}
