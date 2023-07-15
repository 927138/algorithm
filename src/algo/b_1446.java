package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_1446 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int dp[] = new int[D+1];
		int arr[] = new int[D+1];
		
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			
		}
		
		
	}
	
	private void dilk(ArrayList<Node> list) {
		
		
	}
	
	private static class Node implements Comparable<Node>{
		int f;
		int w;
		
		Node(int f, int w){
			this.f = f;
			this.w = w;
		}
		public int compareTo(Node n) {
			return Integer.compare(this.w, w);
		}
	}

}
