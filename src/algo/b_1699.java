package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1699 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N+1];
		for(int i=1; i<N+1; i++) {
			if(i <= 3) {
				arr[i] = i;
				continue;
			}
			
			int x = (int) Math.sqrt(i);
			if((int)Math.pow(x, 2) == i) arr[i] = 1;
			else {
				arr[i] = Integer.MAX_VALUE;
				for(int j=1; j<=x; j++) {
					arr[i] = Math.min(arr[i], arr[(int)Math.pow(j, 2)] + arr[i-(int)Math.pow(j, 2)]);
				}
			}
		}
		System.out.println(arr[N]);
	}

}
