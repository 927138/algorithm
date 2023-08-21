package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_15904 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String str = "";
		char c[] = {'U', 'C', 'P', 'C'};
		
		for(int i=0; i<input.length(); i++) {
			int ch = input.charAt(i);
			if((int)'A' <= ch && ch <= (int)'Z') {
				str += String.valueOf((char) ch);
			}
		}
		// str.toString() > return error(null)
		// str.valueOf() > return "null"
		
		// Integer.parseInt() return int
		// Integer.valueOf() return Integer/Wrapper
		
		int idx = 0;
		for(int i=0; i<str.length(); i++) {
			if(c[idx] == str.charAt(i)) idx++;
			if(idx == 4) {
				System.out.println("I love UCPC");
				return;
			}
		}
		System.out.println("I hate UCPC");
	}

}
