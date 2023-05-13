package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1010 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		int arr[][] = new int[30][30];
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				
				if(i == 1) arr[i][j] = j;
				else {
					arr[i][j] = arr[i-1][j-1] + arr[i][j-1];
					for(int z=1; z<j; z++) {
						arr[i][j] += arr[i-1][z];
					}
				}
			}
		}
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			System.out.println(arr[N][M]);
		}
	}
	
}
