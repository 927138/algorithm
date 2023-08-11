package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean flag = true;
		int idx = Integer.parseInt(st.nextToken());
		if(idx == 1) {flag = true;}
		else if(idx == 8) {flag = false;}
		else {
			System.out.println("mixed");
			return;
		}
		
		for(int i=1; i<8; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(flag && idx+1 == x) idx = x;
			else if(!flag && idx-1 == x) idx = x;
			else {
				System.out.println("mixed");
				return;
			}
		}
		
		if(flag) System.out.println("ascending");
		else System.out.println("descending");
	}

}
