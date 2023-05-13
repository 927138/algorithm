package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1062 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 5) {
			System.out.println(0);
			return;
		}
		
		int x = 0;
		int char_count = 5;
		String str = "antic";
		for(int i=0; i<5; i++) {
			int a = str.charAt(i) - 'a';
			x |= 1<<a;
		}
		
		int count = 0;
		String read_char[] = new String[N];
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++) {
			String read = br.readLine();
			read_char[i] = read.substring(4, read.length()-4);
			System.out.println(read_char[i]);
		}
//		for(int j=0; j<read.length(); j++) {
//			int a = 1 << (int)read.charAt(j) - 'a';
//			
//			if((a&x) != a) {
//				if(char_count < M) {
//					x |= a; char_count++;		
//					System.out.println(read.charAt(j));
//				}else {break;}
//			}
//			if(j == read.length()-1) count++;
//		}
		System.out.println(count);
	}
	
	
}
