package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_5567 {
	
	private static class node{
		int r;
		int w;
		
		node(int r, int w){
			this.r = r;
			this.w = w;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list[] = new ArrayList[N+1];
		boolean visit[] = new boolean[N+1];
		
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
//		for(int i=1; i<=N; i++) {
//			System.out.println(i +" : "+list[i]);
//		}
		
		System.out.println(bfs(list, visit));
	}
	
	static int bfs(ArrayList<Integer> list[], boolean visit[]) {
		
		Queue<node> q = new LinkedList<>();
		int count = 0;
		visit[1] = true;
		
		for(int i=0; i<list[1].size(); i++) {
			if(visit[list[1].get(i)]) continue;
			q.add(new node(list[1].get(i), 1));
			visit[list[1].get(i)] = true;
			
//			System.out.println(list[1].get(i));
		}
		
		while(!q.isEmpty()) {
			int r = q.peek().r;
			int w = q.peek().w;
			visit[r] = true;
			
			System.out.println(r + "m " + w);
			q.poll();
			count++;
			
			for(int i=0; i<list[r].size(); i++) {
				if(visit[list[r].get(i)]) continue;
				if(w > 1) continue;
				
				q.add(new node(list[r].get(i), w+1));
			}
		}
		return count;
	}
}
