package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1788 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		boolean check = (N > 0) ? true : false;
		
		
		int arr[] = new int[Math.abs(N)+1];
		arr[0] = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(i == 1) {
				arr[i] = 1;
				continue;
			}
			if(check) {
				arr[i] = (arr[i-2] + arr[i-1]) % 1000000000;
			}else {
				arr[i] = (arr[i-2] - arr[i-1]) % 1000000000;
			}
		}
		
		if(arr[Math.abs(N)] < 0) System.out.println(-1 + "\n" + Math.abs(arr[Math.abs(N)]));
		else if(arr[Math.abs(N)] == 0) System.out.println(0 + "\n" + arr[Math.abs(N)]);
		else System.out.println(1 + "\n" + arr[Math.abs(N)]);
		
	}

}
