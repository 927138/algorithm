package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_3190 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Deque<int []> dq = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		ArrayList<int []> apple = new ArrayList<>();
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			apple.add(new int[] {x, y});
		}
		
		System.out.println(apple.indexOf(new int[] {2, 5}));
//		System.out.println(apple.contains(2, 4));
		System.out.println(apple.contains(new int[] {2, 5}));
		int L = Integer.parseInt(br.readLine());
		for(int i=0; i<L; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			char ch = st.nextToken().charAt(0);
			
		}
		
		
		
	}

}
