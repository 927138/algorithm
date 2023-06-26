package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10844 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long dp[][] = new long[N+1][10];
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		
		for(int i=2; i<N+1; i++) {
			for(int j=1; j<10; j++) {
				if(j == 1) dp[i][j] = (dp[i-1][j+1] + dp[i-1][9]) % 1000000000;
				else if(j == 9) dp[i][j] = dp[i-1][j-1];
				else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
			}
		}
		
		long sum = 0;
//		for(int i=1; i<N+1; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.print(dp[i][j] + " ");
//			}System.out.println();
//		}
//		
		for(int i=1; i<10; i++) {
			sum += dp[N][i];
		}
		System.out.println(sum%1000000000);
	}

}
