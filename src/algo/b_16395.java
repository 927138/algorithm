package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_16395 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list[] = new ArrayList[31];
		
		for(int i=0; i<31; i++) {
			list[i] = new ArrayList<>();
		}
		
		int idx = 1;
		
		for(int i=1; i<31; i++) {
			for(int j=1; j<=idx; j++) {
//				System.out.println(idx + ", " + j);
				if(j == 1 || j==idx) list[i].add(1);
				else {
//					System.out.println(i + ", " + (i-1) + ", " + j);
					int x = list[i-1].get(j-2) + list[i-1].get(j-1);
					list[i].add(x);
				}
			}
//			System.out.println(list[i]);
			idx++;
		}
		
		System.out.println(list[n].get(k-1));
//		for(int i=1; i<31; i++) {
//			System.out.println(list[i]);
//		}
		
	}

}
