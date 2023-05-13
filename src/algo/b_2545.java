package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b_2545 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int Case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Case; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			long arr[] = new long[3];
			
			for(int j=0; j<3; j++) {
				arr[j] = Long.parseLong(st.nextToken());
			}
			int D = Integer.parseInt(st.nextToken());
			
			for(int d=0; d<D; d++) {
				long max = Long.MIN_VALUE;
				for(int j=0; j<3; j++) {
					if(max < arr[j]) max = arr[j];
				}
				for(int j=0; j<3; j++) {
					if(max == arr[j]) {
						arr[j]--;
						break;
					}
				}
				
			}
//			System.out.println(arr[0] * arr[1] * arr[2]);
//			long sum = 1;
//			for(long j : arr) {
//				sum *= j;
//			}
//			System.out.println(sum);
			
//			long a = Long.MAX_VALUE;
//			int a2 = Integer.MAX_VALUE;
//			System.out.println(String.valueOf(a).length() + ", " + String.valueOf(a2).length());
			
			BigInteger sum1 = new BigInteger(String.valueOf(arr[0]));
			for(int j=1; j<3; j++) {
				sum1 = sum1.multiply(BigInteger.valueOf(arr[j]));
				System.out.println(sum1);
			}
			System.out.println(sum1);
		}
		
	}

}
