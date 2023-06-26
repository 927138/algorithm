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
			boolean flag = true;
			
			
			for(int j=0; j<N; j++) {
				list.add(br.readLine());
			}
			Collections.sort(list, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return Integer.compare(s1.length(), s2.length());
				}
			});
//			System.out.println(list);
			
			for(int j=0; j<N; j++) {
				for(int z=j+1; z<N; z++) {
//					System.out.println(j + ", " + z);
//					System.out.println(list.get(j).length());
					String str = list.get(z).substring(0, list.get(j).length());
//					System.out.println(str);
					if(str.equals(list.get(j))) {
						flag = false;
						break;
					}
				}
				if(!flag) break;
			}
			
			if(flag) sb.append("YES\n");
			else  sb.append("NO\n");
		}
		
		System.out.println(sb);
	}
}
