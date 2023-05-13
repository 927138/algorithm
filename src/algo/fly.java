package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fly {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test_case = Integer.parseInt(br.readLine());
		double result[] = new double[test_case];
		
		for(int i=0; i<test_case; i++) {
			st = new StringTokenizer(br.readLine());
			Integer.parseInt(st.nextToken());
			result[i] = Double.parseDouble(st.nextToken()) / 
					(Double.parseDouble(st.nextToken()) + Double.parseDouble(st.nextToken())) *
					Double.parseDouble(st.nextToken());
		}
		for(int i=0; i<test_case; i++) {
			System.out.println(i+1 +" "+ String.format("%.6f", result[i]));
		}
	}

}
