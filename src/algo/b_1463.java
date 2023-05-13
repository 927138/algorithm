package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
				
		arr[0] = 1;
		for(int i=1; i<arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = i/2;
				System.out.print("df ");
			}else if(i % 3 == 0) {
				arr[i] = i/3;
				System.out.print("dfdf+ ");
			}
			System.out.println(i + ", " + arr[i]);
		}
		
	}

}
