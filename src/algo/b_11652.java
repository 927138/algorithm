package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class b_11652 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<Long, Integer> map = new HashMap<>();
		int max = 0;
		long idx = Long.MAX_VALUE;
		for(int i=0;i<N;i++) {
			
			Long x = Long.parseLong(br.readLine());
			
			map.put(x, map.getOrDefault(x, 0) + 1);
			if(max < map.get(x)) {
				idx = x;
				max = map.get(x);
			}else if(max == map.get(x)) {
				idx = Math.min(idx, x);
			}
		}
		System.out.println(idx);
	}

}
