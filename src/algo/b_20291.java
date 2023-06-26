package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b_20291 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> m = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			String arr[] = str.split("[.]");
			
			m.put(arr[1], m.getOrDefault(arr[1], 0) + 1);
		}
		
		List<String> list = new ArrayList<>(m.keySet());
		Collections.sort(list);
		
		for(String key : list) {
			sb.append(key + " " + m.get(key)+"\n");
		}
		System.out.println(sb);
	}

}
