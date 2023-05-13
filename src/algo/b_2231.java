package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
	
		for(int i=0; i<=N; i++) {
			int sum = i;
			int num = i;
			
			while(true) {
				if(num<10) {
					sum += num;
					break;
				}else {
					sum += num%10;
					num = num/10;
				}
			}
			
			if(sum == N) {
				System.out.println(i);
				break;
			}
			if(i == N) {
				System.out.println(0);
				break;
			}
			
		}		
	}
}
