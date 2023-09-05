package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1124 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean[] prime = new boolean[100001];
		
		// 소수 판별
		prime[0] = prime[1] = true;
		for(int i=2; i*i<prime.length; i++) {
			
			if(!prime[i]) {
				for(int j=i*i; j<prime.length; j+=i) {
					prime[j] = true;
				}
			}
		}
		
//		for(int i=0; i<prime.length; i++) {
//			if(!prime[i])
//				System.out.println(i + " ");
//		}
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for(int i=N; i<=M; i++) {
			int case1 = i;
			
			int idx = 2;
			int test_count = 0;
			while(case1 >= idx) {
				if(case1 % idx != 0) {idx++; continue;}
				if(!prime[idx] && case1 % idx == 0) {
					case1 /= idx;
					test_count++;
				}
			}
			
			if(!prime[test_count]) count++;
		}
		System.out.println(count);
		
	}

}
