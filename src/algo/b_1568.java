package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1568 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int t = 1;
		int count = 0;
		while(true) {
			if(N == 0) break;
			if(t > N) t = 1;
			
//			System.out.println(N+", "+count + ", " + t);
			N -= t++;
			count++;
			
			
		}
		System.out.println(count);
	}

}
