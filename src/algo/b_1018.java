package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1018 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char arr[][] = new char[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N-7; i++) {
			int count = 0;
			for(int j=0; j<M-7; j++) {
				count = check(arr, i, j);
				if(min > count) min = count; 
			}
		}
		
		System.out.println(min);
		
	}
	
	static int check(char arr[][], int x, int y) {
		int sum = 0;
		char ch = arr[x][y];
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(ch == 'B') ch = 'W';
				else ch = 'B';
				
				if(ch != arr[i][j]) sum += 1;
			}
			
			if(ch == 'B') ch = 'W';
			else ch = 'B';
		}
		System.out.println(sum + ", " + (64-sum));
		sum  = Math.abs(32 - sum);
		
		return 32-sum;
	}
}
