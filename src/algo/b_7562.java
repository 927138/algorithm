package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_7562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		for(int z=0; z<T; z++) {
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int s_x = Integer.parseInt(st.nextToken()); 
			int s_y = Integer.parseInt(st.nextToken()); 
			
			st = new StringTokenizer(br.readLine());
			int f_x = Integer.parseInt(st.nextToken()); 
			int f_y = Integer.parseInt(st.nextToken());
			
			System.out.println(bfs(N, s_x, s_y, f_x, f_y));
		}
		
	}
	
	static int bfs(int N, int s_x, int s_y, int f_x, int f_y) {
		int dx[] = {-1, 1, 2, -2, -1, 1, -2, 2};
		int dy[] = {2, 2, 1, 1, -2, -2, -1, -1};
		
		int visit[][] = new int[N+1][N+1];
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {s_x, s_y, 1});
		
		while(!q.isEmpty()) {
			int x = q.peek()[0];
			int y = q.peek()[1];
			int c = q.peek()[2];
			q.poll();
			
			if(x == f_x && y == f_y) break;
			
			for(int i=0; i<8; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];
				
				if (xx < 0 || yy < 0 || xx >= N || yy >= N) {
					continue;
				}
				
				if(visit[xx][yy] == 0) {
					visit[xx][yy] = c;
					q.offer(new int [] {xx, yy, c+1});
				}
				
			}
			
			
		}
		
		return visit[f_x][f_y];
		
	}

}
