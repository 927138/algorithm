package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class b_5789 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(str.charAt(str.length()/2-1) == str.charAt(str.length()/2))sb.append("Do-it\n");
			else sb.append("Do-it-Not\n");
		}System.out.println(sb);
		
	}

}
