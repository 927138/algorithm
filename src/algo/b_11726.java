package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11726 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long arr[] = new long[N+1];
		if(N == 1) {			
			System.out.println(1);
			return;
		}
		else if(N == 2) {			
			System.out.println(2);
			return;
		}
		else {
			arr[1] = 1;
			arr[2] = 2;
		}
		for(int i=3; i<arr.length; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 10007;
//			System.out.printf("%20d ", arr[i]);
//			if(i % 10 == 0) {
//				System.out.print(i/10);				
//				System.out.println();
//			}
			
		}
//		System.out.println();
		System.out.println(arr[N]);
	}

}
