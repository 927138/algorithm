package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2386 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str1 = br.readLine().toLowerCase();
			if(str1.equals("#")) break;
			
			char ch = str1.charAt(0);
			int count = 0;
			for(int i=2; i <str1.length(); i++) {
				if(ch == str1.charAt(i)) count++;
			}sb.append(ch + " " + count + "\n");
			
		}
		System.out.println(sb);
	}

}
