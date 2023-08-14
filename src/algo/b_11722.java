package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11722 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int dp[] = new int[N]; 
		dp[0] = 1;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<N; i++){
			if(arr[i-1] > arr[i] && dp[i] <dp[j]) {
				dp[i] = dp[i-1] + 1;
			}else {
				dp[i] = dp[i-1];
			}
		}System.out.println(dp[N-1]);
		
		
	}

}
