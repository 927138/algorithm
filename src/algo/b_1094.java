package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1094 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		String binary = Integer.toBinaryString(x);
		
		int count = 0;
		for(int i=0; i<binary.length(); i++) {
			if(binary.charAt(i) == '1') count++;
		}
		
		System.out.println(count);
		
	}

}
