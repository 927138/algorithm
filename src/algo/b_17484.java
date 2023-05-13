package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_17484 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N][M];
		int value[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				value[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				
				if(i == 0) {
					value[i][j] = arr[i][j];
					continue;
				}
				else {
					if(j == 0) {
						for(int z=0; z<2; z++) {
							int sum = value[i-1][z] + arr[i][j];
							if(value[i][j] > sum) value[i][j] = sum;
//							System.out.println(sum);
						}
					}
					else if(j == M-1) {
						for(int z=j-1; z<M; z++) {
							int sum = value[i-1][z] + arr[i][j];
							if(value[i][j] > sum) value[i][j] = sum;
						}
					}
					else {
						
						for(int z=j-1; z<=j+1; z++) {
							System.out.print("i"+i+ " " +z + " ");
							 
							int sum = value[i-1][z] + arr[i][j];
							if(value[i][j] > sum) value[i][j] = sum;
							System.out.println(sum);
						}
					}
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<M; i++) {
			if(min > value[N-1][i]) min = value[N-1][i];
		}
		System.out.println(min+2);
	}
	
}
