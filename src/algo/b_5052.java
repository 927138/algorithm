package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class b_5052 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<String> list = new ArrayList<>();
			
			for(int j=0; j<N; j++) {
				list.add(br.readLine());
			}
			Collections.sort(list, new Comparator<String>(){
				public int compare(String s1, String s2) {
					return s1.length() - s2.length();
					
				}
			});
			System.out.println(list);
			
			String ans = "YES";
//			for(int j=1; j<N; j++) {
//				if(list.get(j).startsWith(list.get(j-1))) {
//					ans = "NO";
//					break;
//				}
//			}
//			for(int j=1; j<N; j++) {
//				if(list.get(j).length() == )
//				if(list.get(j).subString()) {
//					ans = "NO";
//					break;
//				}
//			}
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}
}
