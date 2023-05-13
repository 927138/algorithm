package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_1049 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[M][2];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			if(min > arr[i][1]) min = arr[i][1];
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int x[], int x2[]) {
				return x[0] - x2[0];
			}
		});
		
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i<=(N/6)+1; i++) {
			int mod = N - (6*i);
			int value = 0;
			
			if(mod < 0) value = arr[0][0]*i;
			else value = arr[0][0]*i + mod*min;
			
			if(result > value)
				result = value; 
		}
		System.out.println(result);
		
	}

}
