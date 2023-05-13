package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1051 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		int x = 0, y = 0;
		int max = Integer.MIN_VALUE;
		
		while(x<N && y<M) {
			System.out.println("sdsdsdsd"  + x + ", " + y);
			for(int i=0; i<N-x; i++) {
				for(int j=0; j<M-y; j++) {
					System.out.println(i+ "," + j + ", " + max + ", " + x);
					if(arr[i][j] == arr[i+x][j] && arr[i][j] == arr[i][j+y] && arr[i][j] == arr[i+x][j+x]) {
						max = x + 1;
					}
				}
			}
			
			x++; y++;
		}
		System.out.println(max*max);
	}

}
