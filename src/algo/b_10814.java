package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		String arr[][] = new String[N][2];
		
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++) {
				arr[i][j] = st.nextToken();
			}
		}
		
		Arrays.sort(arr, new Comparator<String []>() {
			public int compare(String a1[], String a2[]) {
				return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
			}
		});
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
