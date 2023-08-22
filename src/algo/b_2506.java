package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2506 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		int weight = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(st.nextToken());
			
			if(x == 1) {
				result += x + weight++;
			}else {
				weight = 0;
			}
		}
		System.out.println(result);
		
		
	}

}
