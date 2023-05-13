package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5585 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 1000 - Integer.parseInt(br.readLine());
		int arr[] = {500, 100, 50, 10, 5, 1};
		int count = 0;
		
		for(int i=0; i<N; i++) {
			count += N / arr[i];
			N = N % arr[i];
			System.out.println(N + "m " + count);
		}
		count += N;
		
		System.out.println(count);
	}

}
