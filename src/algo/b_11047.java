package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int N_value[] = new int[N];
		int count = 0;
		
		for(int i=0; i<N; i++) {
			N_value[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=N-1; i>=0; i--) {
			if(K/N_value[i] > 0) {
				count += K/N_value[i];
				K = K%N_value[i];
			}
		}
		
		System.out.println(count);
	}

}
