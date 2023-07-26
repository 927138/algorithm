package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_28352 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long a = d(N);
		System.out.println(a/604800);
		System.out.println(a);
		
		//60480
	}
	static long d(int n) {
		if(n == 1 || n == 0) return 1;
		else return n * d(n-1);
	}
}
