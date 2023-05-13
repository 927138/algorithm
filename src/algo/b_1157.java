package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int apb[] = new int [26];
		
		for(int i=0; i<str.length(); i++) {
			// A = 65
			int apb_num = str.charAt(i) - 65;
			apb[apb_num]++;
		}
		int max = 0;
		char ch = '?';
		for(int i=0; i<apb.length; i++) {
			if(apb[i] > max) {
				max = apb[i];
				ch = (char)(i + 65);
			}else if(max == apb[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);		
	}
}
