package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_5014 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		
	}
	static void bfs(int F, int S, int G, int U, int D) {
		boolean visit[] = new boolean[F+1];
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(S);
		visit[S] = true;
		
		
		while(!q.isEmpty()) {
			
			if(S+U <= F) {
				q.offer(S+U);
				visit[S+U] = true;
			}
			if(S-D >= 0) {
				q.offer(S-D); 
				visit[S-D] = true;			
			}
		}
	}
	
}
