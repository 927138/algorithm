package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_4948 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean visit[] = new boolean[123456*2 + 1];

		visit[0] = visit[1] = true;
		for(int i=2; i*i<visit.length; i++) {
			if(!visit[i]) {
				for(int j=i*2; j<visit.length; j+=i) visit[j] = true;
			}
		}

		while(true) {
			String str = br.readLine();
			if(str.equals("0")) break;
			
			int value = Integer.parseInt(str);
			int count = 0;
			for(int i=value+1; i<=value*2; i++) {
				if(!visit[i]) count++;
			}
			sb.append(count + "\n");
		}
		System.out.println(sb);
	}

}
