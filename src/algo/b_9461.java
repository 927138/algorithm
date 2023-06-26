package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long dp[] = new long[101];
		dp[1] = dp[2] = 1;
		
		for(int i=3; i<dp.length; i++) {
			dp[i] = dp[i-3] + dp[i-2];
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[N] + "\n");
		}
		System.out.println(sb);
	}

}
