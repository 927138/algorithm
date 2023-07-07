package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_1197 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		ArrayList<Node> list[] = new ArrayList[V+1];
		boolean visit[] = new boolean[V+1];
		
		for(int i=1; i<V+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list[s].add(new Node(f,w));
			list[f].add(new Node(s,w));
		}
		
		long result = prim(list, visit);
		System.out.println(result);
	}
	
	private static long prim(ArrayList<Node>[] list, boolean visit[]) {
		long weight = 0;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		pq.offer(new Node(1, 0));
		
		while(!pq.isEmpty()) {
			Node nd = pq.poll();
			
			// 1 - 3,  3 - 1에 대한 사이클 방지
			if(visit[nd.start]) continue;
			
			visit[nd.start] = true;
			weight += nd.weight;
			
			for(Node n : list[nd.start]) {
				if(!visit[n.start]) pq.offer(n);
			}
		}
		
		return weight;
	}
	
	private static class Node implements Comparable<Node>{
		int start, weight;
		
		public Node(int start, int weight) {
			super();
			this.start = start;
			this.weight = weight;
		}
	

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.weight - o.weight;
		}
	}
	
}
