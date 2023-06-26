package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;

public class b_4358 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		TreeMap<String, Integer> tree = new TreeMap<>();
		int total = 0;
		
		while(true) {
			String str = br.readLine();
			if(str==null || str.equals("")) break;
			
			tree.put(str, tree.getOrDefault(str, 0) + 1);
			total++;
		}
		
		for(Entry<String, Integer> entry : tree.entrySet()) {
			double num = (double)entry.getValue() / total * 100;
			sb.append(entry.getKey() + " " + String.format("%.4f", num) +"\n");
			
		}
		System.out.println(sb);
	}

}
