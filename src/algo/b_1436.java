package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;
		
		while(y<N) {
			x++;
			if(Integer.toString(x).contains("666")) {
				y++;
			}
		}
		System.out.println(x);
	}

}
