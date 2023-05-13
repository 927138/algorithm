package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class three_check {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//Stringbuilder �ſ��߿�
		StringBuilder sb = new StringBuilder();
		
		
		// N = ���� ��
		// K = 3���� ������ ��
		// L = ���� ������
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		int count = 0;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int h1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			int h3 = Integer.parseInt(st.nextToken());
			if(h1 >= L && h2 >= L && h3 >= L && h1 + h2 + h3 >= K) {
				count += 1;
				sb.append(h1+" ");
				sb.append(h2+" ");
				sb.append(h3+" ");
			}
		}
		
		System.out.println(count);
		System.out.println(sb);
		
		
	}
}
