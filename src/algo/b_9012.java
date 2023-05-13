package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_9012 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			int count = 0;
			
			for(char c : str.toCharArray()) {
				if(c == '(') count++;
				else count--;
				
				if(count < 0) break;
			}
			
			if(count == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
