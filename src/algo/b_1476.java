package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1476 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int time[] = new int[st.countTokens()];
		int count = 1;
		
		for(int i=0; i<time.length; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {			
			if(time[0] == 1 && time[1] == 1 && time[2] ==1) break;
			
			for(int i=0; i<time.length; i++) time[i]--;
						
			if(time[0] < 1) time[0] = 15;
			if(time[1] < 1) time[1] = 28;
			if(time[2] < 1) time[2] = 19;
			count++;
		}
		
		System.out.println(count);
	}

}
