package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10974 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N], out[] = new int[N];
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		permutation(arr, out, visit, 0, N);
//		per(arr, 0, N);
		
	}
	
//	static void per(int arr[], int depth, int r) {
//		if(depth == r) {
//			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i]+  " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			swap(arr, depth, i);
//			per(arr, depth+1, i);
//			swap(arr, depth, i);
//		}
//	}
//	
//	static void swap(int arr[], int x, int y) {
//		int q = arr[x];
//		arr[x] = arr[y];
//		arr[y] = q;
//	}
	
	static void permutation(int arr[], int out[], boolean visit[], int depth, int r) {
		// 깊이가 같으면 print
		if(depth == r) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(out[i]+  " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(visit[i] != true) {
				visit[i] = true;
				out[depth] = arr[i];
				permutation(arr, out, visit, depth+1, r);
				visit[i] = false;
			}
		}
	}
}
