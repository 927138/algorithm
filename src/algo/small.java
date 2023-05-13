package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		str1 = str1.replaceAll("[0-9]", "");
		
		System.out.println(str1.indexOf(str2));
		
		if(str1.contains(str2)) System.out.println("1");
		else System.out.println("0");
		/*int count = 0;
		
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) == str2.charAt(count)) {
				count++;
			}
			if(count == str2.length()) break;
		}
		
		if(count == str2.length()) System.out.println("1");
		else System.out.println("0");*/
		
		
	}
}
