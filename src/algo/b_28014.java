package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_28014 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int count = 1;
		int b_top = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<N; i++) {
			int a_top = Integer.parseInt(st.nextToken()); 
			if(b_top <= a_top) {
				count++;
				b_top = a_top;
				}
			else {
				b_top = a_top;
			}
		}
		
		System.out.println(count);
	}

}
