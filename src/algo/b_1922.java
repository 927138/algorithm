package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_1922 {
	
	private static class node implements Comparable<node>{
		int a;
		int b;
		int w;
		
		node(int a, int b, int w){
			this.a = a;
			this.b = b;
			this.w = w;
		}
		
		public int compareTo(node n) {
			return this.w - n.w;
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N+1];
		ArrayList<node> list = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.add(new node(a, b, c));
		}Collections.sort(list);
		
		int cost = 0;
		int count = 0;
		for(int i=0; i<M; i++) {
			if(count >= N) break;
			
			int x = list.get(i).a;
			int y = list.get(i).b;
			
			if(union(arr, x, y)) {
				count++; cost += list.get(i).w;
			}
		}System.out.println(cost);
	}
	
	static int find(int arr[], int x) {
		if(arr[x] == x) return x;
		
		return arr[x] = find(arr, arr[x]);
	}
	
	static boolean union(int arr[], int x, int y){
		int x1 = find(arr, x);
		int y1 = find(arr, y);
		
		if(x1 == y1) return false;
		
		if(x1 < y1) arr[y1] = x1;
		else arr[x1] = y1;
		return true;
	}
}
