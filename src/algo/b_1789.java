package algo;

import java.io.IOException;
import java.util.Scanner;

public class b_1789 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long sum = 0;
		int count = 0;
		
		if(N == 1) count++;
		for(int i=1; i<N; i++) {
			sum += i;
			if(sum > N) break;
			else count++;
		}
		
		System.out.println(count);
	}

}
