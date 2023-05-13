package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class b_1339 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int alpa[] = new int[26];
		String arr[] = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
			for(int j=0; j<arr[i].length(); j++) {
				int index = arr[i].charAt(j) - 'A';
				alpa[index] += (int)Math.pow(10, arr[i].length()-j-1);
			}
		}
		Arrays.sort(alpa);
		
		int num = 9;
		int sum = 0;
		
		for(int i=alpa.length-1; i>0; i--) {
			if(alpa[i] == 0) break;
			sum += alpa[i] * num--;
		}
		System.out.println(sum);
		
	}

}
