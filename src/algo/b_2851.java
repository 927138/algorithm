package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2851 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0, before = 0;
		for(int i=0; i<10; i++) {
			if(sum < 100) {
				before = sum;
				sum += Integer.parseInt(br.readLine());
			}
		}		
		
		if(sum-100 > 100-before) sum = before;
		
		System.out.println(sum);
	}

}
