package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=1; i<N+1; i++) {
			if(i<100) count++;
			else {
				int x = i / 100;
				int y = (i%100)/10;
				int z = (i%100)%10;
				
				if(y-x == z-y) count++;
			}
		}
		
		System.out.println(count);
	}

}
