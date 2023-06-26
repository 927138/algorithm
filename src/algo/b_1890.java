package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1890 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N+1][N+1];
		long result[][] = new long[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<N+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result[1][1] = 1;
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<N+1; j++) {
//				if(result[i][j] <= 0) continue;
				if(arr[i][j] == 0) break;
				
				int index = arr[i][j];
				
//				System.out.println(i + ", " + j);
//				System.out.println(i+"= " + (i+index) + ",  j = " + (j+index));
				if(i + index <= N) {
					result[i+index][j] += result[i][j];
//					System.out.println("dff" + result[i+index][j] + ", " + result[i][j]);
				}
				if(j + index <= N) {
					result[i][j+index] += result[i][j];
//					System.out.println("dfsssssf" + result[i][j+index] + ", " + result[i][j]);
				}
//				System.out.println(result[i][j]);
			}
			
		}
		
//		for(int i=1; i<N+1; i++) {
//			for(int j=1; j<N+1; j++) {
//				System.out.print(result[i][j]+ " ");
//			}
//			System.out.println();
//			
//		}
		
		System.out.println(result[N][N]);
		
	}

}
