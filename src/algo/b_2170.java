package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b_2170 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			
			arr[i][0] = x1;
			arr[i][1] = x2;
		}
		Arrays.sort(arr, new Comparator<int []>(){
			public int compare(int a1[], int a2[]) {
				if(a1[0] == a2[0]) return a1[1] - a2[1];
				return a1[0] - a2[0];
			}
		});
		
		int len = 0;
		int x1 = arr[0][0];
		int x2 = arr[0][1];
		int idx = 1;
		while(true) {
			if(idx >= N) {
				len += x2 - x1;
				break;
			}
			
			if(x2 < arr[idx][0]) {
				len += x2 - x1;
				x1 = arr[idx][0];
				x2 = arr[idx][1];
			}else if(x2 >= arr[idx][0]) {
				if(x2 <= arr[idx][1]) x2 = arr[idx][1];
			}
//			System.out.println(x1 + "< " + x2);
			idx++;
		}
		System.out.println(len);
	}

}
