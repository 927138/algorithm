package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N];
		
		dp[0] = 1;
		for(int i=1; i<N; i++) {
			if(i%3 == 0) dp[i] = dp[i-3] + 1;
			else dp[i] = dp[i-1] + 1;
		}
//		int result = N/3 + N%3;
//		
		System.out.println(dp[N-1] % 2 == 0 ? "SK" : "CY");
	}

}
