package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1062 {
	
	static private boolean alpa[] = new boolean[26];
	static private String str[];
	static private int max = 0;
//	static int a = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		str = new String[N];
		
		
		int count = 0;
		for(int i=0; i<N; i++) {
			String br_read = br.readLine();
			br_read = br_read.replace("anta", "").replace("tica", "");
			str[i] = br_read;
		}
		
		if(M < 5) {
			System.out.println(0);
			return;
		}else if(M == 26) {
			System.out.println(N);
			return;
		}
		
		
		String word = "antic";
		for(int i=0; i<word.length(); i++) {
			int a = word.charAt(i) - 'a';
//			System.out.println(a);
			alpa[a] = true;
		}
		
//		for(String i : str) {
//			System.out.println(i);
//		}
//		for(boolean i : alpa) {
//			System.out.print(i + " ");
//		}
//		

		
		back(0, 0, N, M);
		System.out.println(max);
//		System.out.println(a);
	}
	
	
	static void back(int l, int x, int N, int M) {
//		a++;
		if(l == M-5) {
			int count = 0;
			
			for(int i=0; i<N; i++) {
				boolean flag = true;
				
				for(int j=0; j<str[i].length(); j++) {
					if(!alpa[str[i].charAt(j) - 'a']) {
						flag = false;
						break;
					}
				}
				if(flag) count++;
			}
//			System.out.println(count +", " + max +     "dffffff    " + (char_count-5) + ", " + M);
			max = Math.max(max, count);
			
			return;
		}
		
		for(int i=x; i<26; i++) {
			if(!alpa[i]){
//				System.out.println(x + ", " + i  + ", " + M);
				alpa[i] = true;
				back(l+1, i, N, M);
				alpa[i] = false;
			}
			
		}
		
	}
	
}
