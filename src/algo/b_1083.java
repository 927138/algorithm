package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b_1083 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int start_index = 0;
		int limit = 0;
		int count = 0;
		while(true) {
			
			if(S - (N - start_index) >= 0) {
				System.out.println("if");
				limit = N - start_index - 1;
			}else {
				System.out.println("else");
				limit = S;
			}
			
			int max = 0;
			int x = 0; 
			for(int i=start_index; i<=limit; i++) {
				System.out.println(i);
				if(max < arr[i]) {
					x = i;
					max = arr[i];
				}
			}
			
			swap(arr, start_index, x);
			System.out.println(max + ", " + x);
			S -= x+1;
			count++;
			if(count > 1)break;
		}
		
		print(arr);
		
	}
	
	static void print(int arr[]) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i] + " ");
		}System.out.println(sb);
	}
	
	static void swap(int arr[], int x, int y) {
		int a = arr[x];
		arr[x] = arr[y];
		arr[y] = a;
	}

}
