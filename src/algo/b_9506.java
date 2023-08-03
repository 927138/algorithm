package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b_9506 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == -1) break;
			
			sb = new StringBuilder();
			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;
			for(int i=1; i<N; i++) {
				if(N % i == 0) {
					list.add(i); sum += i;
				}
			}
//			System.out.println(N + ", " + sum);
			sb.append(N + " = ");
			if(sum == N) {
				for(int i=0; i<list.size(); i++) {
//					System.out.println(list.size());
					if(list.size()-1 == i) sb.append(list.get(i));
					else sb.append(list.get(i) + " + ");
				}
			}else sb.append("is NOT perfect.");
			
			System.out.println(sb);
		}
	}

}
