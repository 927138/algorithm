package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_9613 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			long arr[] = new long[N];
			for(int j=0; j<N; j++) {
				arr[j] = Long.parseLong(st.nextToken());
			}Arrays.sort(arr);
			
			long gcd_sum = 0;
			for(int j=N-1; j>=0; j--) {
				for(int z=j-1; z>=0; z--) {
					gcd_sum += gcd(arr[j], arr[z]);
				}
			}
			System.out.println(gcd_sum);
		}
	}
	static long gcd(long x, long y) {
		if(y == 0) return x;
		else return gcd(y, x%y);
	}
}
