package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long sum = 0;
		for(int i=0; i<2; i++) {
			String x = String.valueOf(st.nextToken()) + String.valueOf(st.nextToken());
			
			sum += Long.parseLong(x);
		}System.out.println(sum);
	}

}
