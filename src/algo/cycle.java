package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = Integer.parseInt(br.readLine());
		int num = result, count = 0;
		int x = num/10;
		int y = num%10;
				
		if(num < 10) {
			num *= 10;
			result *= 10;
		}
		while(true) {
			count++;
			x = num/10;
			y = num%10;
			
			num = y*10 + (x+y)%10;
			if(num == result) {
				System.out.println(count);
				break;
			}
		}
	}

}
