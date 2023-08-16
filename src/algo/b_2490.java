package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2490 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int count = 0;
			for(int j=0; j<4; j++) {
				count += Integer.parseInt(st.nextToken());
			}
			
			if(count == 4) System.out.println("E");
			else System.out.println((char)('D' - count));
		}
		
	}

}
