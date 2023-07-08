package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_1916 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Node> list[] = new ArrayList[N+1];
		int dis_w[] = new int[N+1];
		boolean visit[] = new boolean[N+1];
		for(int i=1; i<N+1; i++) {
			list[i] = new ArrayList<>();
			dis_w[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list[l].add(new Node(r , w));
//			list[r].add(new Node(l , w));
		}
		
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		dijk(list, visit, dis_w, s);
		
//		for(int i=1; i<N+1; i++) {
//			System.out.print(dis_w[i] + " ");
//		}
		System.out.println(dis_w[f]);
	}
	
	static void dijk(ArrayList<Node> list[], boolean visit[], int dis_w[], int s){
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		dis_w[s] = 0;
		pq.offer(new Node(s, 0));
		
//		for(int i=1; i<4; i++) {
//			for(Node n : list[i]) {
//				System.out.println("i:" + i +"  " +n.index + ", " + n.weight);
//			}
//		}
		
		while(!pq.isEmpty()) {
//			System.out.println("pq " +pq.peek().index + ", " + pq.peek().weight);
			int idx = pq.peek().index;
			pq.poll();
			
			if(visit[idx]) continue;
			visit[idx] = true;
			
			for(Node n : list[idx]) {
				if(dis_w[n.index] > dis_w[idx] + n.weight) {
					dis_w[n.index] = dis_w[idx] + n.weight;
					pq.offer(new Node(n.index, dis_w[n.index]));
//					System.out.println(n.index + " =  "  + dis_w[n.index]);
				}
			}
		}
	}
	
	private static class Node implements Comparable<Node>{
		int index;
		int weight;
		
		Node(int index, int weight){
			this.index = index;
			this.weight = weight;
		}
		
		public int compareTo(Node n) {
			return Integer.compare(this.weight, n.weight);
		}
	}
	
}

