package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1149 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][4];
		int result[][] = new int[N+1][4];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<4; j++) {
				for(int z=1; z<4; z++) {
					if(j == z) continue;
//					result[i-1][z];
//					System.out.println("dddd   " +i+ " = "+ j + "," + z);
					if(result[i][j] == 0) {
						result[i][j] = arr[i][j] + result[i-1][z];
//						System.out.println("if : " + result[i][j] + ", " + result[i-1][z]);
					}
					else {
//						System.out.println("else : " + result[i][j] + " , " +(arr[i][j] + result[i-1][z]));
						result[i][j] = Math.min(result[i][j],  arr[i][j] + result[i-1][z]);
					}
					
				}
//				System.out.println("result i,j : "+result[i][j] + " ");
			}
		}
		
//		for(int i=1; i<N+1; i++) {
//			for(int j=1; j<4; j++) {
//				System.out.print(result[i][j] + " ");
//				
//			}System.out.println();
//		}
		int min = Integer.MAX_VALUE;
		for(int j=1; j<=3; j++) {
			if(min > result[N][j]) min = result[N][j];
		}
		System.out.println(min);
		
	}

}
