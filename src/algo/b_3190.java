package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_3190 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		LinkedList<int[]> l = new LinkedList<>();
		
		int board[][] = new int[N][N];
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			board[x-1][y-1] = 1;
		}
		
		int a[] = {1,2};
 		l.add(a);
		int b[] = l.poll();
 		System.out.println(b[0] + ", " + b[1]);
		
	}

}
