package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class b_25192 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			String x = br.readLine();
			
			if(x.equals("ENTER")) {
				sum += set.size(); 
				set = new HashSet<>();
				continue;
			}
			
			set.add(x);
		}
		
		System.out.println(sum+set.size());
	}

}
