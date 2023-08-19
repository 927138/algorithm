package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_4386 {

	static class Node implements Comparable<Node>{
		int n;
		double w;
		
		Node(int n, double w){
			this.n = n;
			this.w = w;
		}
		
		public int compareTo(Node e) {
			return (int)(this.w - e.w);
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		double arr[][] = new double[N][2];
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		
		ArrayList<Node> list[] = new ArrayList[N];
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				double weight = Math.sqrt(Math.pow(arr[i][0]-arr[j][0], 2) + Math.pow(arr[i][1]-arr[j][1], 2));
				list[i].add(new Node(j, weight));
				list[j].add(new Node(i, weight));
			}
		}
		
		System.out.printf("%.2f\n", prim(list, visit));
//		double cal = Math.sqrt(Math.pow(1-2,2) + Math.pow(1-4,2));
		
		
	}
	static double prim(ArrayList<Node> list[], boolean visit[]) {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, 0.0));
		double total = 0;
		
		while(!pq.isEmpty()){
			int n = pq.peek().n;
			double w = pq.peek().w;
			pq.poll();
			
			if(visit[n]) continue;
			
			total += w;
			visit[n] = true;
			
			for(Node e : list[n]) {
				if(visit[e.n]) continue;
				
				pq.offer(new Node(e.n, e.w));
			}
			
		}
		return total;
	}

}
