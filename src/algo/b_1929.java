package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1929 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean result[] = new boolean[N+1];
		int count = 0;
		
		result[0] = result[1] = true; 
		
		for(int i=2; i*i<=N; i+=1) {
			if(!result[i]) {
				for(int j=i*i; j<=N; j+=i) {
					result[j] = true;
					
				}
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(!result[i]) System.out.println(i);
		}
	}

}
