package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b_10101 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		HashSet<Integer> s = new HashSet<>();
		
		for(int i=0; i<3; i++) {
			int x = Integer.parseInt(br.readLine());
			sum += x;
			
			s.add(x);
		}
		
		if(sum == 180) {
			if(s.size() == 1) System.out.println("Equilateral"); 
			else if(s.size() == 2) System.out.println("Isosceles");
			else System.out.println("Scalene");
		}else {
			System.out.println("Error");
		}
	}

}
