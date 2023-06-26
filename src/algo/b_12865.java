package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_12865 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][2];
		int result[][] = new int[N+1][K+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=K; j++) {
				result[i][j] = result[i-1][j];
				if(j - arr[i][0] >= 0) {
					System.out.println("dfff" + i + ", " + j);
					System.out.println((i-1) + ".. " + (j-arr[i][0]));
					result[i][j] = Math.max(result[i][j], result[i-1][j-arr[i][0]]+arr[i][1]);
				}
			}
		}
		System.out.println(result[N][K]);
	}

}
