package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		
		while(true) {
			String str = br.readLine();
			sb = new StringBuilder();
			
			if(str.equals("0")) break;
			
			if(str.equals(sb.append(str).reverse().toString())) System.out.println("yes");
			else System.out.println("no");
		}
	}

}
