package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1919 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		
		
		int count = 0;
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					str1 = str1.replaceFirst(String.valueOf(str1.charAt(i)), "");
					str2 = str2.replaceFirst(String.valueOf(str2.charAt(j)), "");
					i--; j--;
					break;
				}
				
			}
		}
		System.out.println(str1.length()+str2.length());
	}

}
