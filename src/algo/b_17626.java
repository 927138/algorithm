package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_17626 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		
		
		for(int i=1; i*i <= N; i++) {
			arr[i*i] = 1;
		}
		for(int i=2; i<=N; i++) {
			
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
