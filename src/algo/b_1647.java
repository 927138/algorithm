package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int w;
	int cost;
	
	Node(int w, int cost){
		this.w = w;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}


public class b_1647 {

	// 간선에 개수가 많아 프림 알고리즘 적용
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		boolean visit[] = new boolean[V+1];
		ArrayList<Node> list[] = new ArrayList[V+1];
		for(int i=1; i<V+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list[s].add(new Node(f, cost));
			list[f].add(new Node(s, cost));
		}
		prim(list, visit, 1);
	}
	
	static void prim(ArrayList<Node> list[], boolean visit[], int s) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(s, 0));
		
		int sum = 0;
		int max = 0;
		while(!pq.isEmpty()) {
			int w = pq.peek().w;
			int cost = pq.peek().cost;
			pq.poll();
			
//			System.out.println("w : "+w + ", cost : " + cost);
			if(visit[w]) continue;
			
//			System.out.println(w  + " visit  : "+cost);
//			System.out.println();
			
			visit[w] = true;
			max = Math.max(max, cost);
			sum += cost;
			
			for(Node n : list[w]){
				if(!visit[n.w]) {
					pq.offer(n);
				}
			}
		}
		System.out.println(sum - max);
	}

}
