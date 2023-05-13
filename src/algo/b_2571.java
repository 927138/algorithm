package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b_2571 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(array);
		
		for(int i=0; i<array.size(); i++) {
			sb.append(array.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
