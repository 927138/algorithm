package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1105 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
//		int L = Integer.parseInt(st.nextToken());
//		int R = Integer.parseInt(st.nextToken());
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int value = 0;
		if(str1.length() == str2.length()) {
			for(int i=0; i<str1.length(); i++) {
				System.out.println(str1.charAt(i));
				if(str1.charAt(i) == '8' && str2.charAt(i) == '8') value += 1;
				if(str1.charAt(i) == str2.charAt(i)) {
					continue;
				}else break;
			}
		}
		
		System.out.println(value);
//		int count = 0;
//		int min = Integer.MAX_VALUE;
//		for(int i=L; i<=R; i++) {
//			int x = i;
//			count = 0;
//			while(x > 0) {
//				if(x % 10 == 8) count++;
//				x = x/10;
//			}
//			
//			if(min > count) min = count;
//			if(min == 0) {
//				System.out.println(min);
//				return;
//			}
//		}
//		System.out.println(min);
	}

}
