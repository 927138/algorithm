package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b_25206 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		Map<String, Double> grade = new HashMap<>();
		grade.put("A+", 4.5);
		grade.put("A0", 4.0);
		grade.put("B+", 3.5);
		grade.put("B0", 3.0);
		grade.put("C+", 2.5);
		grade.put("C0", 2.0);
		grade.put("D+", 1.5);
		grade.put("D0", 1.0);
		grade.put("F", 0.0);
		
		int line = 20;
		double hap1 = 0;
		double hap2 = 0;
		for(int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			double x = Double.parseDouble(st.nextToken());
			String key = st.nextToken();
			
			if(!grade.containsKey(key)) continue;
			
			hap1 += x;
			hap2 += x * grade.get(key);
			
		}
		
		System.out.println(String.format("%.6f", hap2/hap1));
	}

}
