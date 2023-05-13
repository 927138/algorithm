package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class str_for {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			st = new StringTokenizer(br.readLine());
			System.out.println("dfff");
			int count = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int j=0; j<str.length(); j++) {
				for(int z=0; z<count; z++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
			
		}
	}
}
