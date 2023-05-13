package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2847 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int arr_value = arr[N-1];
		int cnt = 0;
		for(int i=N-2; i>=0; i--) {
			int sub =  arr_value - arr[i];
			if(sub < 0) {
				cnt += Math.abs(sub) + 1;
				arr[i] -= Math.abs(sub) + 1;
			}else if(sub == 0) {
				cnt += 1;
				arr[i] -= 1;
			}
			arr_value = arr[i];
		}
		System.out.println(cnt);
	}

}
