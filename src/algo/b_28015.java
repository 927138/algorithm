package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_28015 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int[][] arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int x = Integer.parseInt(st.nextToken());
				arr[i][j] = x;
			}
		}
		
		
		for(int i=0; i<N; i++) {
			int x = 0;
			int y = 0;
			
			for(int j=0; j<M-1; j++) {
				if(arr[i][j+1] == 0)
				if(arr[i][j] == 1 && arr[i][j+1] == 2) {
					x++;
				}
				if(arr[i][j] == 2 && arr[i][j+1] == 1) {
					y++;
				}
			}
		}
		System.out.println(count);
		
	

	        // ���� Ƚ���� 2�� ���� ���� ���
		
		// 2 2 1 2
		// 2 1 2 1 2 1 2 2
		// 2 2 1 1 1 0 2 2
//		 2 8
//		 2 1 2 1 2 1 2 2
//		 2 2 1 1 1 0 2 2
		
	}

	
}
