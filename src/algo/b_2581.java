package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		boolean flag = false;
		
		for(int i=N; i<=M; i++) {
//			System.out.println(i + ", " + check(N));
			if(check(i)) {
				flag = true;
				sum+= i;
				min = Math.min(min, i);
			}
		}
		
		if(flag) System.out.println(sum + "\n" + min);
		else System.out.println(-1);
	}

	static boolean check(int N) {
//		System.out.println("dff  " + Math.sqrt(N));
		if(N == 1) return false;
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(N % i == 0) return false; 
		}
		return true;
	}
}
