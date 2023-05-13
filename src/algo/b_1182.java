package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1182 {
	
	static int count = 0, N, S;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		boolean visit[] = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}	
		
		for(int i=1; i<=N; i++) {
			combi(arr, visit, 0, 0, i);
		}

		System.out.println(count);
	}
	
	static void combi(int arr[], boolean visit[], int index, int depth, int r) {
		if(depth == r) {
			int sum = 0;
			for(int i=0; i<visit.length; i++) {
				if(visit[i]) System.out.print(arr[i] + " ");
//				if(visit[i]) sum+= arr[i];
			}
			System.out.println();
			if(sum == S) count++;
			
			return;
		}
		
		for(int i=index; i<arr.length; i++) {
			if(!visit[i]) {
				visit[i] = true;
				combi(arr, visit, i+1, depth+1, r);
				visit[i] = false;
			}
		}
		
	}
}
