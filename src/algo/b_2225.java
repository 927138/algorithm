package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2225 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[N+1][M];
		
		for(int i=0; i<=N; i++) {
			for(int j=0; j<M; j++) {
				if(i == 0 || j == 0) dp[i][j] = 1;
				else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
		}
		System.out.println(dp[N][M-1]);
		
	}

}
