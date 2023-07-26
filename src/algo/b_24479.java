package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_24479 {
	
	private static int count = 1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int visit[] = new int[N+1];
		ArrayList<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			list[y].add(x);
		}
		
		
		for(int i=1; i<N+1; i++) {
			Collections.sort(list[i]);
		}
		int a = list[1].get(1);
		System.out.println(a);
		
		dfs(list, visit, S);
		
		for(int i=1; i<N+1; i++) {
			sb.append(visit[i] + "\n");
		}System.out.println(sb);
	}
	
	static void dfs(ArrayList[] list, int visit[], int s) {
		if(visit[s] > 0) return;
		
		visit[s] = count++;
		for(int i=0; i<list[s].size(); i++) {
			int a = (int) list[s].get(i);
			if(visit[a] > 0) continue;
			
			System.out.println(s + ", " + i);
			dfs(list, visit, a);
		}
	}
	
	
}
