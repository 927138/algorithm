package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1904 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N+1];
		arr[1] = 1;
		
		for(int i=2; i<N+1; i++) {
			if(i == 2) {
				arr[i] = 2;
				continue;
			}
			
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[N]);
	}

}
