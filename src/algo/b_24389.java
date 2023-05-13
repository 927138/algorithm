package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_24389 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String x = Integer.toBinaryString(N);
		String y = Integer.toBinaryString(~N+1).substring(32-x.length());
		
		int hap = 32-x.length();
		for(int i=0; i<x.length(); i++) {
			if(x.charAt(i) != y.charAt(i)) hap++;
		}
		
		System.out.println(hap);
	}

}
