package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_9184 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int dp[][][] = new int[21][21][21];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a < 0 && b < 0 && c < 0) break;
			
			int dd = w(dp, a, b, c);
			System.out.println(dp[a][b][c] + ", " + dd);
			
			sb.append(b);
		}
	}
	
	static int w(int dp[][][], int a, int b, int c) {
		
		if(a<=0 || b<=0 || c<=0) return 1;
		if(a>20 || b>20 || c>20) return w(dp, 20, 20, 20);
		if(a<b && b<c) return w(dp, a, b, c-1) + w(dp, a, b-1, c-1) - w(dp, a, b-1, c);
		
		if(dp[a][b][c] != 0) return dp[a][b][c];
		else return w(dp, a-1, b, c) + w(dp, a-1, b-1, c) + w(dp, a-1, b, c-1) - w(dp, a-1, b-1, c-1);
	}
}
