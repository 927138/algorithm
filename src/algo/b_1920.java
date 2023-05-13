package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1920 {

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
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int M_index = Integer.parseInt(st.nextToken());
			binary_search(N_arr, M_index, 0, N-1);
		}
	}
	
	static void binary_search(int arr[], int value, int low, int high) {
		int mid = (high + low)/2; 
		System.out.println(value + " /// "+ low +", " + high + ", " + mid);
		if(low > high) {
			System.out.println("0");
			return;
		}
		
		if(arr[mid] == value) {
			System.out.println("1");
			return;
		}else if(arr[mid] > value) {
			binary_search(arr, value, low, mid-1);
		}else {
			binary_search(arr, value, mid+1, high);
		}
	}
}
