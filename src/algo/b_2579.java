package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		for(int i=2; i<N+1; i++) {
			if(i == 2) {
				dp[i] = arr[i-1] + arr[i];
				continue;
			}
			
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
		}
		System.out.println(dp[N]);
	}

}
