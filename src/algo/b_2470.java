package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_2470 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ;i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}Collections.sort(list);
		
		
		int l = 0;
		int r = N-1;
		int min = Integer.MAX_VALUE;
		int x = 0, y = 0;
		while(true) {
			if(l >= r) break;
			
			int temp = list.get(l) + list.get(r);
			if(min > Math.abs(temp)) {
				min =  Math.abs(temp);
				x = list.get(l);
				y = list.get(r);
			}
			
			if(temp > 0) r--;
			else if(temp < 0) l++;
			else break;
		}
		
		
		System.out.println(x + " " + y);
		
	}

}
