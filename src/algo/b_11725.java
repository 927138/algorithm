package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_11725 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		boolean visit[] = new boolean[N+1];
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<N+1; i++) {
			list.add(new ArrayList<>());
		}
		
		int result[] = new int[N+1];
		
		for(int i=0; i<N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.get(x).add(y);
			list.get(y).add(x);
			
		}

		dfs(list, visit, result, 1);
		visit[1] = true;
		
		for(int i=2; i<N+1; i++) {
			sb.append(result[i] + "\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(ArrayList<ArrayList<Integer>> list, boolean visit[], int result[], int x) {
		
		for(int i : list.get(x)) {
			if(!visit[i]) {
				visit[i] = true;
				result[i] = x;
				dfs(list, visit, result, i);
				
			}
		}
		
	}
	
}
