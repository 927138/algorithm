package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1969 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		char a = 'a';
//		System.out.println(a);
//		int b = 3;
//		System.out.println(b);
//		System.out.println((char)(b + 'a'));
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String arr[] = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr);

		int distance = 0;
		for(int i=0; i<M; i++) {
			int alpa[] = new int[26];
			for(int j=0; j<N; j++) {
				int ch = (int)arr[j].charAt(i) - 'A';
				alpa[ch]++;
			}
			
			int max = 0;
			char c = 'A';
			for(int j=0; j<26; j++) {
				if(max < alpa[j]) {
					max = alpa[j];
					c = (char)(j + 'A');
				}
			}
			
			sb.append(String.valueOf(c));
			distance += N - max;
		}
		System.out.println(sb + "\n" + distance);
	}

}
