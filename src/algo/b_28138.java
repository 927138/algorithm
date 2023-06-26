package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_28138 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		long R = Long.parseLong(st.nextToken());
		
		long sum = 0;
//		N = N-R;
		long sqrt = (long) Math.sqrt(N);
		
		for(int i=1; i<=sqrt; i++) {
			if(N%i == 0) {
				System.out.println(i + ", " + (N/i));
				sum += i;
				if(N/i != i) sum += N/i;
			}  
		}
		System.out.println(sum);
	}

}
