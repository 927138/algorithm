package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1080 {
	
	private static int count = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int matrix1[][] = new int[N][M];
		int matrix2[][] = new int[N][M];
				
		// matrix1
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				matrix1[i][j] = str.charAt(j) - '0';
			}
		}
		
		// matrix2
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				matrix2[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<N-2; i++) {
			for(int j=0; j<M-2; j++) {
				check_trans(matrix1, matrix2, i, j);
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(matrix1[i][j] != matrix2[i][j]) {
					System.out.println(-1); 
					return;
				}
			}
		}
				
		System.out.println(count);
	}
	
	static void trans(int arr[][], int x, int y) {
		for(int i=x; i<x+3; i++) {
			for(int j=y; j<y+3; j++) {
				if(arr[i][j] == 0) arr[i][j] = 1;
				else arr[i][j] = 0;
			}
		}
	}
	
	static void check_trans(int arr1[][], int arr2[][], int x, int y) {		
		for(int i=x; i<x+3; i++) {
			for(int j=y; j<y+3; j++) {
				if(arr1[i][j] != arr2[i][j]) {
					if(i >= arr1.length-2 || j >= arr1[0].length-2) break;
					trans(arr1, i, j);
					count++;
				}
			}
		}
	}
	
}
