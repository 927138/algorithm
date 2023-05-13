package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_11724 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][N+1];
		boolean visit[] = new boolean[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			arr[u][v] = 1;
			arr[v][u] = 1;
		}
//		for(int i=1; i<N+1; i++) {
//			for(int j=1; j<N+1; j++) {
//				System.out.print(arr[i][j] + " ");
//			}System.out.println();
//		}
		
		int count = 0;
		for(int i=1; i<N+1; i++) {
			if(!visit[i]) {
				bfs(arr, visit, i);
				count++;
			}
		}
		System.out.println(count);
//		bfs(arr, visit, 1);
//		bfs(arr, visit, 2);
//		System.out.println("dsd");
//		bfs(arr, visit, 3);
//		System.out.println("dsd");
//		bfs(arr, visit, 4);
//		System.out.println("dsd");
//		bfs(arr, visit, 5);
//		System.out.println("dsd");
//		bfs(arr, visit, 6);
		
	}
	static void bfs(int arr[][], boolean visit[], int x) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		visit[x] = true;
		
		while(!q.isEmpty()) {
			int a = q.poll();
//			System.out.println(a);
			for(int i=1; i<arr.length; i++) {
				if(!visit[i] && arr[a][i] == 1) {
					q.offer(i);
					visit[i] = true;
				}
			}
			
		}
	}
}
