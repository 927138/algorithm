package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2775 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			int arr[][] = new int[K+1][N];
			
			for(int j=0; j<=K; j++) {
				for(int z=0; z<N; z++) {
					if(j==0)arr[j][z] = z+1;
					else if(z == 0) arr[j][z] = 1;
					else {
						arr[j][z] = arr[j-1][z] + arr[j][z-1];
//						for(int x=0; x<=z; x++) {
//							arr[j][z] += arr[j-1][x];
//						}
					}
				}
			}
			System.out.println(arr[K][N-1]);
			
			for(int j=0; j<=K; j++) {
				for(int z=0; z<N; z++) {
					System.out.print(arr[j][z]+" ");
				}
				System.out.println();
			}
		}
		
		
	}
}
