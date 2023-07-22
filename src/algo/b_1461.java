package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1461 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}Arrays.sort(arr);

		
		int l = 0;
		int r = N;
		int sum = 0;
		
		while(true) {
//			System.out.println(l + ", " + r);
			
			if(l == r) break;
			int count = 0;
			boolean flag = false;
			if(Math.abs(arr[l]) > arr[r]) {
				sum += Math.abs(arr[l])*2;
				flag = true;
			}else {
				sum += arr[r]*2;
			}
			
			while(count < M) {
				if(flag && arr[l] != 0) {
					l++;
				}else if(!flag && arr[r] != 0) {
					r--;
				}
				count++;
			}
			
		}
		
		sum -= Math.max(Math.abs(arr[0]), arr[N]);
		System.out.println(sum);
		
	}

}
