package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b_14425 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> s = new HashSet<>();
		for(int i=0; i<N; i++) {
			s.add(br.readLine());
		}
		
		int count = 0;
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			
			if(s.contains(str)) count++;
		}
		
		System.out.println(count);
	}

}
