package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2442 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=N; i++) {
			int space = N - i;
//			System.out.println(space);
			for(int j=0; j<space; j++) {
				sb.append(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
