package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1812 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int result[] = new int[N+1];
		
		int value = 0;
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(i%2 == 1) value+=arr[i];
			else value -= arr[i];
		}
		
		result[1] = value/2;
//		System.out.println(value/2);
		
		
		for(int i=2; i<=N; i++) {
			result[i] = arr[i-1] - result[i-1];
		}
		
		for(int i=1; i<=N; i++) {
			System.out.println(result[i]);
		}
		
	}

}
