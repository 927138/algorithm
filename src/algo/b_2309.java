package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[9];
		int sum = 0;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					for(int z=0; z<9; z++) {
						if(z == i || j == z) continue;
						System.out.println(arr[z]);
					}
					return;
				}
			}
		}
	}

}
