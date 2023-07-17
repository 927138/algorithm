package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2720 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int p[] = {25, 10, 5, 1};
		
		for(int i=0; i<N; i++) {
			int pr = Integer.parseInt(br.readLine());
			
			for(int j=0; j<4; j++) {
				System.out.print(pr/p[j] + " ");
				pr %= p[j];
			}System.out.println();
		}
	}

}
