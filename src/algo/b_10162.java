package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10162 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int arr[] = {300, 60, 10};
		
		
		for(int i=0; i<arr.length; i++) {
			sb.append(T/arr[i] + " ");
			T = T % arr[i];
		}
		
		if(T == 0) System.out.println(sb);
		else System.out.println(-1);
		
	}

}
