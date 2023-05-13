package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1439 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Integer.parseInt(""));
		
		
		String str = br.readLine();
		int count = 0;
		int index = 0;
		char ch = str.charAt(0);
		
		while(index < str.length()-1) {
			System.out.println(index + ", "+ str.length());
			char ch2 = str.charAt(++index);
			
			if(ch != ch2) {
				count++;
				while(ch != ch2 && index < str.length()-1) {
					ch2 = str.charAt(++index);
				}
			}
		}
		System.out.println(count);
	}

}

