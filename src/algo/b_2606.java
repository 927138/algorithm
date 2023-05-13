package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2606 {
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		
		boolean arr[][] = new boolean[N+1][N+1];
		boolean visit[] = new boolean[N+1];
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = true;
			arr[y][x] = true;
		}
		dfs(1, arr, visit);
		System.out.println(count);
		
		
	}
	
	// count�� ���ִ°��̱� ������ dfs�� ����
	// bfs���� ������ ������ ����
 	static void dfs(int a, boolean arr[][], boolean visit[]) {
		if(!visit[a]) {
			visit[a] = true;
			for(int i=1; i<visit.length; i++) {
				if(arr[a][i] && !visit[i]) {
					count++;
					dfs(i, arr, visit);
				}
			}
		}
	}

}
