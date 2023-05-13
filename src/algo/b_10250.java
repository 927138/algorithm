package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N%H == 0) {
				System.out.println((H*100) + (N/H));
			}else {
				System.out.println(( N%H*100) + (N/H + 1));
			}
//			if(H == 1) System.out.println( (N%H+100) + (N/H));
//			else System.out.println( (N%H*100) + (N/H + 1));

		}
	}

}
