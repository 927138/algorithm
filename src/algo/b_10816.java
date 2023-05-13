package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_10816 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int N_arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			N_arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(N_arr);
		
		int M = Integer.parseInt(br.readLine());
		int M_arr[] = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			M_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			int x = upper(N_arr, 0, N, M_arr[i]) - lower(N_arr, 0, N, M_arr[i]);
			sb.append(x + " ");
		}
		System.out.println(sb);
	}
	
	// value값에 대한 left값
	static int lower(int arr[], int left, int right, int value) {
		while(left<right) {
			int mid = (left+right) / 2;
			if(arr[mid] < value) left = mid + 1;
			else right = mid;
		}
		return right;
	}
	
	// value값에 대한 right 값
	static int upper(int arr[], int left, int right, int value) {
		while(left < right) {
			
			int mid = (left+right) / 2;
			if(arr[mid] <= value) left = mid + 1;
			else right = mid;
		}
		return right;
	}
	
//	static void binary_search(int arr[], int left, int right, int value) {
//		if(left > right) return;
//		
//		int mid = (left+right) / 2;
//		System.out.println(left + ", " + right + ", "+mid + ", "  + arr[mid]);
//		if(arr[mid] > value) binary_search(arr, left, mid-1, value);
//		else if(arr[mid] < value) binary_search(arr, mid+1, right, value);
//		
//		if(arr[mid] == value) {
//			count++;
//			binary_search(arr, left, mid-1, value);
//			binary_search(arr, mid+1, right, value);
//		}
//		
//	}

}
