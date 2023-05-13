package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class b_10610 {
	
	public static void main(String []agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Integer arr[] = new Integer[str.length()];
		
		long sum = 0;
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
			sum += arr[i];
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		if(sum%3==0 && arr[arr.length-1]==0 && arr.length>1) {
			for(int i=0; i<str.length(); i++) {
				System.out.print(arr[i]);
			}
		}else {
			System.out.println(-1);
		}
		
	}
}
