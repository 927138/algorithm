package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_4796 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int index = 0;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			int day = 0; index++;
			
			if(L == 0) break;
			day += (V / P) * L;
			if(V % P > L) day += L;
			else day += V % P;
			
			sb.append("Case "+index +": " + day +"\n");
		}
		System.out.println(sb);
	}

}
