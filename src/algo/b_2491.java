package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2491 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[][] = new int[N+1][2];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 1;
		dp[1][0] = dp[1][1] = 1;
		for(int i=2; i<N+1; i++) {
			if(arr[i] >= arr[i-1]) dp[i][0] = Math.max(dp[i-1][0] + 1, dp[i][0]);
			else dp[i][0] = 1;
			
			if(arr[i] <= arr[i-1]) dp[i][1] = Math.max(dp[i-1][1] + 1, dp[i][1]);
			else dp[i][1] = 1;
			
			max = Math.max(max, Math.max(dp[i][1], dp[i][0]));
		}
		System.out.println(max);
	}

}
