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
		// �� ����
        //  > (2^3 * 3) * (2 * 3^2) /  (2 * 3)
        //  > (2^4 * 3^3) / (2 * 3)
        //  > 2^3 * 3^2 == �ּ� �����
        //  N * M���� �ִ������� ������ �ּ� ����� ����
		System.out.println(N*M / x);
		
	}

	// ��Ŭ���� ȣ����
	static int g(int a, int b) {
		if(b == 0) return a;
		
		return g(b, a%b);
	}
}
