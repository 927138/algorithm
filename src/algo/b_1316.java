package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1316 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int case_num = Integer.parseInt(br.readLine());
		int value = 0;
		
		for(int i=0; i<case_num; i++) {
			String str = br.readLine();
			String str1 = "";
			for(int j=0; j<str.length(); j++) {
				String x = String.valueOf(str.charAt(j));
				if(!str1.contains(x)) {
					str1 += x;
				}				
			}
			
			char x = str.charAt(0);
			int count = 1;
			for(int j=0; j<str.length(); j++) {
				if(x != str.charAt(j)) {
					x = str.charAt(j);
					count++;
				}
			}
			
			if(str1.length() == count) value++;
			
		}
		
		System.out.println(value);
	}

}
