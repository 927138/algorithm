package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int w_h[][] = new int[N][2];
		
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			w_h[i][0] = Integer.parseInt(st.nextToken());
			w_h[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<N; i++) {
			int count = 1;
			for(int j=0; j<N; j++) {
				// i의 weight, height와 j의 weight, height를 큰 값 비교
				if(w_h[i][0] < w_h[j][0] && w_h[i][1] < w_h[j][1]) count++;
			}
			System.out.print(count + " ");
		}
		
		
	}
}
