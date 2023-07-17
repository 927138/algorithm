package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1913 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N+1][N+1];
		
		int max = N * N;
//		System.out.println(N * N);
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		
		int i = 0;
		int j = 1;
		int index = 0;
		while(true) {
			if(index == 4) index = 0;
			if(max == 0) break;
			
			if(i+dx[index] < 1 || i+dx[index] > N || j+dy[index] < 1 || j+dy[index] > N) {
				index++;
//				System.out.println(index);
			}else if(arr[i+dx[index]][j+dy[index]] > 0) {
				index++;
			}else {
//				System.out.println(i + ", " + j + ", "+ index + ", " + max);
				i += dx[index];
				j += dy[index];
				arr[i][j] = max--;
				
			}
			
		}
		for(int z=1; z<=N; z++) {
			for(int x=1; x<=N; x++) {
				sb.append(arr[z][x] + " ");
//				System.out.print(arr[z][x] + " ");
				if(arr[z][x] == K) {
					i = z; j = x;
				}
			}sb.append("\n");
		}
		System.out.println(sb + ""+ i+" "+j);
	}

}
