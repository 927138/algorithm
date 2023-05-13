package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1024 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		boolean flag = true;
		
		while(flag) {
			
			int l = N/L - (L/2+L%2-1);
			
			int sum = 0;
			for(int i=0; i<L; i++) {
				sum += l+i;
			}
			
			
			if(sum == N && l >= 0) {
				for(int i=0; i<L; i++) {
					sb.append((i+l) + " ");
				}
				break;
			}
			
			L++;
			if(2 > L || 100 < L) {
				flag = false;
				sb.append(-1);
			}
			
		}
		
		System.out.println(sb);
	}

}
