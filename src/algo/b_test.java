package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_test {

	public static void mian(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(N);
		int arr[] = new int[N], out[] = new int[N];
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		
		
		permutation(arr, out, visit, 0, N);
		
	}
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
