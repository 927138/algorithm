package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_6603 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			sb = new StringBuilder();
			
			int N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			
			int arr[] = new int[N];
			boolean visit[] = new boolean[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			back(arr, visit, 0, 0, sb);
			System.out.println(sb);
			
		}
	}
	
	static void back(int arr[], boolean visit[], int depth, int idx, StringBuilder sb) {
		if(depth == 6) {
			for(int i=0; i<visit.length; i++) {
				if(visit[i]) sb.append(arr[i] + " ");
			}sb.append("\n");
			return;
		}
		
		for(int i=idx; i<arr.length; i++) {
			visit[i] = true;
			back(arr, visit, depth+1, i+1, sb);
			visit[i] = false;
		}
	}
}
