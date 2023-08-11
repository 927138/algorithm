package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2293 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int dp[] = new int[K+1];
		
		dp[0] = 1;
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			for(int j=x; j<=K; j++) {
				dp[j] += dp[j-x];
			}
		}		
		System.out.println(dp[K]);
	}

}
