package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[41][2];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<41; i++) {
			if(i == 0) {arr[i][0] = 1; arr[i][1] = 0;}
			else if(i == 1) {arr[i][0] = 0; arr[i][1] = 1;}
			else {
				arr[i][0] = arr[i-1][0] + arr[i-2][0];
				arr[i][1] = arr[i-1][1] + arr[i-2][1];
			}
		}
		
		for(int i=0; i<C; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(arr[num][0] + " " + arr[num][1]);
			 
		}
		
	}
	
	
}
