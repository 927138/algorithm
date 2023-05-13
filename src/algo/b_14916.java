package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_14916 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = -1;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			int x = N;
			x -= 5*i;
			if(x < 0) break;
			
			if(x%2 == 0) count = i + x/2;
		}		
		System.out.println(count);
	}

}
