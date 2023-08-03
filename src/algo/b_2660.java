package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b_2660 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int result[] = new int[N+1];
		ArrayList<Integer> list[] = new ArrayList[N+1];
		boolean visit[];
		
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x == -1 || y == -1) break;
			
			list[x].add(y);
			list[y].add(x);
		}
		
		int min = Integer.MAX_VALUE;
		int count = 1;
		for(int i=1; i<N+1; i++) {
			visit  = new boolean[N+1];
			result[i] = bfs(list, visit, i);
			
			if(min > result[i]) {
				min = result[i];
				count = 1;
			}else if(min == result[i]) {
				count++;
			}
		}
		
		sb.append(min + " " + count + "\n");
		for(int i=1; i<N+1; i++) {
			if(result[i] == min) {
				sb.append(i + " ");
			} 
			
		}System.out.println(sb);
	}
	
	static int bfs(ArrayList<Integer> list[], boolean visit[], int x) {
		Deque<int []> dq = new LinkedList<>();
		dq.add(new int[] {x, 0});
		visit[x] = true;
		
		int max = 0;
		while(!dq.isEmpty()) {
			int a = dq.peek()[0];
			int w = dq.peek()[1];
			
//			System.out.println(a + ", " + w);
			max = Math.max(w, max);
			dq.poll();
			
			for(int i=0; i<list[a].size(); i++) {
				if(!visit[list[a].get(i)]) {
					dq.add(new int[] {list[a].get(i), w+1});
					visit[list[a].get(i)] = true;
				}
			}
		}
		return max;
		
	}
}
