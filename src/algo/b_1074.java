package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1074 {

	static int value = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int pow = (int)Math.pow(2, N);
		
		def(pow, r, c);
		System.out.println(value);
	}
	
	static void def(int pow, int r, int c) {
		int div = pow/2;
		
//		System.out.println(div);
		System.out.println(pow +", " + r + ", " + c + ", " + value);
		if(pow == 1) {
			return;
		}
		
		// r За, c ї­
		if(div > r && div > c) {
			def(div, r, c);
		}else if(div <= r && div > c) {
			// pow * 2;
			value += (pow * pow / 4) * 2;
			def(div, r-div, c);
		}else if(div > r && div <= c) {
			// pow * 1;
			value += (pow * pow / 4);
			def(div, r, c-div);
		}else {
			value += (pow * pow / 4) * 3;
			def(div, r-div, c-div);
		}
	}
}
