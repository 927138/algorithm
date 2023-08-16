package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2953 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int idx = 0;
		for(int i=0; i<5; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			if(max < sum) {
				idx = i+1;
				max = sum;
			}
		}
		System.out.println(idx + " " + max);
		
	}

}
