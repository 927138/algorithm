package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_10819 {
	
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int new_arr[] = new int[N];
		boolean visit[] = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(st.nextToken());
			arr[i] = x; 
		}
		
		search(arr, new_arr, visit, N, 0);
		System.out.println(max);
		
	}
	
	static void search(int arr[], int new_arr[], boolean visit[], int N, int count) {
		
		
		
		if(count == N) {
			int sum = 0;
			for(int i=1; i<N; i++) {
				sum += Math.abs(new_arr[i-1] - new_arr[i]);
			}
//			System.out.println(sum);
			if(max < sum) max = sum;
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
//				System.out.println(i + ", "  + count);
				visit[i] = true;
				new_arr[count] = arr[i];
				search(arr, new_arr, visit, N, count+1);
				visit[i] = false;
			}
		}
		
	}
}
