package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10818 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(st.nextToken());
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		System.out.println(min + " " + max);
	}

}
