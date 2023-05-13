package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b_1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Boolean> map = new HashMap<>();
		
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			map.put(str, false);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				map.replace(str, true);
			}
			System.out.println("dfdf");
		}
		System.out.println(map);
		
	}

}
