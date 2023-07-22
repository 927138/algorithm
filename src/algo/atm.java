package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class atm {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int x = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[x][2];
		int arr1[] = new int[x];
		
		for(int i=0; i<x; i++) {
			st = new StringTokenizer(br.readLine());
//			arr1[i] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int []>() {
			public int compare(int[] a1, int[] a2) {
				System.out.println(a1[0] + ", " + a1[1] + " : ");
				System.out.println(a2[0] + ", " + a2[1] + " : ");
				if(a1[0] == a2[0]) return a1[1] - a2[1];
				return a1[0] - a2[0]; 
			
			}
		});
		for(int i=0; i<x; i++) {
			System.out.println(arr[i][0] + ", " + arr[i][1]);
		}
	}
	
}
