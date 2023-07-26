package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_1940 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}Collections.sort(list);
		
		int l = 0;
		int r = N-1;
		int count = 0;
		while(true) {
			if(l >= r) break;
			
			int x = list.get(l) + list.get(r);
			
			if(x > M) r--;
			else if(x < M) l++;
			else {
				count++;
				r--; l++;
			}
			
// 			for(int i=r; i>l; i--) {
//				int x = list.get(l) + list.get(i);
//				if(x == M) {
//					r = i-1; count++;
////					System.out.println(l + ",  " + r);
//				}
//			}
		}
		System.out.println(count);
	}	

}

