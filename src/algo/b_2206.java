package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_2206 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][M+1];
		
		for(int i=1; i<N+1; i++) {
			String str = br.readLine();
			for(int j=1; j<M+1; j++) {
				arr[i][j] = str.charAt(j-1) - '0';
			}
		}
		
		System.out.println(bfs(arr, N, M));
		
	}
	
	static int bfs(int arr[][], int N, int M){
		
		int dx[] = {1, -1, 0, 0};
		int dy[] = {0, 0, -1, 1};
		int result = -1;
		
		Deque<int []> dq = new LinkedList<int[]>();
		boolean visit[][][] = new boolean[2][N+1][M+1];
		
		// x, y, º®, cnt
		dq.offer(new int[] {1, 1, 0, 1});
		visit[0][1][1] = true;
		visit[1][1][1] = true;
		
		while(!dq.isEmpty()) {
			
			int dq_value[] = dq.poll();
			if(dq_value[0] == N && dq_value[1] == M) {
				result = dq_value[3];
				break;
			}
			
//			System.out.println(dq_value[0] + ", " + dq_value[1] + ", " + dq_value[2] + ", " + dq_value[3]);
			for(int i=0; i<4; i++) {
				int xx = dq_value[0] + dx[i];
				int yy = dq_value[1] + dy[i];
				
				if(xx < 1 || xx > N || yy < 1 || yy > M) continue;
				
				if(arr[xx][yy] == 0) {
					if(!visit[dq_value[2]][xx][yy]) {
						dq.offer(new int[] {xx, yy, dq_value[2], dq_value[3]+1});
						visit[dq_value[2]][xx][yy] = true;
					}
				}else {
					if(!visit[1][xx][yy] && dq_value[2]==0) {
						dq.offer(new int[] {xx, yy, 1, dq_value[3]+1});
						visit[1][xx][yy] = true;
					}
				}
			}
			
		}
		
		return result;
		
	}

}
