package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1057 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int count = 0;
		while(true) {
			System.out.println(x + ", " + y);
			x -= x/2;
			y -= y/2;
			count++;
			System.out.println(x + ", " + y);
			if(x == y) break;
		}
		
		System.out.println(count);
	}

}
