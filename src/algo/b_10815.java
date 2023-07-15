package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> n = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			n.add(Integer.parseInt(st.nextToken()));
		}Collections.sort(n);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(binary(n, 0, N-1, num) + " ");
		}
		System.out.println(sb);
		
	}
	static int binary(ArrayList<Integer> n, int l, int r, int x) {
		
		if(l > r) return 0;
		
		int center = (l + r) / 2;
//		System.out.println(n.size() + " " + center);
		if(n.get(center) < x) return binary(n, center+1, r, x);
		else if(n.get(center) > x) return binary(n, l, center-1, x);
		else return 1;
		
		
	}
}
