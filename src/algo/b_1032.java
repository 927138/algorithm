package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		boolean[] check = new boolean[str.length()];
		for(int i=1; i<N; i++) {
			String str1 = br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) != str1.charAt(j)) check[j] = true;
			}str = str1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(check[i]) sb.append("?");
			else sb.append(str.charAt(i));
		}System.out.println(sb);
	}

}
