package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1034 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[51];
		String str[] = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = br.readLine();
			int zero_count = 0;
			
			for(int j=0; j<M; j++) {
				if(str[i].charAt(j) == '0') zero_count += 1;
			}
			arr[zero_count]++;
		}	
		
		int k = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		
		if(k % M == 0) System.out.println(arr[0]);
		else {
			for(int i=1; i<arr.length; i++) {
				if(arr[i] != 0 && k % arr[i] == 0) {
					System.out.println("dfdf");
				}
			}
		}
	}
}
	
	


