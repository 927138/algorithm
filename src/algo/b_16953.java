package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_16953 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		int count = 1;
		
		while(true) {
			
			if(A == B) {
				System.out.println(count);
				break;
			}
			if(A > B) {
				System.out.println("-1");
				break;
			}
			
			if(B%10 == 1) B = (B-1)/10;
			else if(B%2==0) B = B/2;
			else {
				System.out.println("-1");
				break;
			}
			
			count++;
		}
	}

}
