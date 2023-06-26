package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_14501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N+1][2];
		int dp[] = new int[N+2];
		
		for(int i=1;i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			arr[i][0] = t;
			arr[i][1] = p;
		}
		
		int max = 0;
		for(int i=1; i<N+1; i++) {
			int ti = arr[i][0] + i;
			
			
			dp[i] = Math.max(dp[i], max);
			if(ti <= N+1) {
				dp[ti] = Math.max(dp[i] + arr[i][1], dp[ti]);
			}
			max = Math.max(dp[i], max);
		
//			for(int j=1; j<N+2; j++) {
//				System.out.print(dp[j] + " ");
//			}System.out.println();
		}
		
		System.out.println(Math.max(dp[N+1], dp[N]));
	}

}
