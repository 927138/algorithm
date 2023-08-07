package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2156 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		
		for(int i=1; i<N+1; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[i] = x;
			if(i < 3) dp[i] = dp[i-1]+arr[i];
		}
		
		for(int i=3; i<N+1; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]));
		}System.out.println(dp[N]);
//		for(int i=1; i<N+1; i++) {
//			
//			System.out.print(dp[i] + " ");
//		}
	}

}
