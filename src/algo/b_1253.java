package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1253 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}Arrays.sort(arr);
	
		   
		int count = 0;
		for(int i=0; i<N; i++) {
			int l = 0;
			int r = N-1;
			while(true) {
//				System.out.print(i + " :: ");
//				System.out.println(l + " " + r + " " + count);
				
				if(l == i) l++;
				else if(r == i) r--;
				
				if(l >= r) break;
//				System.out.println(arr[i] + " , " + sum);
				
				int sum = arr[l] + arr[r]; 
				if(sum > arr[i]) {r--;}
				else if(sum < arr[i]) {l++;}
				else if(sum == arr[i]){
//					System.out.println(i + "ssss   " + l + " " + r);
					count++;
					break;
				}
				
				
			}
			
		}System.out.println(count);
	}

}
