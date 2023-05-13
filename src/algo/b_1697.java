package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1697 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[100001];
		boolean visit[] = new boolean[100001];
		arr[N] = 1;
		
		bfs(arr, visit, N);
		
		System.out.println(arr[K] - 1);
	}
	
	static void bfs(int arr[], boolean visit[], int x) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(x);
		visit[x] = true;
		while(!q.isEmpty()) {
			int a = q.poll();
			
			if(a*2 < arr.length && !visit[a*2]) {
				q.offer(a*2);
				arr[a*2] = arr[a] + 1;
				visit[a*2] = true;
			}
			if(a-1 >= 0 && !visit[a-1]) {
				q.offer(a-1);
				arr[a-1] = arr[a] + 1;
				visit[a-1] = true;
			}
			if(a + 1 < arr.length && !visit[a+1]) {
				q.offer(a+1);
				arr[a+1] = arr[a] + 1;
				visit[a+1] = true;
			}
		}
	}
}
