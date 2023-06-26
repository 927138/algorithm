package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1932 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N+1][N+1];
		int dp[][] = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=N; i>0; i--) {
			for(int j=1; j<=i; j++) {
				if(i == N) {
					dp[i][j] = arr[i][j];
					continue;
				}
				dp[i][j] = arr[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
			}
		}
		System.out.println(dp[1][1]);
	}

}
