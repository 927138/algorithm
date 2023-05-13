package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int num[] = new int[10];
		
		String result = String.valueOf(A * B * C);
		for(int i=0; i<result.length(); i++) {
			int index = result.charAt(i) - 48;
			num[index]++; 
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
