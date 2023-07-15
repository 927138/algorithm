package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_8393 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print((int)str.charAt(i) - '0' + ",.  ");
			System.out.println((int)str.charAt(i));
		}
		
	}

}
