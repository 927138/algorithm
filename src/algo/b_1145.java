package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1145 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		int idx = 1;
		
		while(cnt < 3) {
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(idx % arr[i] == 0) {
					cnt++;
				}
			}
			idx++;
		}
		System.out.println(idx-1);
	}

}
