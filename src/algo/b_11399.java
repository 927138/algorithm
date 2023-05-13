package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}		
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
		sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
