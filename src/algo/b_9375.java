package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b_9375 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int M = Integer.parseInt(br.readLine());
			Map<String, Integer> m = new HashMap<>();
			
			for(int j=0; j<M; j++) {
				st = new StringTokenizer(br.readLine());
				
				String str1 = st.nextToken();
				String str2 = st.nextToken();

				m.put(str2, m.getOrDefault(str2, 0) + 1);
				
			}
			int day = 1;
			
			for(Map.Entry<String, Integer> j : m.entrySet()) {
				day *= (j.getValue()+1);
			}
			
			System.out.println(day-1);
		}
	}

}
