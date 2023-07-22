package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		while(true) {
			if(N == 1) {
				sb.append(1);
				break;
			}else if(N < 1) {
				break;
			}
			
			int mod = N % B;
			if(mod < 10) sb.append(mod);
			else {
				mod -= 10;
				sb.append((char)(mod + 'A'));
				
			}
			N /= B;
		}
		
		System.out.println(sb.reverse());
	}

}
