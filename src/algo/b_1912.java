package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_1912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[1];
		dp[1] = arr[1];
		
		for(int i=2; i<N+1; i++) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			max = Math.max(max, dp[i]);
		}
		
//		for(int i=1; i<N+1; i++) {
//			System.out.print(dp[i] + " ");
//		}
		System.out.println(max);
	}

}
