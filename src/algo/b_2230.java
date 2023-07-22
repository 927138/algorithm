package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_2230 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}Arrays.sort(arr);
		
		int l = 0, r = 0;
		int min = Integer.MAX_VALUE;
		
		while(true) {
			if(r >= N || l >= N) break;
			
			int x = arr[r] - arr[l];
			
			if(x < M) r++;
			else if(x >= M) {
				if(min > x) min = x;
				else l++;
			}
		}
		System.out.println(min);
	
	}
	
}
