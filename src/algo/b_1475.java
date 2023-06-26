package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[M+1];
		
		int index = 1;
		for(int i=1; i<N+1; i++) {
			arr[index++]++;
			
			if(index == M+1) index = 1;
		}
		
		long g = 1;
		for(int i=1 ;i<M+1; i++) {
			g *= arr[i];
		}
		System.out.println(g);
	}

}
