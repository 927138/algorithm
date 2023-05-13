package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_2212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int arr2[] = new int[N-1];
		for(int i=0; i<N-1; i++) {
			arr2[i] = Math.abs(arr[i] - arr[i+1]);
		}
		
		Arrays.sort(arr2);
		
		for(int i=0; i<N-1; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		int sum = 0;
		for(int i=0; i<N-K; i++) {
			System.out.print(arr2[i] + " ");
			sum += arr2[i];
		}
		System.out.println("");
		System.out.println(sum);
	}

}
