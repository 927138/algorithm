package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int num[] = new int[3];
			for(int i=0; i<3; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num);
			if(num[1] == 0) break;
			
			if((num[0]*num[0] + num[1]*num[1]) == num[2]*num[2]) System.out.println("right");
			else System.out.println("wrong");
			
		}
	}
}
