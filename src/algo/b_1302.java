package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b_1302 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
			if(map.get(str) > max) max = map.get(str);
		}
		
		
		List<String> key = new ArrayList<>();
		for(Map.Entry<String, Integer> i : map.entrySet()) {
			if(i.getValue() == max) {
				key.add(i.getKey());
			}
		}
		Collections.sort(key);

		System.out.println(key.get(0));
	}

}
