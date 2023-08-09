package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b_28431 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int arr[] = new int[10];
		
		for(int i=0; i<5; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[x]++;
			
			if(arr[x] == 2) arr[x] = 0;
		} 
		
		for(int i=0; i<10; i++) {
			if(arr[i] == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
