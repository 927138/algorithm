package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1264 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("#")) return;
			
			str = str.toLowerCase();
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				int ch = str.charAt(i) - 'a';
				
				// 0 4 8 14 20
				if(ch == 0 || ch == 4 || ch == 8 || ch == 14 || ch == 20) count++;
			}System.out.println(count);
		}
	}

}
