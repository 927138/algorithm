package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			public int compare(int a1[], int a2[]) {
				if(a1[1] == a2[1]) return a1[0] - a2[0];
				return a1[1] - a2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int[] i : arr) {
			sb.append(i[0] + " " + i[1] +"\n");
		}
		System.out.println(sb);
	}

}
