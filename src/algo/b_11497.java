package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_11497 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int z=0; z<T; z++) {
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}Arrays.sort(arr);
			
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<N-1; i++) {
				
				if(i == 0 || i == N-2) {
					max = Math.max(max, Math.abs(arr[i] - arr[i+1]));
					if(i == N-2) break;
				}
				
				max = Math.max(max, Math.abs(arr[i] - arr[i+2]));
			}
			sb.append(max + "\n");
		}System.out.println(sb);
	}

}
