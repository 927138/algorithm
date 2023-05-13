package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_15903 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i=0; i<M; i++) {
			long sum = arr[0] + arr[1];
			arr[0] = sum;
			arr[1] = sum;
			
			Arrays.sort(arr);
		}
		
		long sum = 0;
		for(int i=0; i<N; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}	

}
