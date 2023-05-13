package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int x = g(N, M);
		System.out.println(x);
		// 식 설명
        //  > (2^3 * 3) * (2 * 3^2) /  (2 * 3)
        //  > (2^4 * 3^3) / (2 * 3)
        //  > 2^3 * 3^2 == 최소 공배수
        //  N * M에서 최대공약수를 나누면 최소 공배수 도출
		System.out.println(N*M / x);
		
	}

	// 유클리드 호제법
	static int g(int a, int b) {
		if(b == 0) return a;
		
		return g(b, a%b);
	}
}
