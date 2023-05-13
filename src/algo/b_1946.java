package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_1946 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int case_arr[][] = new int[N][2];
			for(int j=0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				case_arr[j][0] = Integer.parseInt(st.nextToken());
				case_arr[j][1] = Integer.parseInt(st.nextToken());
			}			
			Arrays.sort(case_arr, new Comparator<int []>() {
				public int compare(int a[], int b[]) {
					return a[0] - b[0];
				}
			});
			
			int num = case_arr[0][1];
			int count = 1;
			
			for(int j=1; j<N; j++) {
				if(num > case_arr[j][1]) {
					count++;
					num  = case_arr[j][1];
				}
			}

			System.out.println(count);
//			int count =0;
//			for(int j=0; j<N; j++) {
//				for(int z=j; z<N; z++) {
////					System.out.println(j + ", " + z);
//					if(j==0 && case_arr[j][1] > 1) break;
//					if(case_arr[j][1] < case_arr[z][1]) {
//						count++;
////						System.out.println(j + ", " + z);
//						System.out.println(case_arr[j][0]+", " +case_arr[j][1]);
//						break;
//					}
//					if(j==N-1 && case_arr[z][1] > 1) count++;
//				}
//			}
//			System.out.println(count);
		}
	}
}

