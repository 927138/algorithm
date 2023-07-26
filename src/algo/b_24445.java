package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_24445 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list[] = new ArrayList[N+1];
		int visit[] = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			list[y].add(x);
		}
		
		for(int i=1; i<N+1; i++) {
			Collections.sort(list[i], Collections.reverseOrder());
		}
		bfs(list, visit, S);
		
		for(int i=1; i<N+1; i++) {
			sb.append(visit[i] + "\n");
		}System.out.println(sb);
	}
	static void bfs(ArrayList<Integer> list[], int visit[], int s) {
		Deque<Integer> dq = new LinkedList<>();
		
		int count = 1;
		visit[s] = count++;
		dq.offer(s);
		
		while(!dq.isEmpty()) {
			int x = dq.pollFirst();
			for(int i : list[x]) {
				if(visit[i] == 0) {
					visit[i] = count++;
					dq.offer(i);
				}
			}
		}
		
		
	}
}
