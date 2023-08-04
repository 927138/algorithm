package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b_2437 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		long arr[] = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}Arrays.sort(arr);
		
		if(arr[0] != 1) {
			System.out.println(1);
			return;
		} 
		
		long sum = 1;
		for(int i=1; i<N; i++) {
			if(sum+1 < arr[i]) break;
			
			sum += arr[i];
		}
		System.out.println(sum+1);
	}
	
}

