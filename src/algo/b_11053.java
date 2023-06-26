package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1; i<N+1; i++) {
			dp[i] = 1;
			for(int j=1; j<N+1; j++) {
				if(arr[j] < arr[i]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
//			System.out.println(arr[i] + ", " + dp[i]);				
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		
//		for(int i=1; i<N+1; i++) {
//			System.out.print(dp[i] + " ");
//		}System.out.println();
		System.out.println(max);
	}

}
