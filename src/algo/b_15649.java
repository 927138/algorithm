package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_15649 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		int new_arr[] = new int[N];
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		back(arr, new_arr, visit, 0, M);

	}
	
	static void back(int arr[], int new_arr[], boolean visit[], int count, int limit) {
		if(count == limit) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<count; i++) {
				sb.append(new_arr[i] + " ");
			}
			System.out.println(sb);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(!visit[i]) {
				visit[i] = true;
				new_arr[count] = arr[i];
				back(arr, new_arr, visit, count+1, limit);
				visit[i] = false;
			}
		}
	}
}
