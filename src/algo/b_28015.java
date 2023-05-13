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
		
		int arr[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
			
//			System.out.println(test[i]);
		}
		int count = 0;
		 for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
           
                if (j + 1 < M && arr[i][j] != arr[i][j + 1]) {
                    count++;
                }
            }
        }

	        // º×Áú È½¼ö¸¦ 2·Î ³ª´« °ªÀ» Ãâ·Â
		
		// 2 2 1 2
		// 2 1 2 1 2 1 2 2
		// 2 2 1 1 1 0 2 2
//		 2 8
//		 2 1 2 1 2 1 2 2
//		 2 2 1 1 1 0 2 2
		
		System.out.println(count);
	}

	
}
