package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1072 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		long z = (int)((double)y*100 / x);
		int count = 0;
		
		if(x == y || z >= 99) {
			System.out.println(-1);
		}
		else {
			while(true) {
				x++; y++;
				count++;
				
				int zz = (int)((double)y/x * 100);
				if(zz > z) break;
			}
			System.out.println(count);
		}
	}

}
